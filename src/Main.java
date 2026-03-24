import Maps.HashMaps;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = {17, 19, 51, 72, 5};
        int target = 91;
        HashMaps hm = new HashMaps();
        System.out.println(Arrays.toString(hm.twosum(nums, target)));;

    }
}