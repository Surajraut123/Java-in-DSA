package SearchingAlgorithms.binarySearchProblems;

import java.util.Scanner;

public class SearchElementinRotatedAndSortedArray {
    public static int getPivot(int arr[], int n) {
        int i=0, j=n-1;
        int mid = 0;
        while(i<j) {
            mid = (i+j)/2;
            if(arr[mid]>arr[0]) {
                i=mid+1;
            }
            else{
                j=mid;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        System.out.println("Enter the Size of array");
        Scanner sc = new Scanner(System.in);

        int sizeOfArray = sc.nextInt();
        int arr[] = new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element want to find : ");
        int key=sc.nextInt();
        int mid = getPivot(arr, sizeOfArray);
        int start=0;
        int end=sizeOfArray-1;
        if(key > arr[mid]) {
            start = mid;
        }else{
            end = mid-1;
        }
        boolean check = false;
        while(start<=end) {
            mid = (start+end)/2;
            if(arr[mid]==key) {
                check=true;
            } else if(arr[mid] > key) {
                end=mid-1;
            } else{
                start = mid+1;
            }
        }
//        System.out.println("Not found");
        System.out.println(check ? "FOUND" : "NOT FOUND");
    }
}
