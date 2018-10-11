import java.util.Random;
import java.util.Scanner;

public class Quick_Median_Of_Three {
    public static void sort(int[] inputArray, int left, int right) {
        if (right-left < 3) {
            Insertion_Sort IS = new Insertion_Sort(); //insertion sort if array length is <3
            IS.sort(inputArray);
        } else {
            double median = medianOfThree(inputArray, left, right);
            int partition = partition(inputArray, left, right, median);
            sort(inputArray, left, partition - 1);
            sort(inputArray, partition + 1, right);
        }
    }

    public static int medianOfThree(int[] inputArray, int left, int right) { //median of three logic
        int center = (left + right) / 2;

        if (inputArray[left] > inputArray[center])
            swap(inputArray, left, center);

        if (inputArray[left] > inputArray[right])
            swap(inputArray, left, right);

        if (inputArray[center] > inputArray[right])
            swap(inputArray, center, right);

        swap(inputArray, center, right - 1); //swapping center with right-1 position
        return inputArray[right - 1];
    }

    public static void swap(int[] inputArray, int a, int b) {
        int temp = inputArray[a];
        inputArray[a] = inputArray[b];
        inputArray[b] = temp;
    }

    public static int partition(int[] inputArray, int left, int right, double pivot) {
        int leftTemp = left;
        int rightTemp = right - 1;

        while (true) {
            while (inputArray[++leftTemp] < pivot)
                ;
            while (inputArray[--rightTemp] > pivot)
                ;
            if (leftTemp >= rightTemp)
                break;
            else
                swap(inputArray, leftTemp, rightTemp);
        }
        swap(inputArray, leftTemp, right - 1);
        return leftTemp;
    }
}