import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();
        String newStr="";
        char character = s.charAt(0);
        for(int i=1; i<s.length(); i++){
            if(character != s.charAt(i)) {
                newStr = newStr + character;
                character = s.charAt(i);
            }
            else
                continue;
        }
            System.out.println(newStr+s.charAt(s.length()-1));
    }
}
