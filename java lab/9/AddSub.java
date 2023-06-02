import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class AddSub extends Frame implements ActionListener
{
Label l1,l2,l3;
TextField t1,t2,t3;
JButton b1,b2;
AddSub()
{
 super("Addition of two numbers");
 setLayout(null);
 setSize(500,400);
 setVisible(true);
 l1=new Label("Enter the first no:");
 l2=new Label("Enter the second no:");
 l3=new Label("Result:");
 t1=new TextField();
 t2=new TextField();
 t3=new TextField();
 b1=new JButton("ADD");
 b2=new JButton("SUB");
 l1.setBounds(100,50,120,20);
 add(l1);
 t1.setBounds(240,50,50,20);
 add(t1);
 l2.setBounds(100,80,130,20);
 add(l2);
 t2.setBounds(240,80,50,20);
 add(t2);
 t3.setBounds(240,110,50,20);
 add(t3);
 l3.setBounds(100,110,100,20);
 add(l3);
 b1.setBounds(200,150,70,50);
 add(b1);
 b2.setBounds(300,150,70,50);
 add(b2);
 b1.addActionListener(this);
 b2.addActionListener(this);

 addWindowListener( new WindowAdapter() {
 public void windowClosing(WindowEvent we)
 {
 System.exit(0);
 }
 });
}
public void actionPerformed(ActionEvent ae)
{
 float a,b,c;
 if(ae.getSource()==b1)
 {
 a=Float.parseFloat(t1.getText().trim());
 b=Float.parseFloat(t2.getText().trim());
 c=a+b;
 t3.setText(Float.toString(c));
 }
 if(ae.getSource()==b2)
 {
 a=Float.parseFloat(t1.getText().trim());
 b=Float.parseFloat(t2.getText().trim());
 c=a-b;
 t3.setText(Float.toString(c));
 }
}
public static void main(String s[])
{
 AddSub ob=new AddSub();
}
}
