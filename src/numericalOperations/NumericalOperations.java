package numericalOperations;

import java.util.List;

import conversion.Conversions;

public class NumericalOperations {

	public static int findMaxOfArray(int[] A){
		return findMaxOfList(Conversions.fromArrayToList(A));
	}
	
	public static int findMaxOfList(List<Integer> list){
		return list.stream().mapToInt(Integer::intValue).max().getAsInt();
	}
	
	
}
