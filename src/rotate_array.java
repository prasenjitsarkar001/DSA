import java.util.Scanner;

public class rotate_array {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr1= new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int[] arrCopy = arr1.clone(); // preserve original
        rotate obj = new rotate();
        obj.leftRotate(arr1, d);

        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println(" ");

        obj.rightRotate(arrCopy, d);

        for (int num : arrCopy) {
            System.out.print(num + " ");
        }
    }
}
class rotate{
    public static void rotateArray(int[] arr,int start,int end){

        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    void leftRotate(int[] arr, int d){
        int n= arr.length;
        d=d % n;
        if(d==0) return;
        rotateArray(arr,0,d-1);
        rotateArray(arr,d,n-1);
        rotateArray(arr,0,n-1);
    }
    void rightRotate(int[] arr,int d){
        int n= arr.length;
        leftRotate(arr,n-(d%n));
    }
}
