import java.util.Scanner;
public class BracketChecking{
    public static boolean CheckBracket (String s){
        int fopen = s.indexOf("{");
        int foff = s.indexOf("}");
        if(fopen == -1 && foff == -1){
            return true;
        }
        else if((fopen >= 0 && foff == -1) || (fopen == -1 && foff >= 0)){
            return false;
        }
        String cut = "";
        int lopen = s.lastIndexOf("{");
        int loff = s.lastIndexOf("}");
        if(fopen < foff){
            cut = s.substring(fopen + 1, loff) + s.substring(loff + 1);
            return true && CheckBracket(cut);
        }
        else{
            cut = s.substring(foff + 1, lopen) + s.substring(lopen + 1);
            return true && CheckBracket(cut);
        }
    }
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(CheckBracket(str));
    }
}