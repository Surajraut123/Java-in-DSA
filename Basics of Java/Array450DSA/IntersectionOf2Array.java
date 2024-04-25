package Array450DSA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IntersectionOf2Array {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> st = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i : nums1) {
            st.add(i);
        }
        for(int i : nums2) {
            if(st.contains(i)) {
                ans.add(i);
                st.remove(i);
            }
        }
        int[] ans1 = new int[ans.size()];
        for(int i=0;i<ans.size();i++) {
            ans1[i] = ans.get(i);
        }
        return ans1;
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

        int[] ans = intersection(arr1, arr2);
        for(int i : ans) System.out.print(i + " ");

        /* Another Approach
        * 1) we have 2 arrays then sort first one or any one. Which takes O(nlogn) time complexity
        * 2) Apply binary Search on Sorted array with elements of Second array which takes time complexity O(mlogn) + O(nlogn)
        *
        * */
    }
}
