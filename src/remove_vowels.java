import java.util.Scanner;

public class remove_vowels {
    static void main() {
        remove obj = new remove();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(obj.rv(str));
    }
}
class remove{
    String rv(String str){
        str=str.toLowerCase();
        StringBuilder result = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                continue;
            }
            result.append(ch);
        }
        return result.toString();
    }
}