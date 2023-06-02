import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CGPA_Calculator extends JFrame implements ActionListener {
    private JTextField[] marksField;
    private JLabel[] subjectLabel;
    private JLabel cgpaLabel, percentageLabel;
    private JButton calculateButton;
    private JTable table;
    private JScrollPane scrollPane;

    public CGPA_Calculator() {
        setLayout(new FlowLayout());

        subjectLabel = new JLabel[5];
        marksField = new JTextField[5];
        for (int i = 0; i < 5; i++) {
            subjectLabel[i] = new JLabel("Subject " + (i + 1));
            add(subjectLabel[i]);

            marksField[i] = new JTextField(5);
            add(marksField[i]);
        }

        calculateButton = new JButton("Calculate");
        add(calculateButton);
        calculateButton.addActionListener(this);

        cgpaLabel = new JLabel("CGPA: ");
        add(cgpaLabel);

        percentageLabel = new JLabel("Percentage: ");
        add(percentageLabel);

        String[] columnNames = {"Subject", "Marks", "Grade"};
        String[][] data = new String[5][3];

        table = new JTable(data, columnNames);
        table.setEnabled(false);
        scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(300, 70));
        add(scrollPane);
    }

    public void actionPerformed(ActionEvent e) {
        double sum = 0.0, percentage, cgpa;
        int marks;

        for (int i = 0; i < 5; i++) {
            marks = Integer.parseInt(marksField[i].getText());
            sum += marks;
            table.setValueAt("Subject " + (i + 1), i, 0);
            table.setValueAt(marks, i, 1);

            if (marks >= 90)
                table.setValueAt("A+", i, 2);
            else if (marks >= 80)
                table.setValueAt("A", i, 2);
            else if (marks >= 70)
                table.setValueAt("B+", i, 2);
            else if (marks >= 60)
                table.setValueAt("B", i, 2);
            else if (marks >= 50)
                table.setValueAt("C", i, 2);
            else
                table.setValueAt("F", i, 2);
        }

        cgpa = sum / 5.0;
        percentage = (sum / 500.0) * 100;
        cgpaLabel.setText("CGPA: " + String.format("%.2f", cgpa));
        percentageLabel.setText("Percentage: " + String.format("%.2f", percentage) + "%");
    }

    public static void main(String[] args) {
        CGPA_Calculator calculator=new CGPA_Calculator();
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    calculator.setSize(500, 500);
    calculator.setVisible(true);
    calculator.setTitle("CGPA Calculator");
}
