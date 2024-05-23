import java.util.Scanner;

public class CheckPalindrom {
    public static boolean checkPalindrom(String str){
        if(str.isEmpty() || str.length()==1)
            return true;
        if(str.charAt(0) != str.charAt(str.length()-1))
            return false;
        return checkPalindrom(str.substring(1, str.length()-1));
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(checkPalindrom(str));
    }
}
