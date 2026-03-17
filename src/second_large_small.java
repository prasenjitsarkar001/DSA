import java.util.Arrays;
import java.util.Scanner;

class ls{
    public static void secondLS(int[] arr , int n){
        if(n==0 || n==1){
            System.out.println(-1 + " " + -1);
            return ;
        }
        Arrays.sort(arr);
        int s = arr[1];
        int l = arr[n-2];
        System.out.println("second smallest :"+ s);
        System.out.println("second largest :"+ l);
    }
}
public class second_large_small {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1= new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        ls.secondLS(arr1,n);
    }
}
