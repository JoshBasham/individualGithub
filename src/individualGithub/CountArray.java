package individualGithub;
import java.util.*;
public class CountArray {

	public static Object[] countNums(int[] arr){
		
		ArraySort.sortArray(arr);
		
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<String> sl = new ArrayList<String>();
		
		
		// adds unique int into arraylist
		for(int i: arr) {
			if(!al.contains(i)) {
				al.add(i);
			}
		}
		
		//Iterates through list of unique numbers and counts them in the array, adding them to the string arraylist.
		for(int t: al) {
			int c=0;
			for(int i: arr) {
				if(i == t) {
					c++;
				}
			}
			sl.add(t+":"+c);
		}
		
		//converts arraylist to object array
		Object[] sa = sl.toArray();
		
		return sa;
		
	}
	
}
