import java.util.Scanner;
public class KeepTwo {
    String keepTwo(String str) {
        // You can enter your code here, and only here.
        int in2 = str.indexOf(str.charAt(0),1);
        int in3 = str.indexOf(str.charAt(0), in2 + 1);
        if(str.length() <= 2){
            return str;
        }
        if(in3 == -1 || in2 == -1){
            return str.charAt(0) + keepTwo(str.substring(1));
        }
        else{
            String s1 = str.substring(0 , in3);
            String s2 = str.substring(in3 + 1);
            return keepTwo(s1 + s2);
        }
    }
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        KeepTwo kt = new KeepTwo();
        String answer = kt.keepTwo(str);
        System.out.print(answer);
    }
}