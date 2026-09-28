package Test;
import javax.swing.*;

public class BasicCalculator {

    public static void main(String[] args) {

while(true){
        try{
            String title = "BASIC CALCULATOR";

            String rawNum1 = JOptionPane.showInputDialog(null,"ENTER THE FIRST VALUE:");

            String rawNum2 = JOptionPane.showInputDialog(null,"ENTER THE SECOND VALUE:");

            String rawSymbols = JOptionPane.showInputDialog(null, """
                    ENTER THE SYMBOL THAT YOU WANT TO USE:        

                            1 .MULTIPLICATION = *
                            2 .ADDITION = +
                            3 .SUBSTRACTION = -
                            4 .DIVISION = /
                            5 .REMAINDER = %
                
                """);
            double num1 = Double.parseDouble(rawNum1.trim());
            double num2 = Double.parseDouble(rawNum1.trim());

            int Symbols = Integer.parseInt(rawSymbols);

            if(Symbols == 1){

                JOptionPane.showMessageDialog(
                        null,
                        num1 * num2,
                        title,
                        JOptionPane.INFORMATION_MESSAGE);
            }
            else if(Symbols == 2){
                JOptionPane.showMessageDialog(
                        null,
                        num1 + num2,
                        title,
                        JOptionPane.INFORMATION_MESSAGE);
            }
            else if(Symbols == 3){
                JOptionPane.showMessageDialog(
                        null,
                        num1 - num2,
                        title,
                        JOptionPane.INFORMATION_MESSAGE);
            }
            else if(Symbols == 4){
                JOptionPane.showMessageDialog(
                        null,
                        num1 / num2,
                        title,
                        JOptionPane.INFORMATION_MESSAGE);
            }
            else if(Symbols == 5){
                JOptionPane.showMessageDialog(
                        null,
                        num1 % num2,
                        title,
                        JOptionPane.INFORMATION_MESSAGE);
            }
            else if(Symbols != 1 || Symbols != 2 || Symbols != 3 || Symbols != 4 || Symbols != 5){
                JOptionPane.showMessageDialog(
                        null,
                        "ERROR  KING INA MO",
                        title,
                        JOptionPane.INFORMATION_MESSAGE);
            }


        }catch (Exception e){

        }

}

    }

}
