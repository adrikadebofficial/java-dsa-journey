public class Main {

    public int findMaxIndex(int[] arr){
        int max = arr[0];
        int index = 0;
        for(int i= 1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    public void allElementsSame(int[] arr){
        int count, num;
        num = arr[0]; count = 0;
        for(int i= 1; i < arr.length; i++){
            if(num == arr[i]){
                count++;
            }
        }
        if(count == arr.length -1){
            throw new IllegalArgumentException("All numbers are the same");
        }
    }

    public int findN(int[] arr, int n){

        allElementsSame(arr);

        if(arr.length < n){
           throw new IllegalArgumentException("Number is out of bounds and cannot be processed");
        }

        for(int i = 1; i < n; i++){
            int num = findMaxIndex(arr);
            arr[num] = Integer.MIN_VALUE;
        }
        int num = findMaxIndex(arr);
        return arr[num];
    }


    public static void main(String[] args) {
        int[] nums = {90,90,90,90,90,90};
        Main _class = new Main();
        int[] copyNums = nums.clone();
        try {
            System.out.println( "Nth Largest Number: " + _class.findN(copyNums, 2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}