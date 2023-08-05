package arrays;

import java.util.Scanner;

public class MergeTwoSortedArray {

    public static void mergeTwoArray(int arr1[], int size1, int arr2[], int size2) {
        int result[] = new int[size1 + size2];
        int i=0;
        int j=0;
        int k=0;
        while(i<size1 && j<size2) {
            if(arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else if(arr1[i] > arr2[j]) {
                result[k++] = arr2[j++];
            } else{
                result[k++] = arr1[i++];
                j++;
            }
        }
        while(i<size1) {
            result[k++] = arr1[i++];
        }
        while(j<size2) {
            result[k++] = arr2[j++];
        }

        System.out.println("Sorted Array : ");
        for(int p=0;p<k;p++) {
            System.out.println(result[p]);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the arr Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the element first array : ");
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the arr1 Size : ");
        int size1 = sc.nextInt();
        int arr1[] = new int[size1];

        System.out.println("Enter the element Second array : ");
        for(int i=0;i<size1;i++) {
            arr1[i] = sc.nextInt();
        }

        mergeTwoArray(arr, size, arr1, size1);

    }
}
