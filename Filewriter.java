import java.util.*;
import java.io.*;
class Filewriter
{
public static void main(String args[])throws IOException
{
File f = new File("H:\\selva\\fwsample.txt ");
FileWriter fw = new FileWriter(f);
fw.write("100");
fw.close();
}
}