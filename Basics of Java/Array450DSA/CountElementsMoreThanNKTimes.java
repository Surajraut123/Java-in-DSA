package Array450DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountElementsMoreThanNKTimes {
    public static int countOccurence(int arr[], int n, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 1)+1);
        }
        int count=0;
        for(Map.Entry<Integer, Integer> map : mp.entrySet()) {
            if(map.getValue() > (n/k)) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int k = sc.nextInt();
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        long ans = countOccurence(arr, size, k);
    }
}
