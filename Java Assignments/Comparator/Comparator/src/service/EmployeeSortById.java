package service;

import java.util.Comparator;

import bean.Employee;

public class EmployeeSortById implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getId()-o2.getId();
	}
}
