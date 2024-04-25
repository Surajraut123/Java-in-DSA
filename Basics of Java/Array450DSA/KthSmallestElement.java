package Array450DSA;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthSmallestElement{

    public static int kthSmallest(int[] arr, int size, int k) {
        PriorityQueue<Integer> elements = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : arr) {
            elements.add(i);
            if(elements.size() > k) {
                elements.poll();
            }
        }
        return elements.peek();

    }

    public static int countFun(int[] arr, int k, int size, int mid) {
        int count=0;
        for(int i :arr) {
            if(i<=mid) count++;
        }
        return count;
    }

    public static int kthSmallBinarySearch(int[] arr, int size, int k) {
        int left=Integer.MAX_VALUE;
        int right=Integer.MIN_VALUE;
        for(int i : arr) {
            left = Math.min(left, i);
            right = Math.max(right, i);
        }
        while(left < right) {
            int mid = (left+right)/2;
            if(countFun(arr, k, size, mid) < k) {
                left = mid+1;
            } else{
                right = mid;
            }
        }
        return  left;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        //Using set : So it's useless because it only stores the value in sorted order. Instead we can able to use sort inbuilt function in ArrayList.

        //Using Priority Queue (max-heap) : It stores elements in the descending order. So will make kth size of max-heap so any element exceeds the size we will remove that one.
        int smallestElemet = kthSmallest(arr, size, k);
        System.out.println("Using Priority Queue : " + smallestElemet);

//        Using BinarySearch
        System.out.println( "Using Binary Search : " + kthSmallBinarySearch(arr, size, k));
    }
}
