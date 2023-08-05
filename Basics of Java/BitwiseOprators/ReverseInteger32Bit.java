package BitwiseOprators;

import java.util.Scanner;

public class ReverseInteger32Bit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 32 bit integer value");
        int val = sc.nextInt();
        int ans = 0;
        while(val!=0) {
            int digit = val%10;
            if((ans > Integer.MAX_VALUE/10)||(ans < Integer.MIN_VALUE/10)) {
                System.out.println("Answer : " + "0");
            }
            ans = ans*10 + digit;
            val = val/10;
        }
        //If answer is 0 then it will show the wrong output
        System.out.println("Answer with 32 bit integer : " + ans);
    }
}
