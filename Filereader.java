import java.util.*;
import java.io.*;
import java.lang.*;
class Filereader
{
public static void main(String args[])throws IOException
{
File f = new File("H:\\selva\\fwsample.txt ");
FileReader fr = new FileReader(f);
char ch[] = new char[(int)f.length()];
fr.read(ch);
for(char c:ch)
System.out.println(c);
fr.close();
}
}