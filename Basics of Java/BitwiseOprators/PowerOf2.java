package BitwiseOprators;

import java.util.Scanner;

import static java.lang.Math.pow;

public class PowerOf2 {
    public static boolean powerValue(int value) {
        for (int i = 0; i <=30; i++) {
            if(pow(2,i) == value) {
                return true;
            }
        }
        return false;
    }

    public static boolean optimizedPower(int value) {
        int ans = 1;
        for(int i=0;i<=30;i++) {
            if(ans==value){
                return true;
            }
            if(ans< Integer.MAX_VALUE/2) {
                ans = ans * 2;
            }
        }
        return false;
    }
    public static boolean powerApproach(int value) {
        //Approach : Check bits of that value. In their values set bit  only 1 is present then it is apower of 2
        int count=0;
        while(value!=0) {
            int bit = value&1;
            if(bit==1) {
                count++;
            }
            value=value>>1;
        }
        if(count==1) {
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

//        Problem : if => n == 2 ^ x; return true, else false
        boolean check = powerValue(value);
        boolean optimized = optimizedPower(value);
        boolean EfficentApproach = powerApproach(value);
        if(check) {
            System.out.println("Matched");
        } else{
            System.out.println("Not Matched");
        }
        if(EfficentApproach) {
            System.out.println("Matched in bitset");
        } else{
            System.out.println("Not Matched in bitset");
        }

    }
}
