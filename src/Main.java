import Sets.hashset;

public class Main {

    public static void main(String[] args) {

        int[] nums = {5,6,2,9,7,1};
        hashset _classSet = new hashset();
        System.out.println(_classSet.containsDuplicates(nums));
    }
}