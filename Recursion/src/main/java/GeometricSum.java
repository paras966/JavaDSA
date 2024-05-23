import java.util.Scanner;

public class GeometricSum {
    public static double geometricSum(int num){
        if(num==0)
            return 1;
        return 1/(Math.pow(2,num)) + geometricSum(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(geometricSum(num));
    }
}
