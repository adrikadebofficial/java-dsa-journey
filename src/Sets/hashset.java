package Sets;

import java.util.HashSet;

public class hashset {
    public boolean containsDuplicates(int[] arr){
        HashSet<Integer> sets = new HashSet<>();

        for(int num : arr){
            if(!sets.contains(num)){
                sets.add(num);
            }else{
                return true;
            }
        }

        return false;

    }

}
