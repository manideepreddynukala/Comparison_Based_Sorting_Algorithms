import java.util.Arrays;
import java.util.Collections;

public class Sorted_ReverseSorted {
    public static void main(String args[]) {
        int arr[] = {2, 3, 6, 7, 8, 9, 10, 12, 12, 14, 16, 17, 18, 19, 21, 21, 23, 24, 24, 25, 27, 28, 28, 28, 28, 28, 29, 31, 32, 32, 34, 34, 39, 39, 39, 40, 40, 41, 44, 46, 49, 49, 50, 51, 51, 54, 56, 58, 59, 59, 60, 60, 63, 64, 64, 65, 65, 65, 66, 67, 70, 70, 71, 72, 74, 74, 76, 76, 76, 76, 78, 79, 81, 82, 83, 84, 85, 86, 87, 87, 87, 88, 88, 89, 90, 90, 90, 95, 98, 99, 100, 100, 100, 101, 101, 103, 103, 106, 106, 108, 108, 110, 111, 112, 113, 114, 115, 116, 116, 117, 118, 119, 119, 120, 121, 122, 122, 123, 123, 124, 124, 124, 128, 128, 131, 132, 132, 135, 135, 136, 144, 144, 145, 146, 147, 147, 149, 150, 151, 151, 151, 151, 152, 154, 154, 154, 154, 155, 156, 156, 159, 160, 161, 162, 164, 164, 164, 164, 165, 166, 167, 168, 168, 169, 171, 172, 173, 173, 174, 174, 174, 175, 175, 177, 179, 180, 181, 183, 184, 185, 187, 189, 189, 189, 190, 190, 190, 194, 195, 195, 195, 195, 195, 197, 197, 198, 199, 200, 200, 202, 202, 203, 203, 204, 204, 206, 206, 207, 208, 208, 211, 212, 212, 212, 213, 213, 214, 216, 217, 218, 218, 218, 220, 223, 224, 225, 225, 225, 227, 227, 227, 228, 229, 229, 230, 231, 232, 234, 234, 234, 234, 235, 235, 238, 240, 242, 242, 244, 244, 245, 248, 248, 250, 251, 251, 251, 252, 253, 255, 255, 255, 256, 257, 257, 259, 260, 262, 262, 263, 263, 264, 266, 268, 268, 269, 269, 271, 271, 272, 272, 272, 273, 274, 274, 275, 276, 280, 281, 283, 286, 288, 288, 289, 289, 290, 291, 294, 295, 295, 298, 301, 301, 303, 304, 304, 305, 307, 308, 308, 309, 309, 309, 309, 310, 311, 313, 314, 315, 316, 316, 317, 317, 318, 318, 320, 320, 320, 321, 321, 322, 323, 324, 325, 326, 327, 327, 329, 331, 333, 334, 335, 337, 338, 339, 340, 340, 340, 342, 342, 343, 344, 344, 345, 345, 345, 346, 346, 347, 348, 348, 349, 351, 351, 352, 352, 352, 355, 356, 358, 358, 361, 361, 361, 362, 363, 364, 365, 365, 365, 366, 366, 367, 368, 368, 368, 369, 370, 371, 371, 372, 373, 375, 378, 378, 379, 380, 380, 380, 384, 386, 389, 390, 391, 391, 392, 392, 394, 394, 396, 397, 400, 400, 400, 401, 402, 406, 408, 415, 417, 419, 419, 421, 422, 422, 424, 424, 426, 428, 429, 430, 430, 431, 431, 434, 435, 437, 439, 439, 443, 444, 446, 447, 449, 451, 451, 452, 453, 453, 454, 456, 456, 458, 458, 459, 460, 460, 461, 463, 463, 464, 464, 465, 465, 467, 467, 468, 470, 471, 472, 472, 473, 473, 474, 474, 475, 475, 476, 478, 479, 479, 483, 484, 485, 485, 486, 488, 489, 490, 491, 492, 492, 492, 492, 493, 494, 494, 494, 497, 498, 499};
        int brr[] = {499, 498, 497, 494, 494, 494, 493, 492, 492, 492, 492, 491, 490, 489, 488, 486, 485, 485, 484, 483, 479, 479, 478, 476, 475, 475, 474, 474, 473, 473, 472, 472, 471, 470, 468, 467, 467, 465, 465, 464, 464, 463, 463, 461, 460, 460, 459, 458, 458, 456, 456, 454, 453, 453, 452, 451, 451, 449, 447, 446, 444, 443, 439, 439, 437, 435, 434, 431, 431, 430, 430, 429, 428, 426, 424, 424, 422, 422, 421, 419, 419, 417, 415, 408, 406, 402, 401, 400, 400, 400, 397, 396, 394, 394, 392, 392, 391, 391, 390, 389, 386, 384, 380, 380, 380, 379, 378, 378, 375, 373, 372, 371, 371, 370, 369, 368, 368, 368, 367, 366, 366, 365, 365, 365, 364, 363, 362, 361, 361, 361, 358, 358, 356, 355, 352, 352, 352, 351, 351, 349, 348, 348, 347, 346, 346, 345, 345, 345, 344, 344, 343, 342, 342, 340, 340, 340, 339, 338, 337, 335, 334, 333, 331, 329, 327, 327, 326, 325, 324, 323, 322, 321, 321, 320, 320, 320, 318, 318, 317, 317, 316, 316, 315, 314, 313, 311, 310, 309, 309, 309, 309, 308, 308, 307, 305, 304, 304, 303, 301, 301, 298, 295, 295, 294, 291, 290, 289, 289, 288, 288, 286, 283, 281, 280, 276, 275, 274, 274, 273, 272, 272, 272, 271, 271, 269, 269, 268, 268, 266, 264, 263, 263, 262, 262, 260, 259, 257, 257, 256, 255, 255, 255, 253, 252, 251, 251, 251, 250, 248, 248, 245, 244, 244, 242, 242, 240, 238, 235, 235, 234, 234, 234, 234, 232, 231, 230, 229, 229, 228, 227, 227, 227, 225, 225, 225, 224, 223, 220, 218, 218, 218, 217, 216, 214, 213, 213, 212, 212, 212, 211, 208, 208, 207, 206, 206, 204, 204, 203, 203, 202, 202, 200, 200, 199, 198, 197, 197, 195, 195, 195, 195, 195, 194, 190, 190, 190, 189, 189, 189, 187, 185, 184, 183, 181, 180, 179, 177, 175, 175, 174, 174, 174, 173, 173, 172, 171, 169, 168, 168, 167, 166, 165, 164, 164, 164, 164, 162, 161, 160, 159, 156, 156, 155, 154, 154, 154, 154, 152, 151, 151, 151, 151, 150, 149, 147, 147, 146, 145, 144, 144, 136, 135, 135, 132, 132, 131, 128, 128, 124, 124, 124, 123, 123, 122, 122, 121, 120, 119, 119, 118, 117, 116, 116, 115, 114, 113, 112, 111, 110, 108, 108, 106, 106, 103, 103, 101, 101, 100, 100, 100, 99, 98, 95, 90, 90, 90, 89, 88, 88, 87, 87, 87, 86, 85, 84, 83, 82, 81, 79, 78, 76, 76, 76, 76, 74, 74, 72, 71, 70, 70, 67, 66, 65, 65, 65, 64, 64, 63, 60, 60, 59, 59, 58, 56, 54, 51, 51, 50, 49, 49, 46, 44, 41, 40, 40, 39, 39, 39, 34, 34, 32, 32, 31, 29, 28, 28, 28, 28, 28, 27, 25, 24, 24, 23, 21, 21, 19, 18, 17, 16, 14, 12, 12, 10, 9, 8, 7, 6, 3, 2};

        long Ins_begin_time = System.nanoTime();
        Insertion_Sort obji = new Insertion_Sort();
        obji.sort(arr);
        long Ins_end_time = System.nanoTime();
        long Ins_total_time = Ins_end_time - Ins_begin_time;
        System.out.println("\nTime consumption for Insertion sort (sorted) is:" + Ins_total_time);

        long Mer_begin_time = System.nanoTime();
        Merge_Sort objm = new Merge_Sort();
        objm.sort(arr, 0, arr.length - 1);
        long Mer_end_time = System.nanoTime();
        long Mer_total_time = Mer_end_time - Mer_begin_time;
        System.out.println("Time consumption for Merge sort (sorted) is:" + Mer_total_time);

        long Quick_begin_time = System.nanoTime();
        Quick_Sort_Inplace objq = new Quick_Sort_Inplace();
        objq.sort(arr, 0, arr.length - 1);
        long Quick_end_time = System.nanoTime();
        long Quick_total_time = Quick_end_time - Quick_begin_time;
        System.out.println("Time consumption for Inplace Quick sort (sorted) is:" + Quick_total_time);

        long QMed_begin_time = System.nanoTime();
        Quick_Median_Of_Three objm3 = new Quick_Median_Of_Three();
        objm3.sort(arr, 0, arr.length - 1);
        long QMed_end_time = System.nanoTime();
        long QMed_total_time = QMed_end_time - QMed_begin_time;
        System.out.println("Time consumption for Quick sort with median of three (sorted) is:" + QMed_total_time);

        long QIns_begin_time = System.nanoTime();
        Quick_Small_Subproblem objqss = new Quick_Small_Subproblem();
        objqss.sort(arr, 0, arr.length - 1);
        long QIns_end_time = System.nanoTime();
        long QIns_total_time = QIns_end_time - QIns_begin_time;
        System.out.println("Time consumption for Quick sort with insertion sort (sorted) is:" + QIns_total_time);




        long Ins_begin_time2 = System.nanoTime();
        Insertion_Sort obji2 = new Insertion_Sort();
        obji2.sort(brr);
        long Ins_end_time2 = System.nanoTime();
        long Ins_total_time2 = Ins_end_time2 - Ins_begin_time2;
        System.out.println("\nTime consumption for Insertion sort (reversly sorted) is:" + Ins_total_time2);

        long Mer_begin_time2 = System.nanoTime();
        Merge_Sort objm2 = new Merge_Sort();
        objm2.sort(brr, 0, brr.length - 1);
        long Mer_end_time2 = System.nanoTime();
        long Mer_total_time2 = Mer_end_time2 - Mer_begin_time2;
        System.out.println("Time consumption for Merge sort (reversly sorted) is:" + Mer_total_time2);

        long Quick_begin_time2 = System.nanoTime();
        Quick_Sort_Inplace objq2 = new Quick_Sort_Inplace();
        objq2.sort(brr, 0, brr.length - 1);
        long Quick_end_time2 = System.nanoTime();
        long Quick_total_time2 = Quick_end_time2 - Quick_begin_time2;
        System.out.println("Time consumption for Inplace Quick sort (reversly sorted) is:" + Quick_total_time2);

        long QMed_begin_time2 = System.nanoTime();
        Quick_Median_Of_Three objm32 = new Quick_Median_Of_Three();
        objm32.sort(brr, 0, brr.length - 1);
        long QMed_end_time2 = System.nanoTime();
        long QMed_total_time2 = QMed_end_time2 - QMed_begin_time2;
        System.out.println("Time consumption for Quick sort with median of three (reversly sorted) is:" + QMed_total_time2);

        long QIns_begin_time2 = System.nanoTime();
        Quick_Small_Subproblem objqss2 = new Quick_Small_Subproblem();
        objqss2.sort(brr, 0, brr.length - 1);
        long QIns_end_time2 = System.nanoTime();
        long QIns_total_time2 = QIns_end_time2 - QIns_begin_time2;
        System.out.println("Time consumption for Quick sort with insertion sort (reversly sorted) is:" + QIns_total_time2);
    }
}