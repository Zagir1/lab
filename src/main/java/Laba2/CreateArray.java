package Laba2;

public class CreateArray {
	private int[] array;
	public void create() {
		array = new int[10];
		Random rnd = new Random();
		for(int i=0;i<array.length;i++) {
			array[i] = rnd.getRandomNumber();
		}
	}
	public int[] getArray() {
		return array;
	}
}
