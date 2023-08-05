package arrays;

import java.util.Scanner;

public class IntersectionOfElement {
    public static void main(String[] args) {
        intersectionOfSortedArray();
    }
    public static void intersectionOfSortedArray() {
        int arr1[] = getArray();
        int arr2[] = getArray();

        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length) {
            if(arr1[i] == arr2[j]) {
                System.out.println(arr1[i] + " ");
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else{
                j++;
            }
        }
    }

    public static int[] getArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Element : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
