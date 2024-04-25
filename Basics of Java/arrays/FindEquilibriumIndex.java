package arrays;

import java.util.Scanner;

public class FindEquilibriumIndex {
    public static int findEquilibriumIndex(int[] arr, int size) {
        int left_ans=arr[0];
        int right_ans = arr[arr.length-1];
        int i=0, j=arr.length-1;
        while(i<=j) {
            if(left_ans == right_ans && i==j) {
                return i;
            } else if(left_ans < right_ans) {
                left_ans+=arr[++i];
            } else if (left_ans > right_ans) {
                right_ans+=arr[--j];
            } else{
                i++;j--;
                left_ans+=arr[i];
                right_ans+=arr[j];
            }
        }
        return -1;
    }

    public static int calculateSum(int arr[], int start, int end) {
        int sum=0;
        for(int i=start; i<end;i++) {
            sum+=arr[i];
        }
        return sum;
    }

    public static int findEquilibriumIndexforAll(int arr[], int size) {
        int mid = size/2;
        int leftAns = calculateSum(arr, 0, mid);
        int rightAns = calculateSum(arr, mid+1, size);
        Boolean check1 = false;
        Boolean check2 = false;

        while(mid>0) {
            if(leftAns > rightAns && !check2) {
                leftAns -= arr[mid-1];
                rightAns +=arr[mid];
                mid-=1;
                check1 = true;
            } else if(leftAns < rightAns && !check1) {
                leftAns += arr[mid];
                rightAns -=arr[mid-1];
                mid+=1;
                check2 = true;
            } else if(leftAns == rightAns) {
                return mid;
            } else{
                return -1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        //For Positive Values only
        int index = findEquilibriumIndex(arr, size);
        System.out.println(index);

        int index1 = findEquilibriumIndexforAll(arr, size);
        /*
        * Sample Input 1:
            1
            6
            1 7 3 6 5 6
            Sample Output 1:
            3
            Explanation For Sample Input 1:
            The sum of elements to the left of arr[3] = 1 + 7 + 3 = 11.
            The sum of elements to the right of arr[3] = 5 + 6 = 11.
            Hence the answer is 3.
        *
        */
    }
}
