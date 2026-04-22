package day1;
import java.util.*;
public class case4 {
	public static void main(String[] args) {
		int a=10,c;
		System.out.println("Enter b value: ");
		Scanner sc=new Scanner(System.in);
		try {
		int b=sc.nextInt();
		
		
			c=a/b;
			System.out.println(c);
		}catch(Throwable t) {
			System.out.println(t);
		}
		
		sc.close();
		
		System.out.println(a);
	}
}
