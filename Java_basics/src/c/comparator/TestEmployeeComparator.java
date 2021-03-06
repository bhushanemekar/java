package c.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import c.compare.Employee;

public class TestEmployeeComparator {

	public static void main(String[] args) {
		Employee e1 = new Employee(123, "Bhushan", "Java");
		Employee e2 = new Employee(456, "Chaman", "Kava");
		Employee e3 = new Employee(789, "Dhakkan", "Rava");
		
		List<Employee> arList = new ArrayList<Employee>();
		arList.add(e3);
		arList.add(e2);
		arList.add(e1);
		System.out.println("Before SOrting"+arList);
		
		Collections.sort(arList, new EmployeeComparator());
		
		System.out.println("sorted list "+arList);
		
	}
}
