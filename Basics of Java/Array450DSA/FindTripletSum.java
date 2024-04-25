package Array450DSA;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FindTripletSum {

    public static Boolean findTriplet(int arr[], int size, int triSum) {
        Arrays.sort(arr);
        for(int i=0;i<size-2;i++) {
            int k = i+1;
            int j = size-1;
            while (k<j) {
                if(arr[i] + arr[k] + arr[j] == triSum) {
                    return true;
                } else if(arr[i] + arr[k] + arr[j] > triSum) {
                    j--;
                } else{
                    k++;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int triSum = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++) arr[i] = sc.nextInt();

//        T.C = O(n^2)
        System.out.println(findTriplet(arr, size, triSum) ? "Found" : "Not Found");
    }
}
