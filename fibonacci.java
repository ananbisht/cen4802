import java.lang.*;
import java.util.*;
/*
 * @Anant Bisht
 */

public class fibonacci {
	/*
	 * 2 methods are made. The first one called add does the addition of the fibonacci sequence.
	 * The main method calls the add method and prints the output returned by the add method.
	 */

	public static int add (int n){
		/*
		 * The following static method takes an integer as an input (n). It then returns 1 
		 * if the input was 2 or lower as the first 2 numbers in the sequence are 1. 
		 * @return:
		 * If the number is greater than 1 then a it becomes recursive calling the method itself in a manner which adds
		 * 2 numbers which are at indexes (n-1) and (n-2) till the desired index is reached ((n-1))
		 * and returns the final answer. The numbers are added till (n-1) as the index starts from 0.
		 * 
		 */
		
		if (n<=2)
			return 1;
		else
			return add(n-1) + add(n-2);
		
	}



	public static void main(String[] args) {
		/*
		 * The main method first declares an integer to be used as the index. 
		 * As the result of the add methods is a variable it is stored in another variable y
		 * which uses x as an input. The output is stored in variable y which is then 
		 * printed out.
		 */
		
		int x = 10;
		int y = add(x);
		System.out.println("The "+x + "th term of the Fibonacci sequence is " + y );
		
	}

}
