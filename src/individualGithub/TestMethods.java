package individualGithub;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestMethods {
	
	int[] arr = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,12,11,10,19};
	int[] sortedArr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 10, 11, 12, 19};

	
	@Test
	void test() {
		assertArrayEquals(sortedArr, ArraySort.sortArray(arr));
	}
	
	@Test 
	void test2() {
		assertEquals("[1:2, 2:2, 3:2, 4:2, 5:2, 6:2, 7:2, 8:2, 9:1, 12:1, 11:1, 10:1, 19:1]", Arrays.toString(CountArray.countNums(arr)));
	}
}
