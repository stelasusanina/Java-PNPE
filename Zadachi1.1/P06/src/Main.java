public class Main {
    public static void main(String[] args) {
        PrintTriangle(4);
    }

    public static void PrintTriangle(int height){
        for(int i = 0; i < height; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*  ");
            }

            System.out.println();
        }
    }
}