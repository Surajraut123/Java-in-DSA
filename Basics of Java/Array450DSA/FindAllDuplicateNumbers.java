package Array450DSA;

import java.util.Scanner;

public class FindAllDuplicateNumbers {

    public static void findDuplicateNumbers(int[] arr, int size) {
        for(int i=0;i<size;i++) {
            if(arr[arr[i]%size] >= size) {
                if(arr[arr[i]%size] < 2 * size) System.out.println(arr[i]%size + " ");
            }
            arr[arr[i]%size] += size;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++) arr[i] = sc.nextInt();
        //for 0 to n-1
        findDuplicateNumbers(arr, size);
    }
}
