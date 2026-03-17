import java.util.Scanner;

public class sum_array {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1= new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println(sum.sumArray(arr1,n));
    }
}
class sum{
    public static int sumArray(int[] arr,int n){
        int sum =0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        return sum;
    }
}
