import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(a);
        System.out.println(a.charAt(0));
        System.out.println(a.contains("par"));
        System.out.println(a.substring(1,4));
        System.out.println(a.length());
    }
}
//input  == paras

//paras
//p
//true
//ara
//5