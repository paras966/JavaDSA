import java.util.Scanner;

public class SumOfDigits {
    public static int sum(int num, int sum){
        if(num/10 == 0)
            return sum+num;
        int rem = num % 10;
        sum = sum + rem;
        num = num/10;
        return sum(num,sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(sum(num,0));
    }
}
