import java.util.Scanner;
class Emp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many Numbers of record of employyes=");
		int n = sc.nextInt();
		int id[] =new int[n];
		String name[] =new String[n];
		double salary[] =new double[n];
		String des[] =new String[n];
		
		System.out.println("Enter Employees Record");

		for(int i=0;i<n;i++){
			System.out.println("Enter Employee "+(i+1)+" Record");
			System.out.println("Enter id of employee =");
			id[i] = sc.nextInt();
			System.out.println("Enter name of employee =");
			name[i] = sc.next();	
			System.out.println("Enter Salary of employee =");
			salary[i] = sc.nextDouble();
			System.out.println("Enter desiganation of employee =");
			des[i] = sc.next();
		}
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

			System.out.println("Employee"+i+" Record");
			System.out.println("ID of employee ="+id[i]);
			System.out.println("Name of employee ="+name[i]);
			System.out.println("Salary of employee ="+salary[i]);
			System.out.println("Desiganation of employee ="+des[i]);
			
		}
	}
}