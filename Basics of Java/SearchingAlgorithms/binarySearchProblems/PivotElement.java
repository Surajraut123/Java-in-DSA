package SearchingAlgorithms.binarySearchProblems;

import java.util.Scanner;

public class PivotElement {
    public static void main(String args[]) {
        System.out.println("Enter the Size of array");
        Scanner sc = new Scanner(System.in);

        int sizeOfArray = sc.nextInt();
        int arr[] = new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++) {
            arr[i] = sc.nextInt();
        }
        //These will work only if we have an array in sorted and rotated
        int i=0;
        int j=sizeOfArray-1;
        int mid=0;
        while(i<j) {
            mid = (i+j)/2;
            if(arr[0] < arr[mid]) {
                i=mid+1;
            } else {
                j=mid;
            }
        }
        System.out.println("Answer : " + arr[j]);
    }
}
