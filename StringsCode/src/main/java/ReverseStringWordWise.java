import java.util.Scanner;

public class ReverseStringWordWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        for(int i=s.length-1; i>=0; i--){
            System.out.print(s[i].concat(" "));
        }
    }
}
