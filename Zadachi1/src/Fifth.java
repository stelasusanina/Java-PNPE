public class Fifth {
    public static void  main(String[] args){
        int[] arr = new int[] {4, 28, 50, 7, 30};

        int biggestNum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > biggestNum){
                biggestNum = arr[i];
            }
        }

        System.out.println(biggestNum);
    }
}
