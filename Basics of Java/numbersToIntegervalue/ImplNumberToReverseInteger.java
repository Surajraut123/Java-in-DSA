package numbersToIntegervalue;

import java.util.ArrayList;

import static java.lang.Math.pow;

public class ImplNumberToReverseInteger {

    public ImplNumberToReverseInteger() {
        System.out.println("Default Constructor Called");
    }
    public ImplNumberToReverseInteger(ArrayList<Integer> number) {
        System.out.println("Parameterized Constructor Called");
        int i=0;
        int ans=0;
        while(i<number.size()){
            int digit = number.get(i);
            ans = (int) (digit*pow(10,i)+ans);
            i++;
        }
        System.out.println("Reverse of integer : " + ans);
    }
}
