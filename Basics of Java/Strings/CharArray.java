package Strings;

import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        char name[] = new char[20];
        name = sc.nextLine().toCharArray();
        int i=0;
        int count=0;
        while(name[i] != ' ') {
            count++;
            i++;
        }
        System.out.println(count);

//        but we have function in java
        int len = name.length;
    }
}
