import java.util.Scanner;

public class Array2D {

    public static int[][] inputArray(int row, int col){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.println("Enter Element of row "+ i + " and column "+ j);
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void printArray(int[][] arr){
        for(int[] r:arr){
            for(int e:r){
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] a = new int[2][2];
        a[0][0] = 5;

        int[][] a2 = {{1,2},{3,4}};
        System.out.println(a[0][0]+ a2[1][1]);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter Number of columns : ");
        int col = sc.nextInt();
        int[][] arr = inputArray(row, col);
        printArray(arr);

    }
}
