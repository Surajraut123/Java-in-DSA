package BitwiseOprators;

import java.util.Scanner;

import static java.lang.Math.pow;

public class ReverseIntegerValue {
    public static void main(String[] args) {
        System.out.println("Enter the value : ");
        Scanner sc = new Scanner(System.in);
        int decimalValue = sc.nextInt();
        int ans=0;
        int i=0;
        while(decimalValue!=0) {
            int digit = decimalValue%10;
            ans = ans*10 + digit;
            i++;
            decimalValue = decimalValue/10;
        }
        System.out.println("Reverse of Integer Value : " + ans);
    }
}
