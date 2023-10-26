public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        int min = FindMinEl(arr);
        int max = FindMaxEl(arr);
        System.out.printf("Макс: %d, Мин: %d", max, min);
    }

    public static int FindMinEl(int[] arr){
        int currentMin = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < currentMin){
                currentMin = arr[i];
            }
        }

        return  currentMin;
    }

    public static int FindMaxEl(int[] arr){
        int currentMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > currentMax){
                currentMax = arr[i];
            }
        }

        return  currentMax;
    }
}