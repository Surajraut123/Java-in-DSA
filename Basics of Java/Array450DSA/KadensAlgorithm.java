package Array450DSA;

import java.util.Scanner;

public class KadensAlgorithm {

    public static long maxSubarraySum(int arr[], int n){

        long ans = -1;
        long currAns = 0;
        for(int i: arr) {
            currAns += i;
            if(ans < currAns) {
                ans = currAns;
            }
            if(currAns < 0) {
                currAns = 0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        long ans = maxSubarraySum(arr, size);
        System.out.println("Max Sum Array : " + ans);
    }
}
