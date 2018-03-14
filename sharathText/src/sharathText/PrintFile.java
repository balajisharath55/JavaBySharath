package sharathText;
import java.io.*;
public class PrintFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fileName=new File("E:/sharath.txt");
		FileInputStream inFile=new FileInputStream("E:/sharath.txt");
		int fileLength =(int)fileName.length();
		byte Bytes[]=new byte[fileLength];
		System.out.println("File size is:"+ inFile.read(Bytes));
String file1=new String(Bytes);
System.out.println("File content is :"+ file1);
inFile.close();
	}

}
