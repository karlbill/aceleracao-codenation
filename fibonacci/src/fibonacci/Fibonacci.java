package fibonacci;

import java.util.ArrayList;
import java.util.List;

/**
 * Fibonacci is a class to calculates an element and to creates a list of elements in a Fibonacci sequence.
 * @author Carlos Guilherme
 *
 */
public class Fibonacci {

	/**
	 * Calculates the element of the Fibonacci sequence that are in the informed position.
	 * @param n The number of the element in the Fibonacci sequence
	 * @return The element of the Fibonacci sequence
	 */
	public int findElementOfSequence(int num) {
		if(num < 2) {
			return num;
		}
		
		return findElementOfSequence(num - 1) + findElementOfSequence(num - 2);
	}

	/**
	 * Generates a list of elements in the Fibonacci sequence based on the informed element's number.
	 * @param n The number of the elements of the Fibonacci sequence
	 * @return the list of numbers in the Fibonacci sequence
	 */
	public List<Integer> fibonacciSequence(int num){
		List<Integer> fibonacciList = new ArrayList<Integer>();
		
		while(num > 0) {
			fibonacciList.add(findElementOfSequence(num));
			num--;
		}
		
		return fibonacciList;
	}

	
	/**
	 * Returns a boolean that indicates if the number is a Fibonacci number
	 * @param num
	 * @return a boolean as resulted
	 */
	public boolean isFibonacci(int num){
		List<Integer> fibonacciList = new ArrayList<Integer>();
		int sequenceSize = 30;
		fibonacciList = fibonacciSequence(sequenceSize);

		return fibonacciList.contains(num);
	}
}
