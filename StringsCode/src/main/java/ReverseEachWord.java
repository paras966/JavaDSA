import java.util.Scanner;

public class ReverseEachWord {
    public static String reverse(String s){
        String newStr = "";
        for(int i=s.length()-1; i>=0; i--){
            newStr = newStr + s.charAt(i);
        }
        return newStr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        for (String str:s){
            System.out.print(reverse(str) + " ");
        }
    }
}
