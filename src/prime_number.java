import java.util.Scanner;

public class prime_number {
    static void main() {
        prime obj = new prime();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(obj.checkPrime(n)){
            System.out.println(n + " is a prime number");
        }else{
            System.out.println(n +" is not a prime number");
        }
    }
}
class prime{
    public boolean checkPrime(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                count++;
            }
        }
        return count == 2;
    }
}