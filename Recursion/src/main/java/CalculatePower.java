import java.util.Scanner;

public class CalculatePower {

    public static int calculatePower(int base, int power){
        if(power==1)
            return base;
        return base * calculatePower(base, power-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int power = sc.nextInt();
        System.out.print(calculatePower(base, power));
    }
}
