public class Third {
    public  static  void main(String[] args){
        int[] arrNum = {10, 20, 5};
        int sumOfOddNumbers = 0;

        for (int i = 0; i < arrNum.length; i++){
            if(arrNum[i] % 2 != 0){
                sumOfOddNumbers += arrNum[i];
            }
        }

        System.out.println(sumOfOddNumbers);
    }
}
