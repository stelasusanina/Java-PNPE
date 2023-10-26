public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Сума с повторение: " + SumOfDiagonals(matrix));
        System.out.println("Сума без повторение: " + SumOfDiagonalsWithoutRepetitiveEl(matrix));
    }

    public static int SumOfDiagonals(int[][] matrix){
        int sum = 0;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(i == j){
                    sum += matrix[i][j];
                }

                if((i+j) == matrix.length - 1){
                    sum += matrix[i][j];
                }
            }
        }

        return  sum;
    }

    public static int SumOfDiagonalsWithoutRepetitiveEl(int[][] matrix){
        int sum = 0;
        int repetitiveEl = 0;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(i == j){
                    sum += matrix[i][j];
                }

                if((i+j) == matrix.length - 1){
                    sum += matrix[i][j];
                }

                repetitiveEl = matrix[1][1];
            }
        }

        return  sum-repetitiveEl;
    }
}
