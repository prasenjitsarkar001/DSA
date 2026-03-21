import java.util.Scanner;

public class capital_1st_last_word {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word : words){
            if(word.length()==1){
                result.append(Character.toUpperCase(word.charAt(0)));
            }else{
                char first =Character.toUpperCase(word.charAt(0));
                char last =Character.toUpperCase(word.charAt(word.length()-1));
                String middle = word.substring(1,word.length()-1);

                result.append(first+middle+last);
            }
            result.append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
