import java.util.Scanner;

public class LastIndexOfElement {
    public static int indexOfElement(int[] arr, int checkNum, int ind){
        if(ind<0)
            return -1;
        if(arr[ind]==checkNum)
            return ind;
//        int[] smallArr = new int[arr.length-1];
//        for(int i =0; i<arr.length-1; i++){
//            smallArr[i] = arr[i];
//        }
        return indexOfElement(arr, checkNum, ind-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int checkNum = sc.nextInt();
        int[] arr = new int[num];
        for(int i =0; i< num; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(indexOfElement(arr, checkNum, arr.length-1));
    }
}
