import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class RandomGame {
    public static void main(String[] args) {

        String titleIntro = "MY GAME";
        String intro = "WELCOME TO RANDOM GAME";

        /*
         * Standard Layout: JOptionPane.showMessageDialog
         *
         * Signature:
         * JOptionPane.showMessageDialog(
         *
         * Component parentComponent,
         *  Object message,
         *  String title,
         *  int messageType,
         *  Icon icon);
         *
         * Parameters:
         * 1. parentComponent : Determines the Frame in which the dialog is displayed (usually 'null' for center screen).
         * 2. message         : The text string or object to display inside the dialog.
         * 3. title           : The text string displayed in the dialog window's title bar.
         * 4. messageType     : The style of the message (e.g., JOptionPane.PLAIN_MESSAGE, INFORMATION_MESSAGE, ERROR_MESSAGE, WARNING_MESSAGE).
         * 5. icon            : Custom ImageIcon to display (optional/can be 'null' for default icons).
         */

        JOptionPane.showMessageDialog(
                null,
                intro,
                titleIntro,
                JOptionPane.PLAIN_MESSAGE);

        int confirmation = JOptionPane.showConfirmDialog(
                null,
                "ARE YOU READY???",
                "PREPARING THE GAME...",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE
        );


        if (confirmation == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(
                    null,
                    "ENJOY THE GAME:)\nGOOD LUCK🙌",
                    "GAME START!!!",
                    JOptionPane.PLAIN_MESSAGE
            );
            Game();
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "ARE YOU SCARED???hahaha BYE",
                    "GET OUT LUSER!!!",
                    JOptionPane.PLAIN_MESSAGE
            );
            System.exit(0);
        }

    }

    public static void Game() {


        String rules = "=== ROCK, PAPER, SCISSORS RULES === " + "\n\n"
                + "1. ✊ Rock CRUSHES Scissors\n"
                + "2. ✌️ Scissors CUTS Paper\n"
                + "3. ✋ Paper COVERS Rock\n\n"
                + "Same choices result in a TIE!\n"
                + "First to win 3 rounds wins the game!";


        JOptionPane.showMessageDialog(
                null,
                rules,
                "RULES",
                JOptionPane.INFORMATION_MESSAGE
        );


        String win = "YOU WIN!";
        String lose = "YOU LOSE!";
        String draw = "IT'S A TIE!";

        String res = "RESULT!!!";

        int ai = AiPick();
        int AiScore = 0;
        int userScore = 0;


        //==================================================

        int rock, paper, scissor;
        rock = 1;
        paper = 2;
        scissor = 3;

        //==================================================







        //==================================================
        if (user == ai) {

            JOptionPane.showMessageDialog(
                    null,
                    draw,
                    res,
                    JOptionPane.INFORMATION_MESSAGE
            );


        }
        else if((user == paper && ai == scissor) || (user == rock && ai == paper) || (user == paper && ai == scissor)){

            JOptionPane.showMessageDialog(
                    null,
                    win,
                    res,
                    JOptionPane.INFORMATION_MESSAGE
            );

        }
        else {

            JOptionPane.showMessageDialog(
                    null,
                    lose,
                    res,
                    JOptionPane.ERROR_MESSAGE
            );
        }

        //==================================================


    }

    public static int AiPick() {
        Random random = new Random();
        int rock, paper, scissor;
        rock = 1;
        paper = 2;
        scissor = 3;
        int aiChoice = random.nextInt(3) + 1; // Generates 1, 2, or 3
        return aiChoice;
    }
}