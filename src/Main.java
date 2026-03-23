import Array.ArrayClass;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = {17,42, 61,77, 35, 18, 19};
        int target = 60;

        ArrayClass _array = new ArrayClass();

        System.out.println(Arrays.toString(_array.twoSum(nums, target)));
    }
}