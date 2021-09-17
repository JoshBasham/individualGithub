package individualGithub;

import java.util.Arrays;

public class ArraySort {
	
	public static int[] sortArray(int[] arr) {
		// creates copy of array and sorts it
		int[] arrCopy = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arrCopy);
		
		//System.out.println(Arrays.toString(arrCopy));
		return arrCopy;
	}
}
