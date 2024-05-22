import java.util.Scanner;

public class RowWiseSum {

//    public static int[][] inputArray(int row, int col){
//
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfArrays = sc.nextInt();
        for(int i=0; i<numberOfArrays; i++){
            System.out.println("enter row and col : ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            int[][] arr = Array2D.inputArray(row,col);
            for(int[] a:arr){
                int sum =0;
                for(int e:a){
                    sum+=e;
                }
                System.out.print(sum + " ");
            }
        }
    }
}
