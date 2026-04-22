package day1;
import java.util.*;
public class case7 {
	public static void main(String[] args) {
		s2();
	}
	
	public static void s2() {
		s3();
	}
	
	public static void s3() {
		try {
			s2();
		}catch(Throwable t) {
			System.out.println(t);
		}
		
	}
}
