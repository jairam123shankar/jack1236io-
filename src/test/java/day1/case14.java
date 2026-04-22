package day1;
import java.util.*;
import org.openqa.selenium.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class case14 {
	public static void main(String[] args) throws IOException {
		File f=new File("folder1\\mno.txt");
		boolean a=f.exists();
		System.out.println(a);
		
		File f1=new File("Folder2");
		f1.mkdir();
		File f2=new File("Folder2\\mnort.txt");
		f2.createNewFile();
		
		FileWriter fw=new FileWriter(f2);
		fw.write("first line \n");
		fw.write("2nd line \n");
		fw.write("3rd line");
		fw.flush();
		
		
		FileReader fr=new FileReader(f2);
		/*
		int v = fr.read();
		while(v!=-1) {
			System.out.print((char)v);
			v = fr.read();
		}*/
		
	
		
		BufferedReader br=new BufferedReader(fr);
		String gh = br.readLine();
		while(gh!=null) {
			System.out.println(gh);
			gh = br.readLine();
		}
		
		PrintWriter pw=new PrintWriter(f2);
		pw.write("raju is great director\n");
		pw.write("how are u");
		pw.flush();
		
		
	}
}
