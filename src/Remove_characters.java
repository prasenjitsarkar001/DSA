import java.util.Scanner;

public class Remove_characters {
    static void main() {
        removess obj = new removess();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(obj.ch(str));
    }
}
class removess{
    String ch(String str){
        str=str.toLowerCase();
        StringBuilder result = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if( ch >= 'a' && ch <= 'z')
                result.append(ch);
        }
        return result.toString();
    }
}