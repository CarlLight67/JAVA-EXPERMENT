import org.w3c.dom.html.HTMLImageElement;

import java.util.Scanner;
public class Practice {

    public static void time(long mill){ //this is for the time. you can adjust the time by changing the value of the time() <= inside of this () you can input the value of the time you want 1000 is equivalent to 1 second.

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

        Scanner input = new Scanner(System.in);

        int num1,num2;

        System.out.print("First num: "); num1 = input.nextInt();

        System.out.print("Second num: "); num2 = input.nextInt();



        input.close();


    }
}
