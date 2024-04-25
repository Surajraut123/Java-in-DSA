package Strings;

import java.util.Scanner;

public class CheckStringPalindrome {
    public static void withoutLowerAndUpperCase(String str) {
        int i=0;
        boolean check = true;
        int j=str.length()-1;
        while(i<j) {
            if(str.charAt(i) != str.charAt(j)) {
                check = false;
            }
            i++;j--;
        }
        System.out.println(check ? "Palindrome" : "Not a Palindrome");
    }

    public static void withLowerAndUpperCase(String str) {
        int i=0;
        int j=str.length()-1;
        boolean check = true;
        while(i<j) {
            if(Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))){
                check = false;
            }
            i++;j--;
        }
        System.out.println(check ? "Palindrome" : "Not a Palindrome");

    }

    public static void toLower(char c) {
        if(c >= 65 && c<=90) {
            c = (char) (c + 'a' - 'A');
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        withoutLowerAndUpperCase(str);
        withLowerAndUpperCase(str);


    }
}
