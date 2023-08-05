package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AddTwoArrays {

    public static void sumOfTwoArray(int a[], int a1, int b[], int b1) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i=a1-1;
        int j=b1-1;
        int carry=0;
        while(i>=0 && j>=0) {
            int sum = a[i] + b[j] + carry;
            int digit = sum%10;
            carry = sum/10;
            ans.add(digit);
            i--; j--;
        }
        while(i>=0) {
            int sum = a[i] + carry;
            int digit = sum%10;
            carry = sum/10;
            ans.add(digit);
            i--;
        }
        while(j>=0) {
            int sum = b[j] + carry;
            int digit = sum%10;
            carry = sum/10;
            ans.add(digit);
            j--;
        }
        while(carry!=0) {
            int sum=carry;
            int digit = sum%10;
            carry = sum/10;
            ans.add(digit);
        }
        Collections.reverse(ans);
        System.out.println("Sum of Two arrays : ");
        for(int k=0;k< ans.size();k++) {
            System.out.print(ans.get(k));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the arr Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the element first array : ");
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the arr1 Size : ");
        int size1 = sc.nextInt();
        int arr1[] = new int[size1];

        System.out.println("Enter the element Second array : ");
        for(int i=0;i<size1;i++) {
            arr1[i] = sc.nextInt();
        }
        sumOfTwoArray(arr, size, arr1, size1);
    }
}
