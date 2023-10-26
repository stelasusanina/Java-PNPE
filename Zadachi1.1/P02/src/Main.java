import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(ReverseArray(arr)));
    }

    public static int[] ReverseArray(int[] arr){
        int[] reversedArray = new int[10];
        for(int i = 0; i < arr.length; i++){
            reversedArray[reversedArray.length-i-1] = arr[i];
        }

        return reversedArray;
    }
}