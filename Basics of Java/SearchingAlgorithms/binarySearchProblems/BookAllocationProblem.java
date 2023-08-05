package SearchingAlgorithms.binarySearchProblems;

import java.util.Scanner;

public class BookAllocationProblem {

    public static boolean isPossible(int arr[], int size, int students, int mid) {
        int currentStudent=1;
        int sum=0;
        for(int i=0;i<size;i++) {
            if(sum + arr[i] <= mid) {
                sum+=arr[i];
            } else{
                currentStudent++;
                if(currentStudent > students || arr[i]>mid) {
                    return false;
                }
                sum = arr[i];
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total books : ");
        int size = sc.nextInt();
        System.out.println("Enter pages of each book : ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the total number of students want to allocate an books : ");
        int students;
        students = sc.nextInt();


        int end = 0;
        int start = 0;
        int mid=0;
        int ans=0;
        for(int i : arr) {
            end+=i;
        }

        while(start <= end) {
            mid = (start + end) / 2;
            if(isPossible(arr, size, students, mid)) {
                ans = mid;
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        System.out.println("Total pages allocated to m students is : " + ans);
    }
    
}
