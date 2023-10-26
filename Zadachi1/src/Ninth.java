import java.util.Scanner;

public class Ninth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете число, за да проверите дали е четно или нечетно:");

        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println("Четно");
        }
        else{
            System.out.println("Нечетно");
        }
    }
}
