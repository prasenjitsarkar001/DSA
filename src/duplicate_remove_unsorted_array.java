import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class duplicate_remove_unsorted_array {
     static void main() {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        List<Integer> result = duplicate.removeDuplicate(arr1,n);
         System.out.print("array after remove duplicate :" );
         for(int i : result){
             System.out.print(i + " ");
         }
    }
}
class duplicate{
    public static List<Integer> removeDuplicate(int[] arr,int n){
        HashMap<Integer,Boolean> seen = new HashMap<Integer,Boolean>();
        List<Integer> result =new ArrayList<>();
        for(int val: arr){
            if(!seen.containsKey(val)){
                result.add(val);
                seen.put(val,true);
            }
        }
        return result;
    }
}