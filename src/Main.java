import Maps.HashMaps;
import Maps.Phonebook;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean flag = true;
        Phonebook contactBook = new Phonebook();
        Scanner sc = new Scanner(System.in);

        System.out.println("*********Phonebook**********");
        System.out.println("You can ADD, SEARCH, DELETE and DISPLAY contacts.");

        while(flag){
            System.out.print("Enter your command: ");
            String input = sc.nextLine();
            String[] inputArray = input.trim().split("\\s+");
            String command = inputArray[0];

            switch (command){
                case "ADD":
                    contactBook.add(inputArray[1], inputArray[2]);
                    break;
                case "SEARCH":
                    contactBook.search(inputArray[1]);
                    break;
                case "DELETE":
                    contactBook.remove(inputArray[1]);
                    break;
                case "DISPLAY":
                    contactBook.display();
                    break;
                case "EXIT":
                    flag = false;
                    break;
                default:
                    System.out.println("Either input format or command is wrong. Please try again");
            }
        }


    }
}