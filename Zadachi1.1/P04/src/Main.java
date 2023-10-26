import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println(isPrimeNumber(number));
    }

    public static boolean isPrimeNumber(int number) {
        if(number % 2 != 0 && number % 3 != 0){
            return true;
        }

        return false;
    }
}
