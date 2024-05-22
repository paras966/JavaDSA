import java.util.Scanner;

public class SumOfTheArrays {

    public static int sumArray(int[] arr, int num){
        if(num==arr.length)
            return 0;
        return arr[num] + sumArray(arr, num+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(sumArray(arr,0));
    }
}