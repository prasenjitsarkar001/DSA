import java.util.Scanner;

public class remove_spaces {
    static void main() {
        removes obj = new removes();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(obj.sp(str));
    }
}
class removes{
    String sp(String str){
        str=str.toLowerCase();
        StringBuilder result = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch== ' '){
                continue;
            }
            result.append(ch);
        }
        return result.toString();
    }
}