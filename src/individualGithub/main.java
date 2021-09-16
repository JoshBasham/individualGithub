package individualGithub;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,12,11,10,19};
		
		printSortedArray(arr);
		
	}


public static void printSortedArray(int[] arr) {
	
	int[] arrCopy = Arrays.copyOf(arr, arr.length);
	Arrays.sort(arrCopy);
	
	System.out.println(Arrays.toString(arrCopy));
	
}

}