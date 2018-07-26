package JavaIOSample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class sample {
public static void main(String[] args){
	/*System.out.println("System.out");
	System.err.println("system.err");
	try {
		System.out.println(" enter value of i");
		int i=System.in.read();
		System.out.println((char)i);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	
	try {
		FileOutputStream fout=new FileOutputStream("E:/sample.txt");
		String s="Hello";
		byte b[]=s.getBytes();
		fout.write(b);
		FileInputStream fin=new FileInputStream("E:/sample.txt");
		int i=fin.read();
		System.out.println((char)i);
	} catch (FileNotFoundException e) {
	
		e.printStackTrace();
	} catch (IOException e) {
				e.printStackTrace();
	}
	
}
}
