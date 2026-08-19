import java.util.Scanner;

public class Main { //the use of this is to identify the name of the file and locate it

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
    public static void main(String[] args)
    {
        // this is the line that need so that it can be run (static,void,public); this is some of the thing that can be use

        //THIS IS STRING THAT CAN BE USE AGAIN/**/

        String line = ("=====================================");

        System.out.println("Carl Vincent Dictaan\n"); //this is the first code that i make

        System.out.println(line);
        System.out.println("========THIS IS THE BASICS===========");
        System.out.println(line);


        // this is an  declaration .putting an empty value of an varaible

        int numbers; // integer only use for the numbers absolute value only
        char one; //only use for the one letters or special chars
        boolean identify; // this is 1 or 0 or true of false
        double value; // this have an additional number on last part of the digits

        // as you can see now this are the variable that have value, now this is what we called assigned valued.. if none assignment

        numbers = 150;
        one = 'A';
        identify = true;
        value = 100;


        //Here we can now print the assigned value so that it can be print out

        System.out.println(numbers);
        System.out.println(one);
        System.out.println(identify);
        System.out.println(value);

        // this is the the line of co ethat practice setion with explanation

        System.out.println(line);
        System.out.println("=====THIS IS USE PRIMATIVE TYPES=====");
        System.out.println(line + "\n");



        System.out.println("======this is the integers type =======\n");

        // this is integers type


        byte bits = 123;
        short myShort = 8310;
        long LargeValue = 481023012940182128L; // required to put(L)

        System.out.println(LargeValue);
        System.out.println(bits);
        System.out.println(myShort);

        System.out.println("======this is the integers type =======\n");

        //float points

        float score = 423.3f; //required to put an (f)
        double price =  382.2;
        System.out.println(score);
        System.out.println(price);


        System.out.println("====this is the boolean and char=====\n");

        // Character and Boolean
        char myChar = 'A';           // Single Unicode character
        boolean isJavaFun = true;    // true or false

        System.out.println(myChar);
        System.out.println(isJavaFun);




        clearScreen();

        System.out.println("\n====this is the use of the scanner =====\n");

        Scanner input  = new Scanner(System.in); // THIS IS THE START OF THE SCANNER SO THAT WE CAN JUST


        System.out.print("What is your name?: ");

        String AskName = input.nextLine();

        System.out.print("How old are you? : ");

        int AskAge = input.nextInt();
        input.nextLine(); // this is important to put because it will cause bug and not skip this stage it stuck to this section



        System.out.println("\n" + "YOUR NAME IS "+ AskName + "\n");


        if (AskAge <= 0) {

            System.out.println("\nyou are not born yet");
        }
        else if (AskAge >= 19) {
            System.out.println("\nyou are legal age. you are old");
        }
        else {

            // If it's not <= 0 and not >= 19, it must be between 1 and 18
            System.out.println("\nTF UR ONLY " + AskAge + "???you are baby XD");
        }

        clearScreen();

        System.out.println("HI THIS IS NEW SECTION:)");

        System.out.print("do you want to clear the screen?\nY || N?: ");

        String askYN = input.nextLine();

        if(askYN.equalsIgnoreCase("Y")) { ///so if using ./equalIgnoreCase is for any type of cases for exmaple if its big or small,it is okay not important if its correct or accurate...while using the the .equal it is super accurate ,however this is only for objects class adn strings like for example (String,Double,Integers,Boolean,Array,Characters,etc...).only use the == is this is primitive types (int, double, char, boolean, float, long, short, byte), this check if the values are equal

        /*
                               PRIMATIVE
        =============================================================
        byte	8-bit	Integer (-128 to 127)	byte b = 10;
        short	16-bit	Integer (-32,768 to 32,767)	short s = 1000;
        int	32-bit	Standard integer	int i = 100000;
        long	64-bit	Large integer	long l = 100000000L;
        float	32-bit	Decimal number	float f = 5.5f;
        double	64-bit	Large decimal number	double d = 19.99;
        char	16-bit	Single character	char c = 'A';
        boolean	1-bit	True or False	boolean flag = true;
        =============================================================

        =============================================================
                                  REFERENCES
        =============================================================

                                  STRING
                                  ARRAY
                                  OBJECTS

        =============================================================


        * */


            System.out.println("this is good");
        }
        else {
            System.out.println("this is bad");
        }

        System.out.println("DO YOU WANT TO CLEAR?\n(Y or N)?");

        String cls = input.nextLine();

        if(cls.equalsIgnoreCase("y")){
            System.out.println("okay");
            clearScreen();
        }
        else{
            return;
        }

        input.close();


    }
}