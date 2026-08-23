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
        // ============================================================//

        // password,username and verifier of the password section

        Scanner input = new Scanner(System.in);

        String AccountUsername;
        String AccountPassword;
        String VerifyPassword;


        // ============================================================//



        // ============================================================//

        System.out.println("LET'S MAKE YOUR ACCOUNT :)");

        time(2000);

        clearScreen();
        // ============================================================//


        // MAKING ACCOUNT AND VERIFYING THE PASSWORD IF ITS ACCURATE/SAME ON THE PASSWORD THAT USER INPUT


            System.out.print("MAKE YOUR ACCOUNT USERNAME: ");

            AccountUsername = input.nextLine();

            time(1000);

            clearScreen();

        while(true) {

            System.out.print("MAKE YOUR ACCOUNT PASSWORD: ");
            AccountPassword = input.nextLine();

            System.out.print("MAKE VERIFY ACCOUNT PASSWORD: ");
            VerifyPassword = input.nextLine();

            if (!VerifyPassword.equals(AccountPassword)) {
                clearScreen();
                System.out.println("INCORRECT PASSWORD TRY AGAIN!");
                time(800);
                System.out.println("MAKE A NEW PASSWORD AGAIN!");
                time(1000);
                clearScreen();
            }
            else{
                clearScreen();
                System.out.print("\nCONGRATULATIONS YOU NOW SUCCESSFULLY MAKE YOUR ACCOUNT!");
                break;
            }
        }

        // ============================================================//
        input.close();
    }

}
