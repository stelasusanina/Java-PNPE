import java.util.Arrays;

public class Fourth {
    public  static  void main(String[] args){
        int[] arr = new int[] {1, 2, 3, 4, 5};

        int[] reversedArr = new int[5];

        for (int i = 0; i < arr.length; i++){
            reversedArr[arr.length - i - 1] = arr[i];
        }

        System.out.println(Arrays.toString(reversedArr));
    }
}
