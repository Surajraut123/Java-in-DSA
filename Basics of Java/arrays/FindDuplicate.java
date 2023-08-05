package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicate {
    public static void main(String []args) {
        //Problem 1 = Array Size : N, each number between : 1 to N-1
        //Single integer value that is  present in array twice
        duplicate1toN1();

        //Problem 2 = Array Size : N, each number between : 0 to N-2
        //Single integer value that is  present in array twice(0 to 3)
        duplicate0toN2();

        //Problem 3 = Array Size : N, each number between : 1 to N-1
        //Single integer value that is  present in array twice or more than that
        multiNumberduplicate1toN();

        //Problem 4 = Array Size : N, each number between : 0 to N-1
        //Single integer value that is  present in array twice or more than that
        multiNumberduplicate0toN();

        duplicateWithNoRange();
    }

    public static int[] getarray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Element : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void duplicate1toN1() {
        System.out.println("Duplicate element 1 to n-1 : ");
        int arr[] = getarray();
        int ans=0;
        for(int i=0;i<arr.length;i++) {
            ans = ans ^ arr[i];
        }
        for(int i=1;i<arr.length;i++) {
            ans = ans ^ i;
        }

        System.out.println("Output of 1 to N-1 duplicate : "+ans);

    }
    public static void duplicate0toN2() {
        System.out.println("Duplicate element 0 to n-2 : ");
        int arr[] = getarray();
        int ans=0;
        for(int i=0;i<arr.length;i++) {
            ans = ans^arr[i];
        }
        for(int i=0;i<arr.length-1;i++) {
            ans = ans ^i;
        }
        System.out.println("Output of 0 to N-2 duplicate : "+ans);
    }

    public static void multiNumberduplicate1toN() {
        System.out.println("Multiple duplicate 1 to n-1 : ");
        int arr[] = getarray();
        int n=arr.length;
        int ans[] = new int[n];
        for(int i=0;i<n;i++) {
            ans[arr[i]]++;
        }
        for(int i=0;i<n;i++) {
            if(ans[i]>1) {
                System.out.println(i);
            }
        }
    }

    public static void multiNumberduplicate0toN() {
        System.out.println("Multiple duplicate 0 to n-1 : ");
        int arr[] = getarray();
        int n=arr.length;
        int ans[] = new int[n];
        for(int i=0;i<n;i++) {
            ans[arr[i]]++;
        }
        for(int i=0;i<n;i++) {
            if(ans[i]>1) {
                System.out.println(i);
            }
        }
    }

    public static void duplicateWithNoRange() {
        System.out.println("Duplicate with no range: ");
        int arr[] = getarray();
        ArrayList<Integer> duplicateElement = new ArrayList<>();
        Map<Integer, Integer> mapObject = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            mapObject.put(arr[i], (mapObject.getOrDefault(arr[i], 0))+1);
        }
        for(Map.Entry<Integer, Integer> entry : mapObject.entrySet()) {
            if(entry.getValue()>1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
