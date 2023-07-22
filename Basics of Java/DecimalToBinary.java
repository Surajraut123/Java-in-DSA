import java.util.Scanner;

import static java.lang.Math.pow;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Decimal Value :");
        int decimalValue = sc.nextInt();
        int i=0;
        int ans = 0;
        while(decimalValue != 0) {
            int bit = decimalValue&1;
            ans = (int) ((pow(10, i) * bit) + ans);
            decimalValue = decimalValue>>1;
            i++;
        }
        System.out.println("Binary value of " + decimalValue + "is : " + ans);

    }
}
