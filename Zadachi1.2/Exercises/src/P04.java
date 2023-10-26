import java.util.Scanner;

public class P04 {
    public static void main(String[] args){
        GetSumOfSecondRow();
    }

    public static void GetSumOfSecondRow(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sumSecondRow = 0;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();

                if(i == 1){
                    sumSecondRow += matrix[i][j];
                }
            }
        }

        System.out.println(sumSecondRow);
    }
}
