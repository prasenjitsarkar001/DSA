import java.util.Scanner;

public class Remove_brackets {
    static void main() {
        removee obj = new removee();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(obj.rb(str));
    }
}
class removee{
    String rb(String str){
        StringBuilder result = new StringBuilder();
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch != '(' && ch != ')'){
                result.append(ch);
            }
        }
        return result.toString();
    }
}