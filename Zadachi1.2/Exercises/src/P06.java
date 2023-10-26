import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        int temp = sc.nextInt();
        System.out.println("Enter unit (C or F): ");
        String entity = sc.next();

        if (entity.equals("C")) {
            ConvertToF(temp);
        } else if (entity.equals("F")) {
            ConvertToC(temp);
        }
    }

    public static void ConvertToC(int temp) {
        double result = (5.0 / 9.0) * (temp - 32);
        System.out.println(temp + " F = " + result + " C");
    }

    public static void ConvertToF(int temp) {
        double result = (9.0 / 5.0) * temp + 32;
        System.out.println(temp + " C = " + Math.round(result) + " F");
    }
}
