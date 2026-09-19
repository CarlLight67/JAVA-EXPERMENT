import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class RandomGame {
    public static void main(String[] args) {

        String titleIntro = "MY GAME";
        String intro = "WELCOME TO RANDOM GAME";

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

        int AiScore = 0;
        int userScore = 0;

        int rock = 1;
        int paper = 2;
        int scissor = 3;

        String win = "YOU WIN THIS ROUND!";
        String lose = "YOU LOSE THIS ROUND!";
        String draw = "IT'S A TIE!";
        String res = "RESULT!!!";

        // Loop runs until someone reaches 3 points!
        while (userScore < 3 && AiScore < 3) {

            // Generate a fresh pick for the AI each round
            int ai = AiPick();
            int user = 0;

            String input = JOptionPane.showInputDialog(
                    null,
                    "INPUT YOUR NUMBER:\n1 = ✊ Rock\n2 = ✋ Paper\n3 = ✌️ Scissors",
                    "PICK",
                    JOptionPane.PLAIN_MESSAGE
            );

            // Handle Cancel button safely
            if (input == null) {
                System.exit(0);
            }

            // Input validation with try-catch
            try {
                user = Integer.parseInt(input.trim());
                if (user < 1 || user > 3) {
                    JOptionPane.showMessageDialog(null, "Please enter 1, 2, or 3 only!");
                    continue; // Restart the loop prompt
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter a number.");
                continue; // Restart the loop prompt
            }

            // Round Outcome Logic
            if (user == ai) {
                JOptionPane.showMessageDialog(
                        null,
                        draw,
                        res,
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
            // Correct User Win Conditions
            else if ((user == rock && ai == scissor) ||
                    (user == paper && ai == rock) ||
                    (user == scissor && ai == paper)) {

                ++userScore;
                JOptionPane.showMessageDialog(
                        null,
                        win,
                        res,
                        JOptionPane.INFORMATION_MESSAGE
                );
                ShowStat(userScore, AiScore);
            }
            // AI Wins Condition
            else {

                ++AiScore;
                JOptionPane.showMessageDialog(
                        null,
                        lose,
                        res,
                        JOptionPane.ERROR_MESSAGE
                );
                ShowStat(userScore, AiScore);
            }
        } // End of game loop

        // Final Winner Announcement
        if (userScore == 3) {
            JOptionPane.showMessageDialog(null, "🎉 CONGRATULATIONS! YOU WON THE GAME! 🎉");
        } else {
            JOptionPane.showMessageDialog(null, "💀 GAME OVER! COMPUTER WON THE GAME! 💀");
        }
    }

    public static void ShowStat(int userScore, int AiScore) {
        JOptionPane.showMessageDialog(
                null,
                "Current Standing:",
                "YOUR SCORE: " + userScore + " V.S COMPUTER SCORE: " + AiScore,
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public static int AiPick() {
        Random random = new Random();
        return random.nextInt(3) + 1; // Generates 1, 2, or 3 directly
    }
}