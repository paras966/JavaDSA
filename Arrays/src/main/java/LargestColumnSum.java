import java.util.Scanner;
public class LargestColumnSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfArrays = sc.nextInt();
        int row = sc.nextInt();
        int col = sc.nextInt();
        int largestSum=0;
        int[][] arr = Array2D.inputArray(row,col);
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int[] a: arr){
                sum+=a[i];
            }
            if(sum>largestSum)
                largestSum=sum;
    }
        System.out.print(largestSum);
    }
}