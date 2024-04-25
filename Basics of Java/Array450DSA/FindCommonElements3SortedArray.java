package Array450DSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindCommonElements3SortedArray {

    public static ArrayList<Integer> intersection(int[] arr1, int[] arr2, int[] arr3) {
        Map<Integer, Integer> mp1 = new HashMap<>();
        Map<Integer, Integer> mp2 = new HashMap<>();
        Map<Integer, Integer> mp3 = new HashMap<>();
        for(int i : arr1) mp1.put(i, mp1.getOrDefault(i, 0) +1);
        for(int i : arr2) mp2.put(i, mp2.getOrDefault(i, 0) +1);
        for(int i : arr3) mp3.put(i, mp3.getOrDefault(i, 0) +1);

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr1.length;i++) {
            if(mp1.containsKey(arr1[i]) && mp2.containsKey(arr1[i]) && mp3.containsKey(arr1[i])) {
                ans.add(arr1[i]);
                mp1.remove(arr1[i]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int arr1[] = new int[size];
        for(int i=0;i<size;i++) {
            arr1[i] = sc.nextInt();
        }

        int size2 = sc.nextInt();
        int arr2[] = new int[size2];
        for(int i=0;i<size2;i++) {
            arr2[i] = sc.nextInt();
        }
        int size3 = sc.nextInt();
        int arr3[] = new int[size3];
        for(int i=0;i<size3;i++) {
            arr3[i] = sc.nextInt();
        }

        ArrayList<Integer>  ans= intersection(arr1, arr2, arr3);

    }
}
