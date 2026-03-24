package Maps;
import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    //TwoSum with HashMaps
    public int[] twosum(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] indexArray = new int[2];

        for(int i=0; i < arr.length; i++){
            int numTwo = target - arr[i];
            if(map.containsKey(numTwo)){
                indexArray[0] = i;
                indexArray[1] = map.get(numTwo);
            }else{
                map.put(arr[i], i);
            }
        }
        return indexArray;
    }

}
