import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class SearchName extends JFrame {
static String name;
static String age;

public SearchName() {
}

public SearchName(String name, String age) {
this.name = name;
this.age = age;
}

public String getName() {
return name;
}

public String getAge() {
return age;
}

public static void main(String[] args) {
SearchName search = new SearchName();
JButton button = new JButton("Search");
JPanel panel = new JPanel();
panel.add(button);
search.add(panel);
search.setSize(300, 60);
search.setVisible(true);
ActionListener actionListener = new ActionListener() {
public void actionPerformed(ActionEvent actionEvent) {
String n = JOptionPane.showInputDialog(null, "Enter name");
try {
FileInputStream fstream = new FileInputStream(
"studentRecord.txt");
DataInputStream in = new DataInputStream(fstream);
BufferedReader br = new BufferedReader(
new InputStreamReader(in));
String strLine;
ArrayList list = new ArrayList();
while ((strLine = br.readLine()) != null) {
list.add(strLine);
}
Iterator itr;
for (itr = list.iterator(); itr.hasNext();) {
String str = itr.next().toString();
String[] splitSt = str.split(" ");
String id = "", name = "", age = "";
for (int i = 0; i < splitSt.length; i++) {
id = splitSt[0];
name = splitSt[1];
age = splitSt[2];
}
ArrayList alist = new ArrayList();
alist.add(new SearchName(name, age));
for (SearchName s : alist) {
if (n.equals(s.getName())) {
System.out.println("Name Age ");
System.out.print(s.getName() + " " + s.getAge());
}
}
}
} catch (Exception e) {
}
}
};

button.addActionListener(actionListener);
}
}