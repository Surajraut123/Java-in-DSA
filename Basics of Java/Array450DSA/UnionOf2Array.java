package Array450DSA;

import java.util.*;

public class UnionOf2Array {

    public static void union(int[] a, int size1, int[] b, int size2) {
        Set<Integer> st = new HashSet<>();
        for(int i:a) st.add(i);
        for(int i:b) st.add(i);
        for(int i : st) {
            System.out.println(i);
        }
    }

    public static ArrayList<Integer> findUnion(int[] arr1, int n, int[] arr2, int m)
    {
        int i=0;
        int j=0;
        int k=-1;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<n && j<m) {
            if(arr1[i] < arr2[j]) {
                if(k >=0) {
                    if(ans.get(k) != arr1[i]) {
                        ans.add(arr1[i]);
                        k++;
                    }

                } else{
                    ans.add(arr1[i]);
                    k++;
                }
                i++;
            } else if(arr1[i] > arr2[j]) {
                if(k >=0) {
                    if(ans.get(k) != arr2[j]) {
                        ans.add(arr2[j]);
                        k++;
                    }

                } else{
                    ans.add(arr2[j]);
                    k++;
                }
                j++;
            } else{
                if(k >=0) {
                    if(ans.get(k) != arr1[i]) {
                        ans.add(arr1[i]);
                        k++;
                    }

                } else{
                    ans.add(arr1[i]);
                    k++;
                }
                i++;
                j++;
            }
        }

        while(i<n) {
            if(ans.get(k) != arr1[i]) {
                ans.add(arr1[i]);
                k++;
            }
            i++;
        }
        while(j<m) {
            if(ans.get(k) != arr2[j]) {
                ans.add(arr2[j]);
                k++;
            }
            j++;
        }
        return ans;
    }

    public static ArrayList<Integer> printUnion(int[] arr1, int[] arr2, int m, int n){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < m && j < n){
            if(arr1[i] < arr2[j]){
                ans.add(arr1[i]);
                i++;
            }
            else if(arr2[j] < arr1[i]){
                ans.add(arr2[j]);
                j++;
            }
            else{
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }

        // printing remaining elemens fo the alrger array
        while(i < m){
            ans.add(arr1[i]);
            i++;
        }
        while(j < n){
            ans.add(arr2[j]);
            j++;
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

        int size1 = sc.nextInt();
        int arr2[] = new int[size1];
        for(int i=0;i<size1;i++) {
            arr2[i] = sc.nextInt();
        }

//        With Space
        System.out.println("Union of Two Array : ");
//        union(arr1, size, arr2, size1);

//        WithoutSpace : Array Should Be Sorted
//        Approach : One array contain multiple Duplicates for that keeping track on resultant array as well
        ArrayList<Integer> ans = new ArrayList<>();
        ans = findUnion(arr1, size, arr2, size1);
        for(Integer i : ans) {
            System.out.print(i + " ");
        }

//        WithoutSpace :
//        Approach : each of the two arrays does not contain any duplicate values by itself.  it's  possible that some values may appear in both arrays duplicate
        ArrayList<Integer> ans1 = new ArrayList<>();
        ans1 = printUnion(arr1, arr2, size, size1);
        for(Integer i : ans1) {
            System.out.print(i + " ");
        }
    }
}
