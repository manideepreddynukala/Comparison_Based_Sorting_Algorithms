import java.util.Random;
import java.util.Scanner;

public class Sorting_Algorithm {
    public static void main(String args[]){
        int range, n;
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of the random array you want to sort");
        n = scan.nextInt();
        System.out.println("enter the range of the elements");
        range = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(range);
        }
        long begin = System.nanoTime();
        System.out.println("Elements before sorting");
        for(int i:arr)
            System.out.print(i+" "); //printing array before sorting

        System.out.println("\n\nEnter the sorting algorithm you want to implement (1-5)\n1.Insertion Sort\n2.Merge Sort\n3.Inplace Quick Sort\n4.Median of three Quick Sort\n5.Quick Sort with Insertion Sort");
        Scanner inp = new Scanner(System.in);
        int sort_kind = inp.nextInt();
            if (sort_kind == 1) {
                Insertion_Sort IS = new Insertion_Sort();
                IS.sort(arr);
            } else if (sort_kind == 2) {
                Merge_Sort MS = new Merge_Sort();
                MS.sort(arr, 0, arr.length - 1);
            } else if (sort_kind == 3) {
                Quick_Sort_Inplace QSIP = new Quick_Sort_Inplace();
                QSIP.sort(arr, 0, arr.length - 1);
            } else if (sort_kind == 4) {
                Quick_Median_Of_Three QMOT = new Quick_Median_Of_Three();
                QMOT.sort(arr,0,arr.length-1);
            }
            else if (sort_kind == 5) {
                Quick_Small_Subproblem QSS = new Quick_Small_Subproblem();
                QSS.sort(arr,0,arr.length-1);
            }
            else return;

        System.out.println("\nElements after sorting");
        for(int i:arr)
            System.out.print(i+" ");//printing the array after sorting
        System.out.println();

        long end = System.nanoTime();
        long totalTime = end - begin; //computes the total time consumed to run the code
        System.out.println("Total time in micro seconds:"+totalTime/1000000);
    }
}
