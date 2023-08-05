package SearchingAlgorithms.binarySearchProblems;

import java.util.Arrays;
import java.util.Scanner;

public class AggresiveCows {

    public static boolean isPossible(int arr[], int cows, int mid, int size) {
        int cowCount=1;
        int lastPosition = arr[0];
        for(int i=0;i<size;i++) {
            if(arr[i] - lastPosition >= mid) {
                cowCount++;
                if(cowCount==cows) {
                    return true;
                }
                lastPosition = arr[i];
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total stalls : ");
        int size = sc.nextInt();
        System.out.println("Enter the distance per stall : ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the total cows : ");
        int cows;
        cows = sc.nextInt();

        int start=0;
        int end=0;
        int mid=0;
        Arrays.sort(arr);
        end = arr[size-1];
        int ans=0;
        while(start <= end) {
            mid = (start+end)/2;
            if(isPossible(arr, cows, mid, size)) {
                start = mid+1;
                ans = mid;
            } else{
                end = mid-1;
            }
        }
        System.out.println("Answer : " + ans);
    }
}
