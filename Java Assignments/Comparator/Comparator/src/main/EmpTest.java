package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import bean.Employee;
import service.EmployeeSortById;
import service.EmployeeSortName;
import service.EmployeeSortSalary;

public class EmpTest
{

	public static void main(String[] args)
	{
		List<Employee> loe = new ArrayList<>();
			int ch;
			System.out.println("How many records want to store?");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			for(int i=0;i<n;i++) {
			System.out.println("Enter the Id:");
			int id=sc.nextInt();
			
			System.out.println("Enter the Name:");
			String name =sc.next();
			System.out.println("Enter the Salary:");
			float salary=sc.nextFloat();
			loe.add(new Employee(id, name, salary));
			}
			System.out.println("Show all Objects");
			for(Employee emp : loe) 
			{
				System.out.println(emp);
			}
			
		do 
		{
			System.out.println("1. Sort By Id\n   a. Ascending Order\n   b. Descending Order");
			System.out.println("2. Sort By Name\n   a. Ascending Order\n   b. Descending Order");
			System.out.println("3. Sort By Salary\n   a. Ascending Order\n  b. Descending Order");
			System.out.println("4. EXIT");
			System.out.println("Enter Your Choice :");
	       ch = sc.nextInt();	
	       switch(ch)
           {	
           		case 1:
           					System.out.println("Enter Your Choice :");
           					int c = sc.next().charAt(0);
           					switch(c)
           					{
           					case 'a': 	
         							Collections.sort(loe,new EmployeeSortById());			
         							System.out.println();
         							System.out.println("After Sort");
         							for(Employee emp : loe) 
         							{
         								System.out.println(emp);
         							
         							}
         							break;
         							
           					case 'b': 
         							Collections.sort(loe,new EmployeeSortById());			
         							System.out.println();
         							System.out.println("After Sort");
         							Collections.reverse(loe);
         							for(Employee emp : loe) 
         							{
         								System.out.println(emp);
 		    	
         							}
         							break;
           					}
           					break;
           					
           		case 2:
   							System.out.println("Enter Your Choice :");
   							c = sc.next().charAt(0);
   							switch(c)
   							{
   							case 'a': 	
   									Collections.sort(loe,new EmployeeSortName());			
   									System.out.println();
   									System.out.println("After Sort");
   									for(Employee emp : loe) 
   									{
   										System.out.println(emp);
 		    	
   									}
   									break;
 							
   							case 'b': 
   									Collections.sort(loe,new EmployeeSortName());			
   									System.out.println();
   									System.out.println("After Sort");
   									Collections.reverse(loe);
   									for(Employee emp : loe) 
   									{
   										System.out.println(emp);
	    	
   									}
   									break;
   							}
   							break;
           		case 3:
           					System.out.println("Enter Your Choice :");
           					c = sc.next().charAt(0);
           					switch(c)
           					{
           					case 'a': 	
           							Collections.sort(loe,new EmployeeSortSalary());			
           							System.out.println();
		 							System.out.println("After Sort");
		 							for(Employee emp : loe) 
		 							{
		 								System.out.println(emp);
		 							
		 							}
		 							break;
 							
		   					case 'b': 
		 							Collections.sort(loe,new EmployeeSortSalary());	
		 							System.out.println();
		 							System.out.println("After Sort");
		 							Collections.reverse(loe);
		 							for(Employee emp : loe) 
		 							{
		 								System.out.println(emp);
			    	
		 							}
		 							break;
		   					}
		   					break;
           		case 4:ch=0;
           			break;
		        default:
		        			
							System.out.println("Please give correct choice");
							break;
		           }


		 	}while(ch!=0);	}
}
