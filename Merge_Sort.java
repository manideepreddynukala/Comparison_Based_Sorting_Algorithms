import java.util.Random;
import java.util.Scanner;

public class Merge_Sort {
    public void sort(int inputArray[],int left, int right) {
        if (left < right) {
            int center = left + (right - left) / 2;
            sort(inputArray,left, center); //left subarray
            sort(inputArray,center + 1, right); //right subarray
            merge(inputArray,left, center, right); //merging the two halfs
        }
    }

    private void merge(int inputArray[],int left, int center, int right) {
        int[] temp = new int[inputArray.length];
        for (int i = left; i <= right; i++) {
            temp[i] = inputArray[i];
        }
        int i = left;
        int j = center + 1;
        int k = left;
        while (i <= center && j <= right) {
            if (temp[i] <= temp[j]) {
                inputArray[k] = temp[i];
                i++;
                k++;
            } else {
                inputArray[k] = temp[j];
                j++;
                k++;
            }
        }
        while (i <= center) {  //rest of the elements of left subarray
            inputArray[k] = temp[i];
            k++;
            i++;
        }
        while (j <= right) {
            inputArray[k] = temp[j]; //rest of the elements of the right subarray
            k++;
            j++;
        }

    }
}
