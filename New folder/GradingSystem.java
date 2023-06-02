import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GradingSystem extends JFrame {
    private JLabel lblName, lblMarks, lblResult;
    private JTextField txtName, txtMarks;
    private JButton btnSubmit;

    public GradingSystem() {
        setTitle("Student Grading System");
        setLayout(new FlowLayout());
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblName = new JLabel("Name");
        lblMarks = new JLabel("Marks");
        txtName = new JTextField(10);
        txtMarks = new JTextField(10);
        btnSubmit = new JButton("Submit");
        lblResult = new JLabel();

        add(lblName);
        add(txtName);
        add(lblMarks);
        add(txtMarks);
        add(btnSubmit);
        add(lblResult);

        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = txtName.getText();
                double marks = Double.parseDouble(txtMarks.getText());
                String grade;

                if (marks >= 91) {
                    grade = "O";
                } else if (marks >= 81) {
                    grade = "A+";
                } else if (marks >= 71) {
                    grade = "A";
                } else if (marks >=61) {
                    grade = "B";
                } else if (marks >= 51) {
                    grade = "C";
                } else if (marks >= 41) {
                    grade = "D";
                } else {
                    grade = "F";
                }

                lblResult.setText("Hi " + name + ", your grade is " + grade);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new GradingSystem();
    }
}