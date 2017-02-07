package com.pluralsight.interview_exercises;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		int i = e1.getName().compareTo(e2.getName());
		if (i != 0){
			return i;
		}
		
		i = e1.getDepartment().compareTo(e2.getDepartment());
		if (i != 0){
			return i;
		}
		
		return e1.getAge().compareTo(e2.getAge());
	}
}
