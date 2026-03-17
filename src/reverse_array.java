import java.util.Collections;
import java.util.Scanner;

class solu{
    static void reverseArray(int[] arr,int n) {
        int p1=0;
        int p2= n-1;
        while (p1<p2) {
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;

            p1++;
            p2--;
        }
    }
}

public class reverse_array {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1= new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        solu.reverseArray(arr1,n);
        for(int num : arr1){
            System.out.println(num + " ");
        }
    }

}
