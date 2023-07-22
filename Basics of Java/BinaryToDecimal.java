import java.util.Scanner;

import static java.lang.Math.pow;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary value : ");
        int binaryValue = sc.nextInt();
        int ans=0;
        int i=0;
        while(binaryValue != 0) {
            int digit = binaryValue%10;
            if(digit == 1) {
                ans = (int) (digit*pow(2, i) + ans);
            }
            binaryValue = binaryValue/10;
            i++;
        }
        System.out.println("Decimal value : " + ans);
    }
}
