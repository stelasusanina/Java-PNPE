import java.util.Scanner;

public class Eleventh {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете число, за да проверите дали е по-голямо от 10:");

        int number = sc.nextInt();
        if(number > 10){
            System.out.println("По-голямо от 10");
        }
        else{
            System.out.println("По-малко от 10");
        }
    }
}
