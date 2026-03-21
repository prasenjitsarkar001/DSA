import java.util.Locale;
import java.util.Scanner;

public class count_vowel_consonent_spaces {
    static void main() {
        countt obj = new countt();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        obj.iscount(str);
    }
}
class countt{
    void iscount(String str){
        int vowel=0,consonent=0,space=0;
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowel++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonent++;
            } else if (ch == ' ') {
                space++;
            }

        }
        System.out.println("vowels : " + vowel);
        System.out.println("consonent : "+consonent);
        System.out.println(("spaces : " + space ));
    }
}