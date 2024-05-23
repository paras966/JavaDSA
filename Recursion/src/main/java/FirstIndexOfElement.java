import java.util.Scanner;

public class FirstIndexOfElement {

    public static int indexOfElement(int[] arr, int checkNum, int ind){
        if(ind == arr.length)
            return -1;
        if(arr[ind]==checkNum)
            return ind;
//        int[] smallArr = new int[arr.length-1];
//        for(int i =1; i<arr.length; i++){
//            smallArr[i-1] = arr[i];
//        }
        return indexOfElement(arr, checkNum, ind+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int checkNum = sc.nextInt();
        int[] arr = new int[num];
        for(int i =0; i< num; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(indexOfElement(arr, checkNum, 0));
    }
}
