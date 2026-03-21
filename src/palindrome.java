import java.util.Scanner;

public class palindrome {
    static void main() {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        if(pal.palin(n)){
            System.out.println(n + " palindrome number");
        }else{
            System.out.println(n  + "not palindrome number");
        }
    }
}
class pal{
    public static boolean palin(int n){
        int rev=0;
        int dup = n;
        while (n > 0) {
            int num = n%10;
            rev =(rev*10)+num;
            n=n/10;
        }
        return dup == rev;
    }
}