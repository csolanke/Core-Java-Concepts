import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindingOccurenceOfString {
	
	
	public static void main(String[] args) {
		
		List<String> employeeList = Arrays.asList("Chandra", "Swap", "Sid","Lead","Ram","Ram","chad","chad","chad","Amey","Amey","Amey","Amey","Amey","Amey","Amey","Amey","Amey");
		
		Map<String, Integer> empMap = new HashMap<>();
		
		Set<Entry<String, Integer>> entrySet = empMap.entrySet();
		
		for (String empName : employeeList) {
			int counter = 1;
			if(!entrySet.isEmpty() && empMap.containsKey(empName))
			{
				Integer integer = empMap.get(empName);
				
				empMap.put(empName, ++integer);
			}
			
			else {
				
				empMap.put(empName, counter);
			}
		}
		
		System.out.println(empMap.toString());
			
			
			
		}
		
		
		
		
		
		
	

}
