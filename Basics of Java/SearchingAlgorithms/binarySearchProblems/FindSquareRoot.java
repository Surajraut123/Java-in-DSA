package SearchingAlgorithms.binarySearchProblems;

import java.util.Scanner;

public class FindSquareRoot {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i=0;
        int j=number;
        int mid=0;
        while(i<j) {
            mid = (i+j)/2;
            if(mid*mid == number){
                System.out.println("Square root of "+ number + " is : " + mid);
                break;
            }
            else if(mid*mid >number) {
                j=mid-1;
            } else{
                i=mid+1;
            }
        }
    }
}
