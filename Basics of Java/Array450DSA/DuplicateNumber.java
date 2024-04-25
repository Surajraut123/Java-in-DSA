package Array450DSA;

import java.util.Scanner;

public class DuplicateNumber {

    public  static int duplicateValue(int[] arr, int size) {
        int low = 1;
        int high = size-1;
        while(low <= high) {
            int mid = (low + high)/2;
            int count=0;
            for(int i : arr)
                if(i<=mid) count++;

            if(count<=mid) low = mid+1;
            else high = mid-1;
        }
        return low;
    }

    public static int visited(int[] arr, int size) {
        for(int i=0;i<size;i++) {
            int index = Math.abs(arr[i]);
            if(arr[index] < 0) {
                return index;
            }
            arr[index] = -arr[index];
        }
        return size;
    }


    public static int tortoise(int[] arr, int size) {
        int slow = arr[0];
        int fast = arr[0];
        do {
            fast = arr[arr[fast]];
            slow = arr[slow];
        } while(fast !=slow);
        fast = arr[0];
        while(fast != slow)
        {
            fast = arr[fast];
            slow = arr[slow];
        }

        return slow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++) arr[i] = sc.nextInt();

        //Problem :
        /*
        Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
         There is only one repeated number in nums, return this repeated number.
         You must solve the problem without modifying the array nums and uses only constant extra space.
         */


        //Using Binary Search T.C : O(nLogn) s.c : O(1) if Only one number is duplicate from 1 to n-1
        System.out.println("Using Binary Search : "+duplicateValue(arr, size));

        //Using Visited technique T.C : O(n) s.c : O(1)
//        System.out.println("Using Visited Technique : "+visited(arr, size));

        //Using Tortoise Approach T.C : O(n) s.c : O(1)
        //Think just like cycle in linked list :
        //What we know if the number is duplicate in the range of 1 to n in array then there will be definitely cycle. So Just like Linked list fast will go two step and slow will go one step forward simultaneously while slow!=fast. If we found cycle then any one of the pointer set position to the first of array and then go one step forward simultaneously

        //This approach will work for only 1 to n-1;
        System.out.println("Using Tortoise Technique : "+tortoise(arr, size));

    }
}
