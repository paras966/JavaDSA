import java.security.PublicKey;
import java.util.Scanner;

public class Printnumbers {
    static boolean flag=false;
    static int number=1;
    public static void printNumbers(int num){
        if(num==0) {
            return ;
        }
        printNumbers(num-1);
        System.out.print(num + " ");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printNumbers(num);

    }
}
