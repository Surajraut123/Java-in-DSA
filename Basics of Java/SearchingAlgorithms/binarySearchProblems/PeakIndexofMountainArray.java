package SearchingAlgorithms.binarySearchProblems;

import java.util.Scanner;

public class PeakIndexofMountainArray {
    public static void main(String []args) {
        //4 5 6 0 1 2 3 out : 6, must be sort
        System.out.println("Enter the Size of array");
        Scanner sc = new Scanner(System.in);

        int sizeOfArray = sc.nextInt();
        int arr[] = new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++) {
            arr[i] = sc.nextInt();
        }

        //The below solutions we can apply binary search only if array is mountain format


        //Here guarantee is array is mountain like 3 4 5 6 7 1 2 3
//        not like 5 6 7 1 2 3 4
        binarySearch(arr, sizeOfArray);
//        peakByPointing0thPosition(arr, sizeOfArray);
    }
    public static void binarySearch(int[] arr, int n) {
        int i=0;
        int j=n-1;
        int mid = 0;
        while(i<j) {
            mid = (i+j)/2;
            if(arr[mid] < arr[mid+1]) {
                i=mid+1;
            } else {
                j=mid;
            }

        }
        System.out.println("Peak Element is : " + arr[j]);
    }

    public static void peakByPointing0thPosition(int[] arr, int n) {
        int i=0;
        int j=n-1;
        int mid=0;
        while(i<j) {
            mid=(i+j)/2;
            if(arr[0] < arr[mid]) {
                i=mid;
            } else{
                j=mid-1;
            }
        }
        System.out.println("Answer : " + arr[i]);
    }
}