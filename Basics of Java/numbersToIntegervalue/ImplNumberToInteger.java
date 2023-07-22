package numbersToIntegervalue;

import java.util.ArrayList;

public class ImplNumberToInteger {
    public void impl(ArrayList<Integer> numbers) {
        int ans = 0;
        int i=0;
        while(i < numbers.size()) {
            int digit = numbers.get(i);
            ans = ans*10 + digit;
            i++;
        }
        System.out.println("Final integer value : "+ ans);
    }
}
