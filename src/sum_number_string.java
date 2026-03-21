import java.util.Scanner;

public class sum_number_string {
    static void main() {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        int sum =0;
        int num=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                num = num*10 +(ch - '0');
            }else{
                sum +=num;
                num=0;
            }
        }
        sum += num;
        System.out.println(sum);
    }
}
