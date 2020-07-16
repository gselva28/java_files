import java.util.*;
import java.io.*;
import java.lang.*;
class Bufferedwriter
{
public static void main(String args[])throws IOException
{
File f= new File("H:\\selva\\bwsample.txt");
FileWriter fw = new FileWriter(f);
BufferedWriter bw = new BufferedWriter(fw);
bw.write("arun");
bw.write("prasad");
bw.close();
}
}