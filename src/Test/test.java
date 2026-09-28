package Test;
import javax.swing.*;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);

        System.out.print("input your name: ");

        String name = input.nextLine();
        String capital = name.substring(0,1).toUpperCase() + name.substring(1) ;



        System.out.print(capital);

        input.close();



    }
}
