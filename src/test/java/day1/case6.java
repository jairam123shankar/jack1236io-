package day1;
import java.util.*;
public class case6 {
	public static void main(String[] args) {
		String a="karim";
		try {
			int b=Integer.parseInt(a);
			System.out.println(b+12);
		}catch(Throwable t) {
			System.out.println(t);
		}
		
		System.out.println(a);
	}
}
