package Array450DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FactorialOfLargeNumber {

    public static void getProduct(ArrayList<Integer> ans, int val) {
        int k=0;
        int carry=0;
        while(k<ans.size()) {
            int product = ans.get(k) * val + carry;
            int result = product%10;
            ans.set(k, result);
            carry = product/10;
            k++;
        }
        while(carry!=0) {
            int result = carry%10;
            ans.add(result);
            carry = carry/10;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        for(int i=1;i<=size;i++) {
            getProduct(ans, i);
        }
        Collections.reverse(ans);
    }
}
