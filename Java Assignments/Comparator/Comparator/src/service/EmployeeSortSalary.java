package service;
import java.util.Comparator;
import bean.Employee;


public class EmployeeSortSalary implements Comparator<Employee> {
		
	@Override
		public int compare(Employee o1, Employee o2) 
	{
		return (int) (o1.getSalary()-o2.getSalary());

	}

}
