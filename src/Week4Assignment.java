import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Week4Assignment {

	public static void main(String[] args) {

//QUESTION 1
	ArrayList<String> employeeNames = new ArrayList<String>();

//QUESTION 2
	HashSet<Integer> ids = new HashSet<Integer>();

//QUESTION 3
	HashMap<Integer, String> employeeMap = new HashMap<>();
	
//QUESTION 4
	employeeNames.add("Greg");
	employeeNames.add("Chelsea");
	employeeNames.add("Willow");
	employeeNames.add("Gompers");
	employeeNames.add("Sasson");	
	
	ids.add(1);
	ids.add(2);
	ids.add(3);
	ids.add(4);
	ids.add(5);

//QUESTION 5
	int i = 0;
	
	for(int id : ids) {
		String name = employeeNames.get(i);
		employeeMap.put(id, name);
		i = i+1;
	}	

//QUESTION 6
	for(int id : employeeMap.keySet()) {
		String name = employeeMap.get(id);
		System.out.println(id + "=" + name);
	}
//QUESTION 7
	StringBuilder idsBuilder = new StringBuilder();
//Question 8
	for(int id : ids) {
		idsBuilder.append(id + "-");
	}
		idsBuilder.setLength(idsBuilder.length() - 1);
		System.out.println(idsBuilder.toString());
		
//QUESTION 9
	StringBuilder namesBuilder = new StringBuilder();
	for(String name : employeeNames) {
		namesBuilder.append(name).append(" ");
	}
	namesBuilder.setLength(namesBuilder.length() - 1);
	System.out.println(namesBuilder.toString());
	}

}
