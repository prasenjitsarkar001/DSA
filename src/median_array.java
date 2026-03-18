import java.util.Arrays;
import java.util.Scanner;

public class median_array {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        med.median(arr1,n);
    }
}
class med{
    public static void median(int[] arr,int n){
        Arrays.sort(arr);
        if(n%2 == 0){
            int x1 = (n/2)-1;
            int x2 = (n/2);
            System.out.println((double)(arr[x1]+arr[x2])/2);
        }else  {
            System.out.println(arr[n/2]);
        }
    }
}