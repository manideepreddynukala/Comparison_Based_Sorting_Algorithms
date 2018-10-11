import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Quick_Sort_Inplace
{
    public void sort(int inputArray[], int leftIndex, int rightIndex) {
        if (rightIndex > leftIndex) {
            int i = leftIndex, j = rightIndex;
            int tempSwap=0;
            // taking the last element as Pivot
            int pivot = inputArray[rightIndex];
            do {
                //Increment i value until inputArray[i] value greater than pivot
                while (inputArray[i] < pivot)
                    i++;
                //Decrement j value until inputArray[j] value is less than pivot
                while (inputArray[j] > pivot)
                    j--;
                // if i index value is less than or equal to j index value then SWAP the elements
                if (i <= j) {
                    tempSwap = inputArray[j];
                    inputArray[j] = inputArray[i];
                    inputArray[i] = tempSwap;
                    i++;
                    j--;
                }
            } while (i <= j); // continue until index i value is less than j value
            if (leftIndex < j) {
                sort(inputArray, leftIndex, j); // sorts the left subarray before the pivot
            }
            if (i < rightIndex) {
                sort(inputArray, i, rightIndex); //sorts the right subarray after the pivot
            }
        }
    }
}