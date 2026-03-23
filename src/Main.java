import Array.ArrayClass;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = {3,4,6,4,6};
        ArrayClass _array = new ArrayClass();
        System.out.println(String.valueOf(_array.containsDuplicate(nums)));

    }
}