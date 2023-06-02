import java.io.*;
import java.util.*;
class Count
{
public static void main(String args[ ])throws IOException
{
long nl=0,nw=0,nc=0;
String line;
BufferedReader br=new BufferedReader(new FileReader(args[0]));
while ((line=br.readLine())!=null)
{
nl++;
nc=nc+line.length();
StringTokenizer st = new StringTokenizer(line);
nw += st.countTokens();
}
System.out.println("Number of Characters: "+nc);
System.out.println("Number of Words: "+nw);
System.out.println("Number of Lines: "+nl);
}
}
