package Laba2;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SortTest {
	static int[] mas = {14, 50, 31, 200, 40};
	static int[] massort = {14, 31, 40, 50, 200};
	static Sort test;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		test = new Sort(mas);
	}
	@Test
	public void test() {
		test.bubbleSorter();
		mas = test.getArray();
		assertArrayEquals(mas, massort);
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		mas = null;
		massort = null;
	}

}
