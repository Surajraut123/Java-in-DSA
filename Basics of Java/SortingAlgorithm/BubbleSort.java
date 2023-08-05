package SortingAlgorithm;

import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(int arr[], int n) {
        boolean check = false;
        for(int i=1;i<n;i++) {
            for(int j=0;j<n-i;j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    check = true;
                }
            }
            if(!check) {
                break;
            }
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

        bubbleSort(arr, size);
        System.out.println("Sorted Array : ");
        for(int i=0;i<size;i++) {
            System.out.println(arr[i]);
        }
    }
}
