import java.util.Scanner;

public class Practice {

    //this is for the time. you can adjust the time by changing the value of the time() <= inside of this () you can input the value of the time you want 1000 is equivalent to 1 second.

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


    public static void multiply(int a, int b){
        System.out.print(a * b);

    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2;



        String firstName,lastName;

        System.out.println("WHAT IS YOUR FIRST NAME?");
        firstName = input.nextLine();
        System.out.println("WHAT IS YOUR LAST NAME?");





        time(4000);
        clearScreen();

        System.out.print("First num: ");
        num1 = input.nextInt();

        System.out.print("Second num: ");
        num2 = input.nextInt();

        System.out.println("THIS IS THE OUTPUT: ");
        multiply(num1,num2); // this is connected to the other class

        time(5000);
        clearScreen();

        /* this line of code is the basic using of printf,
        what is "printf"? printf is a method used to print formatted output to the console.
        printf uses a format string containing literal text and format specifiers (placeholders).


    ================================================================================
                              CORE CONVERSION CHARACTERS
    ================================================================================
    %s   String / Object          System.out.printf("%s", "Hello");     -> Hello
    %S   Uppercase String         System.out.printf("%S", "hello");     -> HELLO
    %c   Character                System.out.printf("%c", 'A');         -> A
    %C   Uppercase Character      System.out.printf("%C", 'a');         -> A
    %d   Decimal Integer          System.out.printf("%d", 42);          -> 42
    %f   Floating-point           System.out.printf("%f", 3.14159);     -> 3.141590
    %b   Boolean                  System.out.printf("%b", true);        -> true
    %B   Uppercase Boolean        System.out.printf("%B", false);       -> FALSE
    %x   Hexadecimal (lowercase)  System.out.printf("%x", 255);         -> ff
    %X   Hexadecimal (uppercase)  System.out.printf("%X", 255);         -> FF
    %o   Octal Integer            System.out.printf("%o", 8);           -> 10
    %e   Scientific (lowercase)   System.out.printf("%e", 1000.0);      -> 1.000000e+03
    %E   Scientific (uppercase)   System.out.printf("%E", 1000.0);      -> 1.000000E+03
    %h   Hashcode (hex)           System.out.printf("%h", "test");      -> 364492
    %n   Line separator (OS-safe) System.out.printf("Line 1%nLine 2");
    %%   Literal '%' sign         System.out.printf("%d%%", 100);       -> 100%

         */




        input.close();
        //testing
    }
}
