package sharatprograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataInTextByJava {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str="C:\\Users\\admin\\Desktop\\hjbjk.txt";
		String line=null;
		try {
			FileReader fis=new FileReader(str);
			BufferedReader bur=new BufferedReader(fis);
			while((line=bur.readLine())!=null) {
			System.out.println(line);
			}
			bur.close();
		}
		catch(FileNotFoundException ex){
			System.out.println(" unable");
		}
}}


