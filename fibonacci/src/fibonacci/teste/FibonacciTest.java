package fibonacci.teste;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import fibonacci.Fibonacci;

/**
 * The FibonacciTest class has JUnit tests to run the methods and see the results of the Fibonacci class.
 * @author carlo
 *
 */
public class FibonacciTest {
	
	Fibonacci fibonacci = new Fibonacci();

	/**
	 * JUnit test method to get the Fibonacci element
	 */
	@Test
	public void testFibonacciElement() {
		Assert.assertEquals(2 ,fibonacci.findElementOfSequence(3), 0.00001);
		Assert.assertEquals(3 ,fibonacci.findElementOfSequence(4), 0.00001);
		Assert.assertEquals(5 ,fibonacci.findElementOfSequence(5), 0.00001);
		Assert.assertEquals(8 ,fibonacci.findElementOfSequence(6), 0.00001);
		Assert.assertEquals(13 ,fibonacci.findElementOfSequence(7), 0.00001);
	}

	/**
	 * JUnit test method to get the Fibonacci sequence
	 */
	@Test
	public void testFibonacciSequence() {
		Assert.assertEquals(Arrays.asList(), fibonacci.fibonacciSequence(0));
		Assert.assertEquals(Arrays.asList(1), fibonacci.fibonacciSequence(1));
		Assert.assertEquals(Arrays.asList(1,1), fibonacci.fibonacciSequence(2));
		Assert.assertEquals(Arrays.asList(2,1,1), fibonacci.fibonacciSequence(3));
		Assert.assertEquals(Arrays.asList(3,2,1,1), fibonacci.fibonacciSequence(4));
		Assert.assertEquals(Arrays.asList(5,3,2,1,1), fibonacci.fibonacciSequence(5));
		Assert.assertEquals(Arrays.asList(8,5,3,2,1,1), fibonacci.fibonacciSequence(6));
	}
	
	/**
	 * JUnit test method to verify if the informed number is a Fibonacci number
	 */
	@Test
	public void testIsFibonacci() {
		Assert.assertEquals(false, fibonacci.isFibonacci(0));
		Assert.assertEquals(true, fibonacci.isFibonacci(1));
		Assert.assertEquals(true, fibonacci.isFibonacci(2));
		Assert.assertEquals(true, fibonacci.isFibonacci(3));
		Assert.assertEquals(false, fibonacci.isFibonacci(4));
		Assert.assertEquals(true, fibonacci.isFibonacci(5));
		
	}

}
