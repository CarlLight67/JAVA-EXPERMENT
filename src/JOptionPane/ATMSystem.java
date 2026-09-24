package JOptionPane;

import java.util.Scanner;

public class ATMSystem {

    public static void clearScreen() {
        try {
            // Check if running on Windows
            if (System.getProperty("os.name").contains("Windows")) {
                // Use 'cls' command for Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Use 'clear' for Linux/Mac
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            // Fallback if command fails
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }

    public static void time(long mill) {
        try {
            Thread.sleep(mill); // Waits
        } catch (InterruptedException e) {
            // Restore the interrupted status
            Thread.currentThread().interrupt();
        }
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int AdminPin = 1234;

        String correctPin = """
                ======================================================
                          PIN Correct! Welcome to Java Bank.
                ======================================================
                """;

        String incorrectPin = "Incorrect PIN. Try again.";



        int userInput;
        int Error = 0;

            while (true) {

                System.out.print("ENTER 4-DIGIT PIN: ");
                userInput = input.nextInt();


                if(userInput == AdminPin){

                    clearScreen();

                    System.out.println(correctPin);
                    session();
                    break;


                } // accepted value

                else if(userInput != AdminPin){
                    clearScreen();
                    System.out.println(incorrectPin);
                    Error++;
                    System.out.println("ATTEMPT: " + Error);
                    time(1000);
                    clearScreen();

                    if(Error == 2){

                        System.out.println("THIS IS YOUR LAST ATTEMPT!!!");
                        time(1000);
                        clearScreen();


                    } // warning if 2 is reach

                    else if (Error >= 3) {
                        System.out.println("TRY AGAIN LATER");
                        break;
                    }
                } //not accepted value



        }// ending of the while loop






    } // ending of the main
    private static void session(){
        System.out.println("successfully entered here!!");
    }

} //ending of the Class ATMSytem
