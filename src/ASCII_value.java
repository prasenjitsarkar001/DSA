import java.util.Scanner;

public class ASCII_value {
    static void main() {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            System.out.println(ch + " -> "+ascii);
        }
    }
}
