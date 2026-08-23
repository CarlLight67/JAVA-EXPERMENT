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

    public static void multiply(double a, double b){
        System.out.print(a * b);
    }

    public static void addition(double a, double b){
        System.out.print(a + b);
    }

    public static void division(double a, double b){
        if (b != 0) {
            System.out.print(a / b);
        } else {
            System.out.print("Error: Division by zero");
        }
    }

    public static void subtraction(double a, double b){
        System.out.print(a - b);
    }

    public static void main(String[] args) {

        // passsword and username. soon gonna build the hash on this
        String username = "LightYagami";
        String password = "Light123";

        Scanner input = new Scanner(System.in);

        clearScreen();


        // container of the pass and user log
        String userLog;
        String passLog;

        System.out.println("===========LOG IN==========");
        System.out.print("ENTER YOUR USERNAME: ");

        userLog = input.nextLine();

        System.out.print("ENTER YOUR PASSWORD: ");

        passLog = input.nextLine();

        if (userLog.equals(username) && passLog.equals(password)){
            System.out.print("SUCCESSFUL LOGIN");
            time(3000);
            clearScreen();
        }
        else{
            return;
        }

        System.out.println("\nCHOICE YOUR ARITHMETIC WEAPON HERE: ");

        int weapon;

        String choices = "\n1.) ADDITION\n2.) SUBTRACTION\n3.) MULTIPLICATION\n4.) DIVISION";
        System.out.println(choices);

        System.out.print("\nENTER YOUR ARITHMETIC WEAPON NUMBER: ");
        weapon = input.nextInt();

        if(weapon != 1 && weapon != 2 && weapon != 3 && weapon != 4){

            System.out.println("OPPSSIEE! YOU DIDN`T FOLLOW THE RULES ");
            return;
        }

        // FIX: Get the numbers directly here using the existing 'input' scanner
        System.out.print("ENTER YOUR FIRST VALUE: ");
        double num1 = input.nextDouble(); // Changed to double to match your math methods

        System.out.print("ENTER YOUR SECOND VALUE: ");

        double num2 = input.nextDouble();

        // FIX: Call the methods and pass the numbers (num1, num2)
        if(weapon == 1){
            addition(num1, num2);
        }
        else if (weapon == 2) {
            subtraction(num1, num2);
        }
        else if (weapon == 3) {
            multiply(num1, num2);
        }
        else if (weapon == 4) {
            division(num1, num2);
        }
        else{
            System.out.println("YOUR ENTER A WRONG VALUE!!!");
        }

        /* this line of code is the basic using of printf,
        what is "printf"? printf is a method used to print formatted output to the console.
        printf uses a format string containing literal text and format specifiers (placeholders).


    ================================================================================
                              CORE CONVERSION CHARACTERS
    ================================================================================
    %s   String / Object          System.out.printf("%s", "Hello");     -> Hello
    %S   Uppercase String         System.out.printf("%S", "hello");     -> HELLO
    %c   Character               System.out.printf("%c", 'A');         -> A
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
    %h   Hashcode (hex)            System.out.printf("%h", "test");      -> 364492
    %n   Line separator (OS-safe) System.out.printf("Line 1%nLine 2");
    %%   Literal '%' sign         System.out.printf("%d%%", 100);       -> 100%

         */

        input.close();
        //testing
    }
}