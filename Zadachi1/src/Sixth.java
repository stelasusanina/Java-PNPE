public class Sixth {
    public static  void main(String[] args){
        int[][] matrix = new int[][] {{1, 2}, {3, 4}};

        int sumOfMainDiagonal = 0;
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                if(i == j){
                    sumOfMainDiagonal += matrix[i][j];
                }
            }
        }

        System.out.println(sumOfMainDiagonal);
    }
}
