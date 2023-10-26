import java.util.Scanner;

public class Thirteenth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x%2 != 0 && x%3 != 0){
            System.out.println("Числото е просто");
        }
    }
}
