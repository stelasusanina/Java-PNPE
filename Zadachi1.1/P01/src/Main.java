public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        System.out.printf("Сума: %d, Четни: %d, Нечетни: %d", SumOfAllElements(arr), SumOfAllEvenNumbers(arr), SumOfAllOddNumbers(arr));
    }

    public static int SumOfAllElements(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        return sum;
    }

    public static int SumOfAllEvenNumbers(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                sum += arr[i];
            }
        }

        return sum;
    }

    public static int SumOfAllOddNumbers(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                sum += arr[i];
            }
        }

        return sum;
    }
}