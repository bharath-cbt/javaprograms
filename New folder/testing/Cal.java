import java.awt.*;
import java.awt.event.*;
public class Cal extends Frame implements ActionListener
{
TextField t;
Button b1,b2,b4,b3,b5,b6,b7,b8,b9,b0,dec,add,sub,mul,div,equ,del,clr;
static int operator=0;
static float a=0,b=0,res=0;
Cal()
{
super("calculator");
setSize(300,300);
setVisible(true);
setLayout(new BorderLayout());
t=new TextField();
b1=new Button("1");
b2=new Button("2");
b3=new Button("3");
b4=new Button("4");
b5=new Button("5");
b6=new Button("6");
b7=new Button("7");
b8=new Button("8");
b9=new Button("9");
b0=new Button("0");
dec=new Button(".");
add=new Button("+");
sub=new Button("-");
mul=new Button("*");
div=new Button("/");
equ=new Button("=");
del=new Button("delete");
clr=new Button("clear");
/*t.setBounds(20,80,280,40);

b7.setBounds(30,80,28,50);
b8.setBounds(60,80,28,50);
b9.setBounds(90,80,28,50);
div.setBounds(120,80,28,50);

b4.setBounds(30,90,28,50);
b5.setBounds(60,90,28,50);
b6.setBounds(90,90,28,50);
mul.setBounds(120,90,28,50);

b1.setBounds(30,100,28,50);
b2.setBounds(60,100,28,50);
b3.setBounds(90,100,28,50);
sub.setBounds(120,100,28,50);

dec.setBounds(30,110,28,50);
b0.setBounds(60,110,28,50);
equ.setBounds(90,110,28,50);
add.setBounds(120,110,28,50);

del.setBounds(40,120,40,50);
clr.setBounds(90,120,40,50);*/
add(t,BorderLayout.NORTH);
add(b7);
add(b8);
add(b9);
add(div);
add(b4);
add(b5);
add(b6);
add(mul);
add(b1);
add(b2);
add(b3);
add(sub);
add(dec);
add(b0);
add(equ);
add(add);
add(del);
add(clr);
setLayout(new GridLayout(5,4));
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b0.addActionListener(this);
div.addActionListener(this);
mul.addActionListener(this);
sub.addActionListener(this);
add.addActionListener(this);
dec.addActionListener(this);
del.addActionListener(this);
clr.addActionListener(this);
t.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
t.setText(t.getText().concat("1"));
}
if(ae.getSource()==b2)
{
t.setText(t.getText().concat("2"));
}
if(ae.getSource()==b3)
{
t.setText(t.getText().concat("3"));
}
if(ae.getSource()==b4)
{
t.setText(t.getText().concat("4"));
}
if(ae.getSource()==b5)
{
t.setText(t.getText().concat("5"));
}
if(ae.getSource()==b6)
{
t.setText(t.getText().concat("6"));
}
if(ae.getSource()==b7)
{
t.setText(t.getText().concat("7"));
}
if(ae.getSource()==b8)
{
t.setText(t.getText().concat("8"));
}
if(ae.getSource()==b9)
{
t.setText(t.getText().concat("9"));
}
if(ae.getSource()==b0)
{
t.setText(t.getText().concat("0"));
}
if(ae.getSource()==dec)
{
t.setText(t.getText().concat("."));
}
if(ae.getSource()==add)
{
a=Float.parseFloat(t.getText());
operator=1;
t.setText("");
}
if(ae.getSource()==sub)
{
a=Float.parseFloat(t.getText());
operator=2;
t.setText("");
}
if(ae.getSource()==mul)
{
a=Float.parseFloat(t.getText());
operator=3;
t.setText("");
}
if(ae.getSource()==div)
{
a=Float.parseFloat(t.getText());
operator=4;
t.setText("");
}
if(ae.getSource()==equ)
{
b=Float.parseFloat(t.getText());
switch(operator)
{
case 1:res=a+b;
        break;
case 2:res=a-b;
        break;
case 3:res=a*b;
        break;
case 4:res=a/b;
        break;
default:res=0;
}
t.setText(""+res);
}
if(ae.getSource()==clr)
{
t.setText("");
}
if(ae.getSource()==del)
{
String s=t.getText();
t.setText("");
for(int i=0;i<s.length()-1;i++)
{
t.setText(t.getText()+s.charAt(i));
}
}
}
public static void main(String args[])
{
new Cal();
}
}