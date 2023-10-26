import java.util.Scanner;

public class P03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        isPalindrome(str);
    }

    public static void isPalindrome(String str){
        String reverseStr = "";

        int strLength = str.length();

        for (int i = (strLength - 1); i >=0; i--) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.equals(reverseStr)) {
            System.out.println(str + " is a Palindrome.");
        }
        else {
            System.out.println(str + " is not a Palindrome.");
        }
    }
}
