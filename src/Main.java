
public class Main {
    public static void main(String[] args) {
        // FizzBuzz program
        /*Loop through numbers 1 to 100
        Print "Fizz" if the number is divisible by 3
        Print "Buzz" if the number is divisible by 5
        Print "FizzBuzz" if it's divisible by both 3 and 5
        Otherwise, just print the number itself
        * */

        for(int i = 1; i <= 100; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            }else if(i% 3 == 0){
                System.out.println("Fizz");
            }else if(i%5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println("Number is : " + i );
            }

        }


    }
}