package Array450DSA;

import java.util.Arrays;
import java.util.Scanner;

public class Merge2SortedArrayWithoutExtraSpace {
    public static void merge(int arr1[], int arr2[], int n, int m)
    {
        int firstArray = n-1;
        int secondArray=0;
        while(firstArray>=0 && secondArray<m) {
            if(arr1[firstArray] > arr2[secondArray]) {
                int emp = arr1[firstArray];
                arr1[firstArray] = arr2[secondArray];
                arr2[secondArray] = emp;
                firstArray--;
                secondArray++;

            } else{
                firstArray--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int arr1[] = new int[size];
        for(int i=0;i<size;i++) {
            arr1[i] = sc.nextInt();
        }

        int size1 = sc.nextInt();
        int arr2[] = new int[size1];
        for(int i=0;i<size1;i++) {
            arr2[i] = sc.nextInt();
        }
        merge(arr1, arr2, size, size1);
        for(int i=0;i<size;i++) {
            System.out.print(arr1[i] + " ");
        }
        for(int i=0;i<size1;i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
