import java.util.Scanner;

public class LoginSystem {

    public static void time(long mill) {
        try {
            Thread.sleep(mill); // Waits
        } catch (InterruptedException e) {
            // Restore the interrupted status
            Thread.currentThread().interrupt();
        }
    }

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

    public static void main(String[] args){

        clearScreen();
        // ===============================================================================//

        // password,username and verifier of the password section

        Scanner input = new Scanner(System.in);

        String AccountUsername;
        String AccountPassword;
        String VerifyPassword;
        String confirm;
        // ===============================================================================//


        // ===============================================================================//
        System.out.println("LET'S MAKE YOUR ACCOUNT :)");
        time(2000);
        clearScreen();
        // ===============================================================================//


        // MAKING ACCOUNT AND VERIFYING THE PASSWORD IF ITS ACCURATE/SAME ON THE PASSWORD THAT USER INPUT

        while(true){
            System.out.print("MAKE YOUR ACCOUNT USERNAME: ");
            AccountUsername = input.nextLine();

            if(AccountUsername.isEmpty())

            {
                clearScreen();
                System.out.print("THIS IS EMPTY USERNAME,TRY AGAIN :)");
                time(2000);
                clearScreen();

            }

            else if (AccountUsername.length() < 3)

            {
                clearScreen();
                System.out.print("THE USERNAME IS SHORT.");
                time(900);
                clearScreen();
                System.out.print("JUST LIKE YOU.");
                time(700);
                clearScreen();
                System.out.print("ENTER NEW USERNAME AGAIN.");
                time(1000);
                clearScreen();
            }
            else {

                System.out.println("ARE YOU SURE TO THIS IS THE USERNAME: " + AccountUsername);
                System.out.print("Y/N?: ");
                confirm = input.nextLine();
                if(confirm.equalsIgnoreCase("y")){
                    clearScreen();
                    break;
                } else{
                    clearScreen();
                    continue;
                }


            }
        }
        // ===============================================================================//

        // ===============================================================================//


        while (true) {
            System.out.print("MAKE YOUR ACCOUNT PASSWORD: ");
            AccountPassword = input.nextLine();

            // 1. Check if password is empty or too short BEFORE asking for verification
            if (AccountPassword.isEmpty() || AccountPassword.length() < 8) {
                clearScreen();
                System.out.println("PASSWORD CANNOT BE EMPTY AND MUST BE AT LEAST 8 CHARACTERS.");
                time(1000);
                clearScreen();
                continue;
            }

            System.out.print("MAKE VERIFY ACCOUNT PASSWORD: ");
            VerifyPassword = input.nextLine();

            if (!VerifyPassword.equals(AccountPassword)) {
                clearScreen();
                System.out.println("INCORRECT PASSWORD TRY AGAIN!");
                time(800);
                System.out.println("MAKE A NEW PASSWORD AGAIN!");
                time(1000);
                clearScreen();
            } else {
                clearScreen();
                System.out.println("\nCONGRATULATIONS! YOU HAVE SUCCESSFULLY CREATED YOUR ACCOUNT.");
                break; // Exit the loop
            }
        }
        // ===============================================================================//


        input.close();
        // ===============================================================================//
    }

}
