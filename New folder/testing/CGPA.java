import java.awt.CardLayout;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
public class CGPA extends JFrame implements ActionListner, MouseListener
{
   CGPA(){
  JFrame frame= new JFrame("CGPA CALCULATOR");
  JPanel f=new JPanel();
  CardLayout cardlo= new CardLayout();
  f.setLayout(cardlo);
  JFrame.setDefaultLookAndFeelDecorated(true);

  
  JButton b1,b2,b3,b4,b5,b6,b7,b8;
  JLabel lb1=new JLabel("CGPA CALCULATOR");
  lb1.setBounds(20,10,300,30);
  JLabel lb2=new JLabel("Number of subjects");
  lb2.setBounds(20, 50, 150, 30);
  
  JTextField t=new JTextField();
  t.setBounds(200, 50, 150, 30);
  JLabel lb3=new JLabel("Select subject grade");
  lb3.setBounds(20, 90, 150, 30);

  b1= new JButton("O");
  b2= new JButton("A+");
  b3= new JButton("A");
  b4= new JButton("B");
  b5= new JButton("C");
  b6= new JButton("D");
  b7= new JButton("F");
  b8= new JButton("Calculate");
 
  
  b1.setBounds(20, 120, 50, 50);
  b2.setBounds(80, 120, 50, 50);
  b3.setBounds(140, 120, 50, 50);
  extracted2(b6, b7);
  b8.setBounds(170, 200, 100, 50);



  f.add(lb1);
  f.add(lb2);
  f.add(t);
  f.add(lb3);
  f.add(b1);
  f.add(b2);
  f.add(b3);
  f.add(b4);
  f.add(b5);
  f.add(b6);
  f.add(b7);
  f.add(b8);



  extracted(f);
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  f.setLayout(null);
  f.setVisible(true);

  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  b4.addActionListener(this);
  b5.addActionListener(this);
  b6.addActionListener(this);
  b7.addActionListener(this);
  b8.addActionListener(this);

  tblResults = new JTable();
  spResults = new JScrollPane(tblResults);
  f.add(spResults);

  f.setSize(800*400);
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  f.setLayout(null);
  f.setVisible(true);
  frame.setBounds(1000,1000);
  frame.add(f);

   }

  private void extracted2(JButton b6, JButton b7) {
    b6.setBounds(320, 120, 50, 50);
    b7.setBounds(380, 120, 50, 50);
  }

  private void extracted(JFrame f) {
    f.setSize(1000,500);
  }
  
    
   public static void main(String[] args) {
     CGPA c=new CGPA();
   }
}
