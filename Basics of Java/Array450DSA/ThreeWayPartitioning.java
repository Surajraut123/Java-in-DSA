package Array450DSA;

import java.util.Scanner;

public class ThreeWayPartitioning {

    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }

    public static void threeWayPartitioning(int []arr, int size, int lowVal, int highVal) {
        int n = arr.length;
        int start = 0, end = n - 1;
        for (int i = 0; i <= end;) {
            if (arr[i] < lowVal) {
                if (i == start) {
                    start++;
                    i++;
                }
                else
                    swap(arr[i++], arr[start++]);
            }
            else if (arr[i] > highVal)
                swap(arr[i], arr[end--]);

            else
                i++;
        }
        for(int i : arr) {
            System.out.println(i);
        }
    }


    public static void main(String[] args) {

        /*Problems :
        * Given an array of size n and a range [a, b]. The task is to partition the array around the range such that array is divided into three parts.
        1) All elements smaller than a come first.
        2) All elements in range a to b come next.
        3) All elements greater than b appear in the end.
        The individual elements of three sets can appear in any order. You are required to return the modified array.
        Note: The generated output is 1 if you modify the given array successfully.
        *
        *
        * Here we have arrange elements such that all the some
        * */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++) arr[i] = sc.nextInt();
        int lowval = sc.nextInt();
        int highval = sc.nextInt();

        threeWayPartitioning(arr, size, lowval, highval);
    }
}
