package arrays;

import java.util.Scanner;

public class MoveZeros {

    public static void movezero(int nums[]) {
        int i=0;
        for(int j=0;j<nums.length;j++) {
            if(nums[j] != 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j]= tmp;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the element : ");
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        movezero(arr);
        System.out.println("Reversed Array : ");
        for(int i=0;i<size;i++) {
            System.out.println(arr[i]);
        }
    }
}
