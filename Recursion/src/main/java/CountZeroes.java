import java.util.Scanner;

public class CountZeroes {
    public static int countZeros(int num, int count){
        if(num/10 == 0)
            return count;
        if(num % 10 == 0)
            count++;
        num = num /10;
        return countZeros(num, count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        System.out.print(countZeros(num,0));
    }
}
