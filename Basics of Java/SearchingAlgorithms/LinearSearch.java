package SearchingAlgorithms;

import java.util.Scanner;

public class LinearSearch {
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
        for(int i=0;i<sizeOfArray;i++) {
            if(arr[i] == findNumber) {
                System.out.println("Number found in array");
                break;
            }
        }


    }
}
