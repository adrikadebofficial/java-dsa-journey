package Maps;
import java.util.HashMap;


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

    public int wordFrequencyCalc(String paragraph, String word){
        HashMap<String, Integer> map = new HashMap<>();
        int counter;
        String lowerParagraph = paragraph.toLowerCase();
        String[] words = lowerParagraph.trim().split("\\s+");

        for(int i=0; i< words.length; i++){
            words[i] = words[i].replaceAll("^[^a-zA-Z0-9]+|[^a-zA-Z0-9]+$", "");
        }

        for(int i= 0; i < words.length; i++){
            if(map.containsKey(words[i])){
                counter = map.get(words[i]) + 1;
                map.put(words[i], counter);
            }else{
                counter = 1;
                map.put(words[i], counter);
            }
        }

        if(map.containsKey(word)){
            return map.get(word);
        }
        return 0;
    }

}
