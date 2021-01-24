package service;
import bean.*;
import java.util.Scanner;

abstract class AccountInitialization {
	String name;
	double amount;
	static int acno=1;
        int ano;
	Scanner sc = new Scanner(System.in);
    Account ac[] = new Account[10];
	
	
	public void accountCreate() {
	if(AccountInitialization.acno < 10){
		name="unknown";
		amount = 500;
		
		int j=AccountInitialization.acno;
		ac[j] = new Account(name,amount,AccountInitialization.acno);
		display(j);
		AccountInitialization.acno++;
		ano= AccountInitialization.acno;

	}
	else{
		System.out.println("Aaccount limit have only 10");
	}
	}
	


		
	public void accountCreate(String name,double amount) {
		if(AccountInitialization.acno < 10){
		this.name=name;
		do {
			if(amount > 500) {
				this.amount = amount;
				System.out.println("Account no ="+AccountInitialization.acno);
			}
			else {
				System.out.println("Minimum balence requirement is 500Rs please Enter new amount");
				
				this.amount=sc.nextDouble();
				
			}
		}while(this.amount < 500);
		
		int i=AccountInitialization.acno;
		ac[i] = new Account(this.name,this.amount,AccountInitialization.acno);
		display(i);
		AccountInitialization.acno++;
		ano= AccountInitialization.acno;
	}
	else{
		System.out.println("Aaccount limit have only 10");
	}
		
	}
	


	void display(int i){
		System.out.println("Name of Account holder="+ac[i].getName());
		System.out.println("Account Number ="+ac[i].getAcno());
		System.out.println("Balence of Account Holder="+ac[i].getAmount());
	}
	
	abstract void transfer(int accno,int accnow,double amount); 
	
	
	
}
