import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String newstr = "";
        int count=1;
        char c = s.charAt(0);
        for(int i =1; i<s.length(); i++){
            if(s.charAt(i) != c){
                if(count>1)
                    newstr = newstr+c+count;
                else
                    newstr = newstr+c;
                c=s.charAt(i);
                count=1;
            }
            else
                count++;
        }
        if(count>1)
            newstr = newstr+c+count;
        else
            newstr = newstr+c;
        System.out.println(newstr);
    }
}
