import java.util.Arrays;
import java.util.Scanner;

class solutionn {
    public static int smallest2(int[] arr, int n){
        int min = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}

public class smallest_element2 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println(solutionn.smallest2(arr1,n));
    }
}
