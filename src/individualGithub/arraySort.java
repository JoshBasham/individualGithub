package individualGithub;

import java.util.Arrays;

public class arraySort {
	
	public static int[] sortArray(int[] arr) {
		
		int[] arrCopy = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arrCopy);
		
		//System.out.println(Arrays.toString(arrCopy));
		return arrCopy;
	}
}
