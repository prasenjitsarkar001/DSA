import java.util.Arrays;

class solution {
    static int sortArray(int[] arr) {
        Arrays.sort(arr);
        return arr[0];

    }
}


public class Smallest_element {
    static void main() {
        int[] arr1={3,5,6,63,7,8,2,5,7,262,6,373,89,3737,3,1};
        System.out.println("smallest element "+ solution.sortArray(arr1));
    }
}
