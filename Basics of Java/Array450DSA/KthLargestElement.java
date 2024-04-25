package Array450DSA;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestElement {

    public static int kthLargest(int[] arr, int size, int k) {
        PriorityQueue<Integer> elements = new PriorityQueue<>();
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
            if(i>=mid) count++;
        }
        return count;
    }

    public static int kthLargeBinarySearch(int[] arr, int size, int k) {
        int left=Integer.MAX_VALUE;
        int right=Integer.MIN_VALUE;
        for(int i : arr) {
            left = Math.min(left, i);
            right = Math.max(right, i);
        }
        while(left < right) {
            int mid = (left+right)/2;
            if(countFun(arr, k, size, mid) < k) {
                right=mid-1;
            } else{
                left = mid;
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

        //Using Priority Queue (min-heap) : It stores elements in the ascending order. So will make kth size of min-heap so any element exceeds the size we will remove that one.
        int smallestElemet = kthLargest(arr, size, k);
        System.out.println("Largest elemets : " + smallestElemet);

        //Not efficient at all
        System.out.println( "Using Binary Search : " + kthLargeBinarySearch(arr, size, k));

    }
}
