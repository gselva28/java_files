import java.util.*;
import java.io.*;
import java.lang.*;
class Bufferedreader
{
public static void main(String args[])throws IOException
{
File f= new File("H:\\selva\\bwsample.txt");
FileReader fr = new FileReader(f);
BufferedReader br = new BufferedReader(fr);
char ch[] = new char[(int)f.length()];
br.read(ch);
for(char c:ch)
System.out.println(c);
br.close();
}
}