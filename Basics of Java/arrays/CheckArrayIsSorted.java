package arrays;

import java.util.Scanner;

public class CheckArrayIsSorted {
    public static boolean checkArrayIsRotatedAndSorted(int arr[]) {
        int count=0;
        for(int i=1;i<arr.length;i++) {
            if(arr[i-1]>arr[i]){
                count++;
            }
        }
        if(arr[arr.length-1] > arr[0]) count++;

        return count<=1;
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

        boolean check = checkArrayIsRotatedAndSorted(arr);
        System.out.println(check ? "Rotated and Sorted" : "Not Rotated and Sorted");
    }
}
