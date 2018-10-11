import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;
public class Performance {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(size);
        }
        long begin = System.nanoTime();
        System.out.println("Elements before sorting");
        for(int i:arr){
            System.out.print(i+" ");
        }; //printing array before sorting

        long Ins_begin_time = System.nanoTime();
        Insertion_Sort obji = new Insertion_Sort();
        obji.sort(arr);
        long Ins_end_time = System.nanoTime();
        long Ins_total_time = Ins_end_time - Ins_begin_time;
        System.out.println("\nTime consumption for Insertion sort is:"+Ins_total_time);

        long Mer_begin_time = System.nanoTime();
        Merge_Sort objm = new Merge_Sort();
        objm.sort(arr,0,arr.length-1);
        long Mer_end_time = System.nanoTime();
        long Mer_total_time = Mer_end_time - Mer_begin_time;
        System.out.println("Time consumption for Merge sort is:"+Mer_total_time);

        long Quick_begin_time = System.nanoTime();
        Quick_Sort_Inplace objq = new Quick_Sort_Inplace();
        objq.sort(arr,0,arr.length-1);
        long Quick_end_time = System.nanoTime();
        long Quick_total_time = Quick_end_time - Quick_begin_time;
        System.out.println("Time consumption for Inplace Quick sort is:"+Quick_total_time);

        long QMed_begin_time = System.nanoTime();
        Quick_Median_Of_Three objm3 = new Quick_Median_Of_Three();
        objm3.sort(arr,0,arr.length-1);
        long QMed_end_time = System.nanoTime();
        long QMed_total_time = QMed_end_time - QMed_begin_time;
        System.out.println("Time consumption for Quick sort with median of three is:"+QMed_total_time);

        long QIns_begin_time = System.nanoTime();
        Quick_Small_Subproblem objqss = new Quick_Small_Subproblem();
        objqss.sort(arr,0,arr.length-1);
        long QIns_end_time = System.nanoTime();
        long QIns_total_time = QIns_end_time - QIns_begin_time;
        System.out.println("Time consumption for Quick sort with insertion sort is:"+ QIns_total_time);
    }
}
