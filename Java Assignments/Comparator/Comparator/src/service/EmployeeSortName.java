package service;

import java.util.Comparator;

import bean.Employee;


public class EmployeeSortName implements Comparator<Employee> {
		
	@Override
		public int compare(Employee o1, Employee o2) 
	{
			return o1.getName().compareTo(o2.getName());

	}

}
