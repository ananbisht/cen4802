import java.lang.*;
import java.util.*;

public class fibonacci {
	
	public static int add (int n){
		
		if (n<=2)
			return 1;
		else
			return add(n-1) + add(n-2);
		
	}



	public static void main(String[] args) {
		int x = 10;
		int y = add(x);
		System.out.println("The "+x + "th term of the Fibonacci sequence is " + y );
		
	}

}
