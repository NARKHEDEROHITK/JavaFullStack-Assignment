import java.util.Scanner;
class Employee{
	Scanner sc =new Scanner(System.in);
	Address add = new Address();
	int id;
	String name;
	double salary;
	double bonus,pf,hra,da;
	static int count=0,c=0;
	void read(){
		Scanner sc = new Scanner(System.in);
		
			if(count==0){
				System.out.println("Employee Manager Record");	
			}
			else{
				System.out.println("Employee programer Record");
			}
			count++;
		
			
			System.out.println("Enter id of employee =");
			id = sc.nextInt();
			System.out.println("Enter name of employee =");
			name = sc.next();	
			System.out.println("Enter Salary of employee =");
			salary = sc.nextDouble();	
		
	}

	void calSalary(){
			
			hra=salary*10/100;
			da=salary*7/100;
			pf=salary*5/100;
			salary= salary+hra+da-pf;	
	}

	

	void display(){
			if(c==0){
				System.out.println("Employee Manager Record");	
			}
			else{
				System.out.println("Employee programer Record");
			}
			c++;
		
			
			System.out.println("ID of employee ="+id);
			System.out.println("Name of employee ="+name);
			System.out.println("Salary of employee ="+salary);
		
	}
	


	
}

class Manager extends Employee{
	int noOfEmployee;
	void readMgr(){
		read();
		add.readAddress();
		System.out.println("Enter number of employee which under Manager=");
		noOfEmployee = sc.nextInt();
	}
	void disMgr(){
		display();
		add.disAddress();
		System.out.println("Number of Employee under the manager="+noOfEmployee);
	}
}

class Programer extends Employee{
	String projectName;
	void readPgr(){
		read();
		add.readAddress();
		System.out.println("Enter the project name =");
		projectName = sc.next();
	}
	void disPgr(){
		display();
		add.disAddress();
		System.out.println("Project name="+projectName);
	}
}

class Address{
	String city,state;
	long pin;
	Scanner sc = new Scanner(System.in);
	void readAddress(){
			System.out.println("Enter your city name =");
			city = sc.next();
			System.out.println("Enter State of employee =");
			state = sc.next();	
			System.out.println("Enter Pincode =");
			pin = sc.nextLong();
	}
	void disAddress(){
		
			System.out.println("City of employee ="+city);
			System.out.println("State of employee ="+state);
			System.out.println("pincode ="+pin);
		
	}
	
	
}

class Relations{
	public static void main(String args[]){
		
		Manager mg = new Manager();
		Programer pg = new Programer();
		mg.readMgr();
		pg.readPgr();
		mg.disMgr();
		pg.disPgr();
		
	}
}