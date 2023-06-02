import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CGPACalculator {
  private JTextField grade1Field, grade2Field, grade3Field, grade4Field, grade5Field;
  private JLabel resultLabel;
  
  public CGPACalculator() {
    JFrame frame = new JFrame("CGPA Calculator");
    Container content = frame.getContentPane();
    content.setLayout(new GridLayout(0, 2, 10, 10));
    
    content.add(new JLabel("Grade 1:", JLabel.RIGHT));
    grade1Field = new JTextField(10);
    content.add(grade1Field);
    
    content.add(new JLabel("Grade 2:", JLabel.RIGHT));
    grade2Field = new JTextField(10);
    content.add(grade2Field);
    
    content.add(new JLabel("Grade 3:", JLabel.RIGHT));
    grade3Field = new JTextField(10);
    content.add(grade3Field);
    
    content.add(new JLabel("Grade 4:", JLabel.RIGHT));
    grade4Field = new JTextField(10);
    content.add(grade4Field);
    
    content.add(new JLabel("Grade 5:", JLabel.RIGHT));
    grade5Field = new JTextField(10);
    content.add(grade5Field);
    
    JButton calc = new JButton("Calculate");
    calc.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          double grade1 = Double.parseDouble(grade1Field.getText().trim());
          double grade2 = Double.parseDouble(grade2Field.getText().trim());
          double grade3 = Double.parseDouble(grade3Field.getText().trim());
          double grade4 = Double.parseDouble(grade4Field.getText().trim());
          double grade5 = Double.parseDouble(grade5Field.getText().trim());
          
          double cgpa = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;
          resultLabel.setText("CGPA: " + cgpa);
        } catch (NumberFormatException nfe) {
          JOptionPane.showMessageDialog(frame, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
        }
      }
    });
    content.add(calc);
    
    resultLabel = new JLabel("", JLabel.CENTER);
    content.add(resultLabel);
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
  
  public static void main(String[] args) {
    new CGPACalculator();
  }
}