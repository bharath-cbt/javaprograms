import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class CGPA 
{
  static int count=0;
   CGPA(){
  JFrame f= new JFrame("CGPA CALCULATOR");
  JFrame.setDefaultLookAndFeelDecorated(true);
  
  JButton b1,b2,b3,b4,b5,b6,b7,b8,clear;
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
  clear= new JButton("Clear");
 
  
  b1.setBounds(20, 120, 50, 50);
  b2.setBounds(80, 120, 50, 50);
  b3.setBounds(140, 120, 50, 50);
  b4.setBounds(200, 120, 50, 50);
  b5.setBounds(260, 120, 50, 50);
  b6.setBounds(320, 120, 50, 50);
  b7.setBounds(380, 120, 50, 50);
  b8.setBounds(170, 200, 100, 50);
 // clear.setBounds(170, 200, 100, 50);




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



  f.setSize(1000,500);
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

   }

   public void actionPerformed(ActionEvent e)
   {
    int numSubjects = Integer.parseInt(t.getText());
    String [] grades=new String [numSubjects];
    if(count<=numSubjects)
    {
    if (e.getSource()==b1)
    grades[count++]="O";
    if (e.getSource()==b2)
    grades[count++]="A+";
    if (e.getSource()==b3)
    grades[count++]="A";
    if (e.getSource()==b4)
    grades[count++]="B";
    if (e.getSource()==b5)
    grades[count++]="C";
    if (e.getSource()==b6)
    grades[count++]="D";
    if (e.getSource()==b7)
    grades[count++]="F";
    if (e.getSource()==b8)
    {
      String []columnNames = {"Subject", "Grade", "Grade Point", "Marks Range","Percentage"};
      String [][] data = new String[numSubjects][5];
      for (int i = 0; i < numSubjects; i++) {
        data[i][0] = "Subject " + (i + 1);
        data[i][1] = grades[i];
        data[i][2] = calculateGradePoint(grades[i]);
        data[i][3] = calculateMarksRange(grades[i]);
        data[i][4] = calculatePercentage(grades[i]);
      }
      tblResults.setModel(new DefaultTableModel(data, columnNames));
    } 
  }
  //else
  //drawstring
   }

   private String calculateGradePoint(String grade) {
    // Code to calculate grade point based on grade
    switch(grade)
    {
        case "O"  : return "10"  ;
        case "A+" : return "9"   ;
        case "A"  : return "8"   ;
        case "B"  : return "7"   ;
        case "C"  : return "6"   ;
        case "D"  : return "5"   ;
        case "F"  : return "FAIL";

    }
}

private String calculateMarksRange(String grade) {
    // Code to calculate marks range based on grade
    switch( grade)
    {
        case "O"  : return "91-100" ;
        case "A+" : return "81-90"  ;
        case "A"  : return "71-80"  ;
        case "B"  : return "61-70"  ;
        case "C"  : return "51-60"  ;
        case "D"  : return "41-50"  ;
        case "F"  : return "FAIL"   ;

    }
}

private String calculatePercentage(String grade) {
  // Code to calculate percentage range based on grade
  switch( grade)
  {
      case "O"  : return "95%"  ;
      case "A+" : return "85%"  ;
      case "A"  : return "75%"  ;
      case "B"  : return "65%"  ;
      case "C"  : return "55%"  ;
      case "D"  : return "45%"  ;
      case "F"  : return "<35%" ;

  } */
}
    
   public static void main(String[] args) {
     CGPA c=new CGPA();
   }
}
