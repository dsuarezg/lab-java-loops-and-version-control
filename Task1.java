import java.util.Arrays;

public class Task1 {

    public static int minMaxDifference (int[] arr) {
        if (arr.length < 1) {
            System.out.println("Array length is less than 2");
            }
        return Arrays.stream(arr).max().getAsInt() - Arrays.stream(arr).min().getAsInt();}



    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        System.out.println(minMaxDifference(arr));
    }
}
