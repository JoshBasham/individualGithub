package individualGithub;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMethods {
	int[] sortedArray = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 10, 11, 12, 19};
	int[] defaultArray = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,12,11,10,19};
	@Test
	void test() {
	 assertArrayEquals(sortedArray, arraySort.sortArray(defaultArray));
	}

}
