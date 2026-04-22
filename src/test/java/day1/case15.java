package day1;
import java.util.*;
import org.openqa.selenium.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class case15 {
	public static void main(String[] args) throws IOException {
		File f1=new File("Folder2");
		f1.mkdir();
		File f2=new File("Folder2\\mnort.txt");
		f2.createNewFile();
		FileOutputStream fos=new FileOutputStream(f2);
		String a="I love to assosciate with you  \n Tomorrow should be nice";
		fos.write(a.getBytes());
		fos.flush();
		
		FileInputStream fis=new FileInputStream(f2);
		int jk = fis.read();
		
		while(jk!=-1) {
			System.out.print((char)jk);
			jk = fis.read();
		}
		
		fis.close();
		
		
	}
}
