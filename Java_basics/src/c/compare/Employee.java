package c.compare;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{

	
	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}


	private int id;
	private String name;
	private String dept;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	
	
	@Override
	public int compareTo(Employee eNew) {
		if(this.getId() > eNew.getId())
			return 1;
		
		else if(this.getId() < eNew.getId())
			return -1;
		else 
			return 0;
	}

	@Override
	public String toString() {
		String ret = "Employee "+this.getId()+" : "+this.getName()+" : "+this.getDept();
		return ret;
	}
}
