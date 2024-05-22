import java.util.Scanner;

public class CheckIfNumberExistInArray {

    public static boolean checkNum(int[] arr, int numCheck){
        if(arr.length == 1 && arr[0]!=numCheck)
            return false;
        if(arr[0]==numCheck)
            return true;
        int[] smallArr = new int[arr.length-1];
        for(int i=1; i<arr.length; i++)
            smallArr[i-1]=arr[i];
        return checkNum(smallArr, numCheck);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int numCheck = sc.nextInt();
        int[] arr = new int[num];
        for(int i =0; i<num; i++)
            arr[i]= sc.nextInt();
        System.out.print(checkNum(arr, numCheck));
    }
}
