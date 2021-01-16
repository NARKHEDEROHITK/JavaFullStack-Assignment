import java.util.Scanner;
class EmpDetails{
	int n;
	int id[];
	String name[];
	double salary[];
	String des[];

	EmpDetails(int size){
		this.n=size;
		id=new int[size];
		name=new String[size];
		salary=new double[size];
		des=new String[size];
		
	}
	
	

	void read(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employees Record");
		//System.out.println("value of n="+n);

		for(int i=0;i<n;i++){
			System.out.println("Enter Employee "+(i+1)+" Record");
			System.out.println(id.length);
			System.out.println("Enter id of employee =");
			id[i] = sc.nextInt();
			System.out.println("Enter name of employee =");
			name[i] = sc.next();	
			System.out.println("Enter Salary of employee =");
			salary[i] = sc.nextDouble();
			System.out.println("Enter desiganation of employee =");
			des[i] = sc.next();
		}

	}

	void calSalary(){
		double bonus,pf,hra,da;
		for(int i=0;i<n;i++){
			if(des[i].equals("Manager")){
				bonus=salary[i]*15/100;
			}else if(des[i].equals("Developer")){
				bonus=salary[i]*10/100;
			}else{
				bonus=salary[i]*5/100;
			}
			hra=salary[i]*10/100;
			da=salary[i]*7/100;
			pf=salary[i]*5/100;
			salary[i]= salary[i]+hra+da+bonus-pf;	
		}

	}
	void display(){
		for(int i =0;i<n;i++){
			System.out.println("Employee"+(i+1)+" Record");
			System.out.println("ID of employee ="+id[i]);
			System.out.println("Name of employee ="+name[i]);
			System.out.println("Salary of employee ="+salary[i]);
			System.out.println("Desiganation of employee ="+des[i]);
		}
	}
}


class EmpMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of Array=");
		int size = sc.nextInt();
		EmpDetails e1 = new EmpDetails(size);
		e1.read();
		e1.calSalary();
		e1.display();
	}
}