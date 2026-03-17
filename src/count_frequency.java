import java.util.Scanner;

public class count_frequency {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1= new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        count.countFrequency(arr1,n);
    }
}

class count{
    public static void countFrequency(int[] arr,int n){
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
           if(visited[i])
            continue;

           int count=1;
           for(int j=i+1;j<n;j++){
               if(arr[i] == arr[j]){
                   visited[j] = true;
                   count++;
               }
           }
            System.out.println(arr[i] + " -> "+ count);
        }

    }
}