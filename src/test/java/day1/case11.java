package day1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class case11 {
	public static void main(String[] args) throws IOException {
		File f=new File("day1\\mno.txt");
		
		FileReader fr=new FileReader(f);
		System.out.println(fr.read());
		
		
		
		
	}
}
