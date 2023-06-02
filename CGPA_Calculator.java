import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CGPA_Calculator extends JFrame implements ActionListener {

    private JLabel numOfSubjectsLabel;
    private JTextField numOfSubjectsField;
    private JLabel gradesLabel;
    private JTextField gradesField;
    private JButton calculateButton;

    public CGPA_Calculator() {
        setTitle("CGPA Calculator");
        setLayout(new FlowLayout());
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        numOfSubjectsLabel = new JLabel("Number of subjects: ");
        add(numOfSubjectsLabel);

        numOfSubjectsField = new JTextField(10);
        add(numOfSubjectsField);

        gradesLabel = new JLabel("Grades (separated by commas): ");
        add(gradesLabel);

        gradesField = new JTextField(20);
        add(gradesField);

        calculateButton = new JButton("Calculate CGPA");
        calculateButton.addActionListener(this);
        add(calculateButton);
    }

   // @Override
    public void actionPerformed(ActionEvent e) {
        int numOfSubjects = Integer.parseInt(numOfSubjectsField.getText());
        String[] gradesStr = gradesField.getText().split(",");

        if (gradesStr.length != numOfSubjects) {
            JOptionPane.showMessageDialog(this, "Number of grades does not match number of subjects.");
            return;
        }

        double totalGradePoints = 0;
        for (String gradeStr : gradesStr) {
            double grade = Double.parseDouble(gradeStr);
            double gradePoint = 0;
            if (grade >= 90) {
                gradePoint = 4.0;
            } else if (grade >= 80) {
                gradePoint = 3.0;
            } else if (grade >= 70) {
                gradePoint = 2.0;
            } else if (grade >= 60) {
                gradePoint = 1.0;
            }
            totalGradePoints += gradePoint;
        }

        double cgpa = totalGradePoints / numOfSubjects;
        JOptionPane.showMessageDialog(this, "CGPA: " + cgpa);
    }

    public static void main(String[] args) {
        CGPA_Calculator calculator = new CGPA_Calculator();
        calculator.setVisible(true);
    }
}
