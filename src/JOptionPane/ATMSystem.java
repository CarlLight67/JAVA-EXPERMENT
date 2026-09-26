package JOptionPane;

import com.sun.source.doctree.RawTextTree;

import java.util.Scanner;

public class ATMSystem {

    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }

    public static void time(long mill) {
        try {
            Thread.sleep(mill);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String adminPin = "1234";

        String correctPin = """
                ======================================================
                          PIN Correct! Welcome to Java Bank.
                ======================================================
                """;

        String incorrectPin = """
                ======================================================
                              Incorrect PIN. Try again.
                ======================================================
                """;

        String failedToEnter = """
                ======================================================
                         YOU FAILED TO ENTER THE RIGHT PIN!!!
                ======================================================
                """;

        String userInput;
        int error = 0;

        clearScreen();
        while (true) {
            System.out.println("FAILED ATTEMPTS: " + error + "\n");
            System.out.print("ENTER 4-DIGIT PIN: ");
            userInput = input.nextLine().trim();

            // 1. SUCCESS CHECK
            if (userInput.equals(adminPin)) {
                clearScreen();
                System.out.println(correctPin);
                system();
                break;
            }

            // 2. FAIL: Not 4 digits
            if (userInput.length() != 4) {
                error++;
                System.out.println("PIN MUST BE EXACTLY 4 DIGITS!");
            }
            // 3. FAIL: 4 digits, but wrong PIN
            else {
                error++;
                System.out.println(incorrectPin);
            }

            // Check max attempts ONCE after any failure
            if (error == 2) {
                System.out.println("THIS IS YOUR LAST ATTEMPT!!!");
                time(2000);
            } else if (error >= 3) {
                System.out.println(failedToEnter);
                break; // Lock out user
            }

            time(1500);
            clearScreen();
        }

        input.close();
    } // ending of main

    private static void system() {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                ======================================================
                              Successfully entered here!!                        
                ======================================================
                """);
        time(1000);
        clearScreen();
        //===========================================================

        double AccountBalance = 500;

        String Deposit = "Deposit feature coming soon!";

        String Exit = "Thank you for using Java Bank. Goodbye!";

        //===========================================================
        String showCase = ("""
                
                1. Check Balance
                2. Deposit Money
                3. Exit
                Select an option (1-3)
                """);
        while (true) {

            try{

                System.out.println(showCase);


                System.out.print("Enter: ");

                String rawInput = input.nextLine();
                int GetOption = Integer.parseInt(rawInput.trim());

                if (GetOption == 1) {
                    clearScreen();
                    String DataBalance = """
                        =============================
                        Your current balance is: %s
                        """.formatted(AccountBalance) + """
                        =============================
                        """;
                    System.out.println(DataBalance);
                    continue;
                } //ending of option 1


                else if (GetOption == 2) {
                    clearScreen();
                    System.out.println("""
                        =============================
                                DEPOSIT MONEY
                        =============================
                        """);
                    System.out.print("ENTER THE AMOUNT:");
                    String RawAddMoney = input.nextLine();
                    double AddMoney = Double.parseDouble(RawAddMoney);
                    AccountBalance += AddMoney;
                    String total = """
                        =========================================
                                YOUR ACCOUNT HAVE : %s """.formatted(AccountBalance) +
                            """
                                    \n=========================================
                                    """;

                    clearScreen();
                    System.out.print(total);

                }// ending of the option 2

                else if (GetOption == 3) {
                    clearScreen();
                    System.out.println("""
                        ===============================================
                            Thank you for using Java Bank. Goodbye!
                        ===============================================
                        """);
                    break;
                } else {
                    clearScreen();
                    System.out.println("please enter again!!");
                    time(1500);
                    clearScreen();
                    continue;
                }
            }
            catch(NumberFormatException e){
                clearScreen();
                System.out.println("PLEASE ONLY NUMBERS");
                time(1500);
                clearScreen();
            }
        } // ending of the While loop

    } //ending of the private

}// ending of class