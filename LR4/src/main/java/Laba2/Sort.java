package Laba2;

public class Sort {
	private int[] array;
	public Sort(int[] array) {
		this.array = array;
	}	
	public void bubbleSorter(){    
		boolean isSorted = false;
		int buf;
		while(!isSorted) {
			isSorted = true;
		    for (int i = 0; i < array.length-1; i++) {
		    	if(array[i] > array[i+1]){
		    		isSorted = false;

		            buf = array[i];
		            array[i] = array[i+1];
		            array[i+1] = buf;
		            }
		    	}
		    }
		}
	public int[] getArray() {
		return array;
		}
}
