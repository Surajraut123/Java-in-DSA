package SortingAlgorithm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(int arr[], int n) {

        for(int i=0;i<n-1;i++) {
            int minIndex = i;
            for(int j=i+1;j<n;j++) {
                if(arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the element : ");
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        selectionSort(arr, size);
        System.out.println("Sorted Array : ");
        for(int i=0;i<size;i++) {
            System.out.println(arr[i]);
        }
    }
}
