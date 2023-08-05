package arrays;

import java.util.Scanner;

public class ReverseArray {

    public static void reverseArray(int arr[]) {
        int i=0;
        int j=arr.length-1;
        while(i<j) {
            int tmp= arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++; j--;
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

        reverseArray(arr);
        System.out.println("Reversed Array : ");
        for(int i=0;i<size;i++) {
            System.out.println(arr[i]);
        }
    }
}
