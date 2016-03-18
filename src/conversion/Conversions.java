package conversion;

import java.util.Arrays;
import java.util.List;

public class Conversions {

	public static List<Integer> fromArrayToList(int[] a){
		Integer[] array = Arrays.stream(a).boxed().toArray(Integer[]::new);
		List<Integer> list = Arrays.asList(array);
		return list;
	}
	
	public void a(){
		
	}
}
