public class Seventh {
    public  static  void main(String[] args){
        int[][] matrix = new int[][] {{1, 2}, {3, 4}};

        int sumOfFirstRow = 0;
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                if(i == 0){
                    sumOfFirstRow += matrix[i][j];
                }
            }
        }

        System.out.println(sumOfFirstRow);
    }
}
