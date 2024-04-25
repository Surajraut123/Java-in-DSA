package Array450DSA;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class MergeIntervals {

    public static void printIntervals(Stack<int[]> ans) {
        while(!ans.empty()) {
            System.out.println(Arrays.toString(ans.peek()));
            ans.pop();
        }
    }

    public static void mergeIntervals(int[][] arr) {
        Stack<int[]> st = new Stack<>();
        st.push(arr[0]);
        for(int i=1;i<arr.length;i++) {
            int[] tmp = st.peek();
            if(tmp[1] >= arr[i][0]) {
                tmp[1] = arr[i][1];
                st.pop();
                st.push(tmp);
            } else{
                tmp = arr[i];
                st.push(tmp);
            }
        }

        printIntervals(st);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] arr = new int[size][2];
        for(int i=0;i<size;i++) {
            for(int j=0;j<2;j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        mergeIntervals(arr);
    }
}
