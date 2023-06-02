import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CGPA_Calculator extends JFrame implements ActionListener {
	
	private JLabel lblTitle, lblCourse, lblGrade, lblCGPA;
	private JTextField txtCourse, txtGrade, txtCGPA;
	private JButton btnA, btnB, btnC, btnD, btnE, btnF, btnCalculate;
	private JTable table;
	private JScrollPane scrollPane;
	private JPanel panel;
	private String[] columnNames = {"Course", "Grade"};
	private String[][] data = new String[10][2];
	private int i = 0;
	
	public CGPA_Calculator() {
		super("CGPA Calculator");
		setLayout(new FlowLayout());
		
		lblTitle = new JLabel("CGPA Calculator");
		lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
		add(lblTitle);
		
		lblCourse = new JLabel("Course");
		add(lblCourse);
		
		txtCourse = new JTextField(10);
		add(txtCourse);
		
		lblGrade = new JLabel("Grade");
		add(lblGrade);
		
		txtGrade = new JTextField(10);
		txtGrade.setEditable(false);
		add(txtGrade);
		
		btnA = new JButton("A");
		btnA.addActionListener(this);
		add(btnA);
		
		btnB = new JButton("B");
		btnB.addActionListener(this);
		add(btnB);
		
		btnC = new JButton("C");
		btnC.addActionListener(this);
		add(btnC);
		
		btnD = new JButton("D");
		btnD.addActionListener(this);
		add(btnD);
		
		btnE = new JButton("E");
		btnE.addActionListener(this);
		add(btnE);
		
		btnF = new JButton("F");
		btnF.addActionListener(this);
		add(btnF);
		
		table = new JTable(data, columnNames);
		table.setPreferredScrollableViewportSize(new Dimension(500, 70));
		table.setFillsViewportHeight(true);
		scrollPane = new JScrollPane(table);
		add(scrollPane);
		
		btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(this);
		add(btnCalculate);
		
		lblCGPA = new JLabel("CGPA");
		add(lblCGPA);
		
		txtCGPA = new JTextField(10);
		txtCGPA.setEditable(false);
		add(txtCGPA);
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(600, 400));
		panel.setBackground(Color.WHITE);
		add(panel);
	}
	
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == btnA) {
			txtGrade.setText("A");
			data[i][0] = txtCourse.getText();
			data[i][1] = txtGrade.getText();
			i++;
		}
		else if(event.getSource() == btnB) {
			txtGrade.setText("B");
			data[i][0] = txtCourse.getText();
			data[i][1] = txtGrade.getText();
			i++;
		}
		else if(event.getSource() == btnC) {
			txtGrade.setText("C");
			data[i][0] = txtCourse.getText();
			data[i][1] = txtGrade.getText();
			i++;
		}
		else if(event.getSource() == btnD) {
			txtGrade.setText("D");
			data[i][0] = txtCourse.getText();
			data[i][1] = txtGrade.getText();
			i++;
		}
		else if(event.getSource() == btnE) {
			txtGrade.setText("E");
			data[i][0] = txtCourse.getText();
			data[i][1] = txtGrade.getText();
			i++;
		}
		else if(event.getSource() == btnF) {
			txtGrade.setText("F");
			data[i][0] = txtCourse.getText();
			data[i][1] = txtGrade.getText();
			i++;
		}
		else if(event.getSource() == btnCalculate) {
			double sum = 0;
			for(int j = 0; j < i; j++) {
				if(data[j][1].equals("A")) {
					sum += 4.0;
				}
				else if(data[j][1].equals("B")) {
					sum += 3.0;
				}
				else if(data[j][1].equals("C")) {
					sum += 2.0;
				}
				else if(data[j][1].equals("D")) {
					sum += 1.0;
				}
				else if(data[j][1].equals("E")) {
					sum += 0.5;
				}
				else if(data[j][1].equals("F")) {
					sum += 0.0;
				}
			}
			double cgpa = sum / i;
			txtCGPA.setText(String.valueOf(cgpa));
		}
	}
	
	public static void main(String[] args) {
		CGPA_Calculator frame = new CGPA_Calculator();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 400);
		frame.setVisible(true);
	}
}