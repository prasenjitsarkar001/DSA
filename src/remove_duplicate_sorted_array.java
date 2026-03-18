import java.util.Scanner;

public class remove_duplicate_sorted_array {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        int k =dup.dup_array(arr1,n);
        System.out.println("unique count :" + k);
        for(int i=0;i<k;i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
class dup{
    public  static int dup_array(int[] arr,int n){
        if(n==0) return 0;
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
}