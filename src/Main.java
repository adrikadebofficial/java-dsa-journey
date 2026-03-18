
public class Main {

    public static int addTwoNumbers(int num1, int num2){
        return num1 + num2;
    }

    public static String checkEvenOrOdd(int num){
        if(num % 2 == 0){
            return "Even";
        }else{
            return "Odd";
        }
    }

    public static int findMax(int a , int b){
        return ((a > b)? a: b);

    }

    public static void main(String[] args) {
    System.out.println("Sum of 2 numbers is: " +addTwoNumbers(10, 35));
    System.out.println("The number is: " +checkEvenOrOdd(737));
    System.out.println("The maximum is: " +findMax(1000, 45));

    }
}