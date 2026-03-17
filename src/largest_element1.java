import java.util.Arrays;
import java.util.Scanner;

class sol{
    public static int large1(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
public class largest_element1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println(sol.large1(arr1));
    }
}
