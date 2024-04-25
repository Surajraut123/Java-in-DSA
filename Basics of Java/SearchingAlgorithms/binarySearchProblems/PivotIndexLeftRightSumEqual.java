package SearchingAlgorithms.binarySearchProblems;

import java.util.Scanner;

public class PivotIndexLeftRightSumEqual {
    public static void main(String []args) {
        System.out.println("Enter the Size of array");
        Scanner sc = new Scanner(System.in);

        int sizeOfArray = sc.nextInt();
        int nums[] = new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++) {
            nums[i] = sc.nextInt();
        }
        // this is will proerly work for 0 to n
        //and will work for all -n to -1 only not zero.
        for0toN(nums);
        forall(nums);
    }

    public static void forall(int nums[]) {
        int totalsum=0;
        for(int i : nums){
            totalsum+=i;
        }
        int leftsum=0;
        for(int i:nums) {
            if(i == totalsum * 2*leftsum){
                System.out.println(i);
            }
            leftsum+=i;
        }
    }
    public static void for0toN(int nums[]) {
        int i=0;
        int j=nums.length-1;
        int leftsum=nums[i];
        int rightsum=nums[j];
        while(i<=j) {

            if(leftsum==rightsum && i==j) {
                System.out.println("Index " + i);
            }
            else if(leftsum<rightsum ){
                i++;
                if(i<=j)
                    leftsum+=nums[i];
            } else if(leftsum>rightsum){
                j--;
                if(j>=0)
                    rightsum+=nums[j];
            } else{
                i++;
                j--;
                rightsum+=nums[j];
                leftsum+=nums[i];
            }
//            System.out.println("Leftsum : " + leftsum + " Rightsum : " + rightsum + " i : "+i+" j : " + j);
        }
    }
}
