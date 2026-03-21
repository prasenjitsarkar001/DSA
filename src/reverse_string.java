import java.util.Scanner;

public class reverse_string {
    static void main() {
        reverse obj = new reverse();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(obj.isreverse(str));
    }
}
class reverse{
    String isreverse(String str){
        StringBuilder result=new StringBuilder(str);
        result.reverse();
        return result.toString();
    }
}
