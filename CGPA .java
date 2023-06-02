import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CGPA extends JFrame implements ActionListener {
    private JLabel lblTitle, lblCourse, lblGrade, lblCredit, lblCGPA;
    private JTextField txtCourse, txtGrade, txtCredit, txtCGPA;
    private JButton btnCalculate, btnClear;
    private JPanel pnlTitle, pnlCourse, pnlGrade, pnlCredit, pnlCGPA, pnlButton;

    public CGPA() {
        super("CGPA Calculator");
        setLayout(new GridLayout(6, 1));

        lblTitle = new JLabel("CGPA Calculator");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitle.setForeground(Color.BLUE);
        pnlTitle = new JPanel();
        pnlTitle.add(lblTitle);
        add(pnlTitle);

        lblCourse = new JLabel("Course");
        txtCourse = new JTextField(10);
        pnlCourse = new JPanel();
        pnlCourse.add(lblCourse);
        pnlCourse.add(txtCourse);
        add(pnlCourse);

        lblGrade = new JLabel("Grade");
        txtGrade = new JTextField(10);
        pnlGrade = new JPanel();
        pnlGrade.add(lblGrade);
        pnlGrade.add(txtGrade);
        add(pnlGrade);

        lblCredit = new JLabel("Credit");
        txtCredit = new JTextField(10);
        pnlCredit = new JPanel();
        pnlCredit.add(lblCredit);
        pnlCredit.add(txtCredit);
        add(pnlCredit);

        lblCGPA = new JLabel("CGPA");
        txtCGPA = new JTextField(10);
        pnlCGPA = new JPanel();
        pnlCGPA.add(lblCGPA);
        pnlCGPA.add(txtCGPA);
        add(pnlCGPA);

        btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(this);
        btnClear = new JButton("Clear");
        btnClear.addActionListener(this);
        pnlButton = new JPanel();
        pnlButton.add(btnCalculate);
        pnlButton.add(btnClear);
        add(pnlButton);

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalculate) {
            String course = txtCourse.getText();
            String grade = txtGrade.getText();
            String credit = txtCredit.getText();
            double cgpa = calculateCGPA(grade, credit);
            txtCGPA.setText(String.valueOf(cgpa));
        } else if (e.getSource() == btnClear) {
            txtCourse.setText("");
            txtGrade.setText("");
            txtCredit.setText("");
            txtCGPA.setText("");
        }
    }

    public double calculateCGPA(String grade, String credit) {
        double cgpa = 0;
        double gradePoint = 0;
        double totalCredit = 0;
        double totalGradePoint = 0;
        String[] grades = grade.split(",");
        String[] credits = credit.split(",");
        for (int i = 0; i < grades.length; i++) {
            if (grades[i].equals("A")) {
                gradePoint = 4.0;
            } else if (grades[i].equals("B")) {
                gradePoint = 3.0;
            } else if (grades[i].equals("C")) {
                gradePoint = 2.0;
            } else if (grades[i].equals("D")) {
                gradePoint = 1.0;
            } else if (grades[i].equals("F")) {
                gradePoint = 0.0;
            }
            totalGradePoint += gradePoint * Double.parseDouble(credits[i]);
            totalCredit += Double.parseDouble(credits[i]);
        }
        cgpa = totalGradePoint / totalCredit;
        return cgpa;
    }

    public static void main(String[] args) {
        CGPA cgpa = new CGPA();
    }
}