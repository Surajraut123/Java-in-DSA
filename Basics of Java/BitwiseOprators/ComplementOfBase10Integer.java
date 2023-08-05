package BitwiseOprators;

import java.util.Scanner;

public class ComplementOfBase10Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int m = input;
        int mask=0;
        while(input!=0) {
            input = input>>1;
            mask = (mask<<1)|1;
        }
        int ans = (~m) & mask;
        System.out.println("Complement of Base 10 integer is " + ans);
    }
}

