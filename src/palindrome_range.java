import java.util.Scanner;

public class palindrome_range {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max= sc.nextInt();
        for(int i=min;i<max;i++){
            if(range.ispalin(i)){
                System.out.print(i + " ");
            }
        }
    }
}
class range{
    public static boolean ispalin(int n){
        int rev=0;
        int temp =n;
        while (temp >0){
            rev = (rev*10)+temp%10;
            temp = temp/10;
        }
        return rev == n;
    }
}