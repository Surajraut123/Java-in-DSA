package SearchingAlgorithms.binarySearchProblems;

import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class FindSquareRootWithPrecision {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int ans=0;
        int i=0;
        int j=number;
        int mid=0;
        boolean check=false;
        while(i<j) {
            mid = (i+j)/2;
            if(mid*mid == number) {
                System.out.println("Found : " + mid);
                check=true;
                break;
            } else if (mid * mid < number) {
                ans = mid;
                i=mid+1;
            } else{
                j=mid-1;
            }
        }
        if(!check)
            getprecision(ans, number);
    }

    public static void getprecision(double ans, int number) {
        double factor=1;
        int precision=3;
        for(int i=0;i<precision;i++) {
            factor = factor/10;
            for(double j = ans; j*j < number; j+=factor) {
                ans = j;
            }
        }
        System.out.printf("Exact squareroot of %d is %f", number, ans);
    }
}
