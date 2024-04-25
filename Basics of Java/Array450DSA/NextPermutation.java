package Array450DSA;

import java.util.Scanner;

public class NextPermutation {

    public static void nextPermutation(int[] arr, int size) {
        int index = -1;
        for(int i=size-2;i>=0;i--) {
            if(arr[i] < arr[i+1]) {
                index = i;
                break;
            }
        }
        if(index==-1) {
            reverse(arr, 0, size-1);
        }

        for(int i=size-1;i>index;i--) {
            if(arr[i] > arr[index]) {
                swap(arr, i, index);
                break;
            }
        }
        reverse(arr, index+1, size-1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while(start<=end) {
            swap(arr, start++, end--);
        }
    }

    public static void swap(int[] arr, int k, int b) {
        int tmp = arr[k];
        arr[k] = arr[b];
        arr[b] = tmp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for( int i=0;i<size;i++) arr[i] = sc.nextInt();

        nextPermutation(arr, size);
        for( int i=0;i<size;i++) System.out.print(arr[i] + " ");
    }
}