package c.comparator;

import java.util.Comparator;

import c.compare.Employee;

public class EmployeeComparator implements Comparator<Employee>{
	
		
	public int compare(Employee e1, Employee e2){
		if(e1.getId() > e2.getId())
			return 1;
		
		else if(e1.getId() < e2.getId())
			return -1;
		else 
			return 0;
		
	}

	

}
