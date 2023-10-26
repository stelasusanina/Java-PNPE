import java.util.Scanner;

public class Tenth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете число, за да проверите дали е положително или отрицателно:");

        int number = sc.nextInt();
        if(number > 0){
            System.out.println("Положително");
        }
        else if (number < 0){
            System.out.println("Отрицателно");
        }
        else{
            System.out.println("Въведеното число е 0");
        }
    }
}
