import java.util.Arrays;

public class Task2 {

    public static void smallestElements (int[] arr) {

        int [] aux = Arrays.stream(arr).sorted().toArray();
        System.out.println("Smallest elements: " + aux[0] + ", " + aux[1]);

    }
    

    public static void main(String[] args) {
        int [] arr = {8,21, 2, 3, 4, 5};
        smallestElements(arr);
    }
}
