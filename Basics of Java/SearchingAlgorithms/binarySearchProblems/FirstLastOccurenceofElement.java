package SearchingAlgorithms.binarySearchProblems;

import java.util.Scanner;

public class FirstLastOccurenceofElement {
    public static void main(String []args) {
        System.out.println("Enter the Size of array");
        Scanner sc = new Scanner(System.in);

        int sizeOfArray = sc.nextInt();
        int arr[] = new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Number want to Search");
        int findNumber = sc.nextInt();
        int firtsans = firstOccur(arr, findNumber, sizeOfArray);
        int lastoccur = lastoccur(arr, findNumber, sizeOfArray);
        System.out.println("First and Last Occcurence : "+firtsans + " " + lastoccur);
    }
    public static int firstOccur(int arr[], int k, int sizeOfArray) {
        int i=0;
        int j=sizeOfArray-1;
        int mid;
        int first=0;
        while(i<=j) {
            mid=(i+j)/2;
            if(arr[mid] == k) {
                j=mid-1;
                first=mid;
            } else if(arr[mid] < k ){
                i=mid+1;
            } else{
                j=mid-1;
            }
        }
        return first;
    }
    public static int lastoccur(int arr[], int k, int sizeOfArray) {
        int i=0;
        int j=sizeOfArray-1;
        int mid;
        int last=0;
        while(i<=j) {
            mid=(i+j)/2;
            if(arr[mid] == k) {
                i=mid+1;
                last=mid;
            } else if(arr[mid] < k ){
                i=mid+1;
            } else{
                j=mid-1;
            }
        }
        return last;
    }
}
