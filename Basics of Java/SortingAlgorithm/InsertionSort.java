package SortingAlgorithm;

import java.util.Scanner;

public class InsertionSort {

    public static void insertionSort(int arr[], int size) {
        for(int i=1;i<size;i++) {
            int tmp = arr[i];
            int j=i-1;
            for(;j>=0;j--) {
                if(arr[j] > tmp) {
                    arr[j+1] = arr[j];
                } else{
                    break;
                }
            }
            arr[j+1] = tmp;
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

        insertionSort(arr, size);
        System.out.println("Sorted Array : ");
        for(int i=0;i<size;i++) {
            System.out.println(arr[i]);
        }
    }
}
