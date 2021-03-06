import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSelectionSort {

	private SelectionSort temp1;
	@Test
	public void test() {
		testPositive();
		//testNegative();
		//testMixed();
	}
	
	public void testPositive()
	{
		int[] arr = {8, 9, 7, 10, 2};
		int[] sorted = {2, 7, 8, 9, 10};
		SelectionSort temp1 = new SelectionSort();
		temp1.sort(arr);
		assertArrayEquals(arr, sorted);
	}
	public void testNegative()
	{
		int[] arr = {-8, -9, -7, -10, -2};
		int[] sorted = {-10, -9, -8, -7, -2};
		SelectionSort temp1 = new SelectionSort();
		temp1.sort(arr);
		assertArrayEquals(arr, sorted);
	}
	public void testMixed()
	{
		int[] arr = {-8, 9, -7, -10, 2};
		int[] sorted = {-10, -8, -7, 2, 9}; 
		SelectionSort temp1 = new SelectionSort();
		temp1.sort(arr);
		assertArrayEquals(arr, sorted);
	}

}
