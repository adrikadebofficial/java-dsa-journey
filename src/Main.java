import java.util.HashMap;

public class Main {

    public int findMax(int[] arr){
        int x = arr[0];
        for (int i = 0; i < arr.length ; i++){
            if(x < arr[i]){
                x = arr[i];
            }
        }
        return x;
    }

    public int findMin(int[] arr){
        int x = arr[0];
        for (int i = 0; i < arr.length ; i++){
            if(x > arr[i]){
                x = arr[i];
            }
        }
        return x;
    }

    public int findSum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {50, 246, 718, 91, 'a','A'};
        Main _class = new Main();
        System.out.println("Max: " + _class.findMax(nums));
        System.out.println("Min: " + _class.findMin(nums));
        System.out.println("Sum: " + _class.findSum(nums));
    }
}