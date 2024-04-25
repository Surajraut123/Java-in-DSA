package Array450DSA;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseAArray {

    public static void reverseArray(int[] arr, int size) {
        int s=0;
        int end=arr.length-1;
        while(s<=end) {
            int tmp = arr[s];
            arr[s] = arr[end];
            arr[end] = tmp;
            s++;
            end--;
        }
        for(int i=0;i<size;i++) System.out.print(arr[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++) arr[i] = sc.nextInt();

        reverseArray(arr, size);
    }
}
