import java.util.Scanner;
public class ConsecDupRemoval {
    String dupRemove(String str) {
        // Your work here
        int length = str.length();
        if(length == 2){
            if(str.charAt(length-1) != str.charAt(length - 2)){
                return str;
            }
            else{
                return "" + str.charAt(0);
            }
        }
        else if(str.charAt(length-1) != str.charAt(length - 2)){
            return dupRemove(str.substring(0, length - 1)) + str.charAt(length-1);
        }
        else{
            return dupRemove(str.substring(0, length - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = (new ConsecDupRemoval()).dupRemove(str);
        System.out.print(result);
    }
}