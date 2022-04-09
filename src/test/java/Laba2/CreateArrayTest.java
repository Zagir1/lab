package Laba2;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CreateArrayTest {
private static int[] array;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		CreateArray test = new CreateArray();
		test.create();
		array = test.getArray();
	}

	@Test
	public void test() {
		int size = 10;
		assertEquals(array.length, size);
		assertNotNull(array);
	}

}
