import java.util.Scanner;

public class P05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете първо число: ");
        int a = sc.nextInt();
        System.out.println("Въведете второ число: ");
        int b = sc.nextInt();
        System.out.println("Въведете операция (+, -, *, /): ");
        String operator = sc.next();

        Calculate(a, b, operator);
    }

    public static void Calculate(int a, int b, String operator){
        int result = 0;
        if(operator.equals("+")) {
            result = a + b;
        } else if (operator.equals("-")) {
            result = a - b;
        } else if (operator.equals("*")) {
            result = a * b;
        } else if (operator.equals("/")) {
            result = a / b;
        }

        System.out.printf("%d %s %d = %d", a, operator, b, result);
    }
}
