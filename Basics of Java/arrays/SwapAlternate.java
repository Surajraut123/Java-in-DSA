package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SwapAlternate {
    public static void main(String[] args) {
        int arr[] = getarray();
        for(int i=0;i<arr.length-1;i+=2) {
            int tmp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = tmp;
        }
        System.out.println("Alternated Swap Values : ");
        for(int i : arr) {
            System.out.println(i);
        }
    }
    public static int[] getarray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Element : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
