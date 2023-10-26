import java.util.Arrays;
import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        GetAverage(arr);
    }

    public static void GetAverage(int[] arr){
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double avg = sum / arr.length;
        System.out.println(avg);
    }
}