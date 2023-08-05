package SearchingAlgorithms.binarySearchProblems;

import java.util.Scanner;

public class PainterPartitionProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total areas : ");
        int size = sc.nextInt();
        System.out.println("Enter block area : ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the total number of painter want to paint an block : ");
        int painters;
        painters = sc.nextInt();
    }
}
