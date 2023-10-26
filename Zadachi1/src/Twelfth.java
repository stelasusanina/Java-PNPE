import java.util.Scanner;

public class Twelfth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[2];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        if(arr[0] == arr[1]){
            System.out.println("Равни");
        }
    }
}
