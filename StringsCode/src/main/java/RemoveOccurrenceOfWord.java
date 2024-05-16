import java.util.Scanner;

public class RemoveOccurrenceOfWord {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();
        char a = sc.next().charAt(0);
        String newStr = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != a){
                newStr = newStr + s.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}
