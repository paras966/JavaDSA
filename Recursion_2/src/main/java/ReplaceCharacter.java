import java.util.Scanner;

public class ReplaceCharacter {

    public static String replaceChar(String str, char c, char cr, String newStr){
        if(str.isEmpty()){
            return newStr;
        }
        if(str.charAt(0)==c)
            newStr+=cr;
        else
            newStr+=str.charAt(0);
        return replaceChar(str.substring(1),c,cr,newStr);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.next().charAt(0);
        char cr = sc.next().charAt(0);
        System.out.print(replaceChar(str,c,cr,""));

    }
}
