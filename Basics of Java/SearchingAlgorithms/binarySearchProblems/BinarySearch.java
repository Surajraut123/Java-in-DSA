package SearchingAlgorithms.binarySearchProblems;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String []args) {
        System.out.println("Enter the Size of array");
        Scanner sc = new Scanner(System.in);

        int sizeOfArray = sc.nextInt();
        int arr[] = new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int i=0;
        int j=sizeOfArray-1;
        int mid=0;
        boolean flag=false;
        while(i<=j) {
            mid = (i+j)/2;
            if(arr[mid] == key) {
                flag=true;
                break;
            } else if(arr[mid] > key) {
                j=mid;
            } else{
                i=mid+1;
            }
        }
        System.out.println((flag == true) ? "Found" : "Not found");

    }
}
