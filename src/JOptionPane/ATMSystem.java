package JOptionPane;

import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int AdminPin = 1234;

        String correctPin = "PIN Correct! Welcome to Java Bank.";

        String incorrectPin = "Incorrect PIN. Try again.";

        int userInput;
        int Error = 0;

        while (true) {

            System.out.print("ENTER 4-DIGIT PIN: ");
            userInput = input.nextInt();


            if(userInput == AdminPin){

                System.out.println("GOOD");
                session();
                break;
            } else if(userInput != AdminPin){
                System.out.println("Wrong");
                Error++;
                System.out.println("ATTEMPT: " + Error);
                if(Error == 3){
                    System.out.println("bye");
                    break;
                }
                continue;
            } else{
                System.out.println("enter the right value");
                continue;
            }




        }// ending of the while loop
    } // ending of the main
    private static void session(){
        System.out.println("successfully entered here!!");
    }

} //ending of the Class ATMSytem
