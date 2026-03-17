import java.util.Arrays;
import java.util.Scanner;

public class rearrange_array {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1= new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        rearrange.rearrangeArray(arr1,n);
        for(int num : arr1){
            System.out.println(num + " ");
        }
    }
}

class rearrange{
    public static void rearrangeArray(int[] arr,int n){
        Arrays.sort(arr);
        for(int i=n/2,j=n-1;i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}