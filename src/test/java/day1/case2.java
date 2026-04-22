package day1;
import java.util.*;
public class case2 {
	public static void main(String[] args) {
		int a=10,b=0;
		int c;
		try {
			c=a/b;
			System.out.println(c);
		}catch(Throwable t){
			//System.out.println("data is false");
			System.out.println(t);
		}
		
	}
}
