package Test;

import javax.swing.*;

public class StudentGradeCheck {

    public static void main(String[] args) {

        String title = "STUDENT GRADE CHECKER";
        String rawName = JOptionPane.showInputDialog(null,
                "ENTER YOU NAME: ",
                title,
                JOptionPane.PLAIN_MESSAGE);

            String name = rawName.substring(0,1).toUpperCase() + rawName.substring(1) ;

        while (true) {

            String rawGrade = JOptionPane.showInputDialog(
                    null,
                    "Enter your grade: ",
                    title,
                    JOptionPane.INFORMATION_MESSAGE
            );

            int grade = Integer.parseInt(rawGrade);

            if (grade >= 101) {
                JOptionPane.showMessageDialog(null,
                        "WHAT THE FUCK DID YOU GET?!?!?",
                        title,
                        JOptionPane.ERROR_MESSAGE
                );

            }
            else if (grade >= 75) {

                JOptionPane.showMessageDialog(null,
                        "Passed! Great job, %s!".formatted(name),
                        title,
                        JOptionPane.INFORMATION_MESSAGE
                );

            } else {

                JOptionPane.showMessageDialog(null,
                        "Failed. Needs improvement, %s!.".formatted(name),
                        title,
                        JOptionPane.ERROR_MESSAGE
                );
            }

        }
    }
}

