package Array450DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArraySubsetOfAnotherArray {

    public static String subset(int arr1[], int m, int arr2[], int n) {
        Map<Integer, Integer> mp = new HashMap<>();
        Map<Integer, Integer> mp1 = new HashMap<>();

        //n > m always

        for(int i=0;i<m;i++) {
            mp.put(arr1[i], mp.getOrDefault(arr1[i], 1)+1);
        }
        for(int i=0;i<n;i++) {
            mp1.put(arr2[i], mp1.getOrDefault(arr2[i], 1)+1);
        }

        for(int i=0;i<n;i++) {
            if(mp.get(arr2[i]) < mp1.get(arr2[i])) {
                return "No";
            }
        }
        return "Yes";
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int arr1[] = new int[size];
        for(int i=0;i<size;i++) {
            arr1[i] = sc.nextInt();
        }
        int size1 = sc.nextInt();
        int arr2[] = new int[size1];
        for(int i=0;i<size1;i++) {
            arr2[i] = sc.nextInt();
        }
//        size > size1 always
        System.out.println(subset(arr1, size, arr2, size1));
    }
}
