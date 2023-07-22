package numbersToIntegervalue;

import java.util.ArrayList;
import java.util.Scanner;

public class InitializeNumberInArray {
    ImplNumberToInteger numToInt = new ImplNumberToInteger();
    ImplNumberToReverseInteger numArr = new ImplNumberToReverseInteger();
    public void initArray() {
        Scanner sc = new Scanner(System.in);
//        Array Initialization
//        int numbers[];
//        int[] numbers = new int[4]; // need to declare size
//        ArrayList Initialization
        System.out.println("Enter the integer value : ");
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0; i<6; i++) {
            numbers.add(sc.nextInt());
        }
        numToInt.impl(numbers);
        numArr = new ImplNumberToReverseInteger(numbers);

    }
}
