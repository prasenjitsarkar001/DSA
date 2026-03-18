import java.util.Scanner;

public class average_array {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        average.avg(arr1,n);
    }
}
class average{
    public static void avg(int[] arr,int n){
        double sum =0;
        for(int i=0;i<n;i++){
            sum += (double) arr[i];
        }
        double average = sum/n;
        System.out.println(average);
    }
}