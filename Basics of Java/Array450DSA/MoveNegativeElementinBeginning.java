package Array450DSA;

import java.util.Scanner;

public class MoveNegativeElementinBeginning {

    public static void moveElement(int[] arr, int size) {
        int j=0;
        int i=0;
        while (i<size) {
            if(arr[i] < 0) {
                if(j<i) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                i++;j++;
            } else {
                i++;
            }
        }
    }
    public static void main(String []args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        moveElement(arr, size);
        for(int i=0;i<size;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
