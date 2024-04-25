package Array450DSA;

import java.util.Scanner;

public class BuyandSellStock {

    public static void buyandsellStock(int[] arr, int size) {
        int buy = arr[0];
        int currProfit = 0;
        int maxProfit=0;
        for(int i=0;i<size;i++) {
            if(arr[i] < buy) {
                buy = arr[i];
            }
            currProfit = arr[i] - buy;
            if(currProfit> maxProfit)
                maxProfit = currProfit;
            System.out.println("Max Profit : " + maxProfit);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++) arr[i] = sc.nextInt();

        buyandsellStock(arr, size);
    }
}
