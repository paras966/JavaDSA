import java.util.Scanner;

public class NthFibonnaci {
    public static int fib(int num){
        if(num==0 || num==1)
            return num;
        return(fib(num-1) + fib(num-2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(fib(num));
    }
}
