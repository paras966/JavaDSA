import java.util.Scanner;

public class CheckArraySorted {
    public static boolean checkSorted(int[] arr, int num){
        if(num<=1)
            return true;
        if(arr[0]>arr[1])
            return false;
        int[] smallArr = new int[num-1];
        for(int i=1; i<num; i++)
            smallArr[i-1] = arr[i];
        return checkSorted(smallArr, num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++)
            arr[i] = sc.nextInt();
        System.out.print(checkSorted(arr,num));
    }
}
