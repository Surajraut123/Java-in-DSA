package Array450DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubArrayWithSum0 {

    public static boolean subarraySum(int[] arr, int size) {
        Map<Integer,Integer> mp = new HashMap<>();
        int sum=0;
        for(int i=0;i<size;i++) {
            sum += arr[i];
            if(sum==0 || arr[i] == 0 || mp.containsKey(sum)) {
                return true;
            } else{
                mp.put(sum, 1);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++) arr[i] = sc.nextInt();

        //Using Prefix Sum Technoque
        System.out.println(subarraySum(arr, size) ? "Yes" : "No");
    }
}
