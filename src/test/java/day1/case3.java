package day1;
import java.util.*;
public class case3 {
	public static void main(String[] args) {
		int[] a=new int[2];
		try {
			a[0]=22;
			a[1]=12;
			a[2]=45;
		}catch(Throwable t) {
			System.out.println(t);
		}
		
		
		System.out.println(a[0]);
	}
}
