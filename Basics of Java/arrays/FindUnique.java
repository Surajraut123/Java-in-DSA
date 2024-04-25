package arrays;

import java.util.*;

public class FindUnique {

    public static void main(String[] args) {
        System.out.println(UniqueNoOccurences() ? "Unique Occurrences found" : "No unique Number");
        System.out.println(UniqueNoOccurencesUsingSetandMap() ? "Unique Occurrences found" : "No unique Number");
        FindUniqueNumber();


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

    public static void FindUniqueNumber() {
        // Problem: Size of N array, Only one element will be unique, and other elements will occur twice in the array.
        System.out.println("Get Unique Number only : ");
        int[] arr = getarray();
        int ans = 0;
        for (int i : arr) {
        ans = ans ^ i;
        }
        System.out.println("Unique Number: " + ans);
    }

    public static boolean UniqueNoOccurences() {
        // Problem: Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
        // Input: arr = [1,2,2,1,1,3]
        // Output: true
        // Explanation: The value 1 has 3 occurrences, 2 has 2, and 3 has 1. No two values have the same number of occurrences.
        System.out.println("Unique No of Occurrences : ");
        int[] arr = getarray();
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            ans.add(count);
        }
        Collections.sort(ans);
        for (int i = 0; i < ans.size() - 1; i++) {
            if (ans.get(i).equals(ans.get(i + 1))) {
                return false;
            }
        }
        return true;
    }

     public static boolean UniqueNoOccurencesUsingSetandMap() {
         System.out.println("Occurences using map : ");
        int arr[] = getarray();
         Map<Integer,Integer> mapObj = new HashMap<>();
         for(int i=0;i<arr.length;i++) {
//       If the key num is already present in the map, map.get(num) will return the corresponding value (the count of occurrences for num), and count will be assigned that value.
//       If the key num is not found in the map, map.getOrDefault(num, 0) will return the default value, which is 0. In this case, count will be assigned the value 0.
             int count = mapObj.getOrDefault(arr[i], 0);
             mapObj.put(arr[i], count+1);
         }
         ArrayList<Integer> unique = new ArrayList<>();
         for(Map.Entry<Integer, Integer> entry :mapObj.entrySet()) {
             if(!unique.contains(entry.getValue())) {
                 unique.add(entry.getValue());
             } else{
                 return false;
             }
         }
         return true;
     }
}
