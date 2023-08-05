package arrays;

import java.util.Scanner;

public class RotateArray {

    public static void rotateArray(int arr[], int k) {
        int n = arr.length-1;
        for(int i=0;i<k;i++) {
            int tmp = arr[n];
            for(int j=n;j>0;j--) {
                arr[j] = arr[j-1];
            }
            arr[0] = tmp;
        }
    }

    public static void rotateArrayWithSpace(int arr[], int k) {
        int ans[] = new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            ans[(i+k)%arr.length] = arr[i];
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
        System.out.println("Enter total rotations : ");
        int k = sc.nextInt();

//        Space : o(1)
//        Time : O(k*n)
        rotateArray(arr, k);

//        Space : O(n);
//        time : O(n);
        rotateArrayWithSpace(arr, k);
        System.out.println("Rotated Array : ");
        for(int i=0;i<size;i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
