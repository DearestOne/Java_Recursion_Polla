import java.util.Scanner;
public class GoInside {
    String goInside(String str, boolean front) {
        // You can enter your code here, and only here.
        int l = str.length();
        if(l <= 1){
            return str;
        }
        if(front){
            return "" + str.charAt(0) + str.charAt(l - 1) + goInside(str.substring(1,l - 1),false);
        }
        else{
            return "" + str.charAt(l - 1) + str.charAt(0) + goInside(str.substring(1,l - 1),true);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        GoInside gi = new GoInside();
        String answer = gi.goInside(str, true);
        System.out.println(answer);
    }
}