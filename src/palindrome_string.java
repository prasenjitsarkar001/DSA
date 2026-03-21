import java.util.Scanner;

public class palindrome_string {
    static void main() {
        pall obj = new pall();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(obj.ispal(str));
    }
}
class pall{
    boolean ispal(String str){
        int start =0;
        int end = str.length()-1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}