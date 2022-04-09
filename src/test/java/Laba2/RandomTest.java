package Laba2;

import static org.junit.Assert.*;
import org.junit.Test;

public class RandomTest {

	@Test
	public void test() {
		Random rnd = new Random();
		int test = rnd.getRandomNumber();
		int min =100;
		int max =700;
		assertTrue(min < test && test < max);
	}

}
