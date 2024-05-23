import java.util.Scanner;

public class AllIndexOfElement {

    public static int indexElement(int[] arr, int checkNum, int ind){
        if(ind == arr.length)
            return -1;
        if(arr[ind] == checkNum){
            System.out.print(ind + " ");
        }
//        int[] smallArr = new int[arr.length-1];
//        for(int i =1; i<arr.length; i++){
//            smallArr[i-1] = arr[i];
//        }
        return indexElement(arr, checkNum, ind+1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int checkNum = sc.nextInt();
        int[] arr = new int[num];
        for(int i =0; i< num; i++){
            arr[i]=sc.nextInt();
        }
        indexElement(arr, checkNum, 0);
    }
}