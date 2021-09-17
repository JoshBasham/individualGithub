package individualGithub;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,12,11,10,19};
		
		System.out.println(Arrays.toString(ArraySort.sortArray(arr)));
		System.out.println(Arrays.toString(CountArray.countNums(arr)));
		
	}


}