package SearchingAlgorithms.binarySearchProblems;

import java.util.Scanner;

public class PainterPartitionProblem {

    public static boolean isPossible(int[] arr, int mid, int painters) {
        int painterCount = 1;
        int boardSum=0;
        for(int i=0;i<arr.length;i++) {
            if(boardSum+arr[i]<=mid) {
                boardSum+=arr[i];
            } else{
                painterCount++;
                if(painterCount>=painters || arr[i] > mid) {
                    return false;
                }
                boardSum = arr[i];
            }
        }
        return  true;
    }

    public static void paintersTime(int[] arr, int m) {
        int start=0;
        int end=0;
        int ans = 0;
        for(int i : arr) end+=i;
        int mid = (start + end)/2;
        while(start <= end){
            if(isPossible(arr, mid, m)){
                end = mid-1;
                ans = mid;
            } else{
                start = mid+1;
            }
            mid = (start + end)/2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total areas : ");
        int size = sc.nextInt();
        System.out.println("Enter block area : ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the total number of painter want to paint an block : ");
        int painters;
        painters = sc.nextInt();

        paintersTime(arr, painters);
    }
}
