import java.util.Random;
import java.util.Scanner;

public class Insertion_Sort {

    public void sort(int inputArray[]) {
        for (int j = 1; j < inputArray.length; j++) {
            int key = inputArray[j];
            int i = j - 1;
            while (i >= 0 && inputArray[i] > key) //If the elements in the array are greater than key, we will move them to the right by 1 position
            {
                inputArray[i + 1] = inputArray[i]; //moving to right by one position
                i = i - 1;
            }
            inputArray[i + 1] = key; // Inserting the key at correct position
        }
    }
}