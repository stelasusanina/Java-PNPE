public class Second {
    public  static  void main(String[] args){
        int[] arrNum = {10, 20, 5};
        int sumOfEvenNumbers = 0;

        for (int i = 0; i < arrNum.length; i++){
            if(arrNum[i] % 2 == 0){
                sumOfEvenNumbers += arrNum[i];
            }
        }

        System.out.println(sumOfEvenNumbers);
    }
}
