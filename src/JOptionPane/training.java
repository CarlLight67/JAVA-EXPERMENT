package JOptionPane;

import java.util.Scanner;

public class training {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String ask;
        String confirmationId;

        while (true) {
            System.out.print("ARE YOU A STUDENT?: ");
            ask = input.nextLine().trim();

            if (ask.equalsIgnoreCase("Y")) {
                System.out.println("PROCESSING.........");


                while (true) {
                    System.out.print("DO YOU HAVE A STUDENT ID? || Y OR N: ");
                    confirmationId = input.nextLine().trim();

                    if (confirmationId.equalsIgnoreCase("Y")) {
                        System.out.println("WELCOME!!!");
                        break;
                    } else if (confirmationId.equalsIgnoreCase("N")) {
                        System.out.println("YOU ARE NOT ALLOWED HERE");
                        break;
                    } else {
                        System.out.println("INVALID ANSWER!!");
                    }
                }
                break;

            } else if (ask.equalsIgnoreCase("N")) {
                System.out.println("YOU ARE NOT ALLOWED HERE");
                break;
            } else {
                System.out.println("ENTER THE RIGHT VALUE || Y or N?");
            }
        }
        input.close();
    }
}