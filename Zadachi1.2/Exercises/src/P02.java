import java.util.Scanner;

public class P02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Въведете число: ");
        int num = sc.nextInt();

        GetFactoriel(num);
    }

    public static void GetFactoriel(int num){
        int factoriel = 1;

        for (int i = 1; i <= num; i++) {
            factoriel *= i;
        }

        System.out.println("Факториел на " + num + " e " + factoriel);
    }
}
