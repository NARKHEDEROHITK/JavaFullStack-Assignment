import java.util.Scanner;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		MyBank mb =new MyBank();
		int flag=1,ch,accno,accnow;
		double amount;
		do {
			System.out.println("Please choose your task");
			System.out.println("1.	Create Account \n.2.	Check Account Balance \n 3.	Withdraw the amount \n 4.	Deposit moneys \n 5.	Transfer money \n 6.	Exit the Application");
			ch=sc.nextInt();
			switch(ch) {
			case 1:System.out.println("choose your account \n 1. Default Account \n 2. Enter your details");
					int ch1=sc.nextInt();
					
					switch(ch1) {
					case 1: mb.accountCreate();
							break;
					case 2:System.out.println("Enter your Name=");
							String name=sc.next();
							System.out.println("Enter Amount=");
							amount=sc.nextDouble();
							mb.accountCreate(name,amount);
							break;
			
					}
				break;
			case 2:System.out.println("Enter your Account number=");
					accno=sc.nextInt();
					mb.checkBalence(accno);
					break;
			case 3:System.out.println("Enter your Account number=");
					accno=sc.nextInt();
					System.out.println("Enter your amount which is widraw=");
					amount=sc.nextInt();
					mb.widraw(accno, amount);
					break;
			case 4:System.out.println("Enter your Account number=");
						accno=sc.nextInt();
						System.out.println("Enter your amount which is deposite=");
						amount=sc.nextDouble();
						mb.deposite(accno, amount);
						break;
			case 5:System.out.println("Enter your Account number=");
					accno=sc.nextInt();
					System.out.println("Enter your amount which is widraw=");
					amount=sc.nextDouble();
					System.out.println("Enter  transfer account number=");
					accnow=sc.nextInt();
					mb.transfer(accno,accnow,amount);
					break;
			case 6:flag=0;
					break;
			}
		}while(flag==1);

	}
}


abstract class AccountInitialization {
	String name;
	double amount;
	static int acno=1;
        int ano;
	Scanner sc = new Scanner(System.in);
    Account ac[] = new Account[10];
	
	
	void accountCreate() {
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
	


		
	void accountCreate(String name,double amount) {
		if(AccountInitialization.acno < 120){
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



class Account {
	private String name;
	private double amount;
	private long acno;
	Account(String name,double amount,long acno){
		this.name = name;
		this.amount=amount;
		this.acno=acno;
	}
	


	public String getName() {
		return name;
	}



	public double getAmount() {
		return amount;
	}



	public long getAcno() {
		return acno;
	}



	public void setName(String name) {
		this.name = name;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setAcno(long acno) {
		this.acno = acno;
	}
}


interface Bank {
	void widraw(int accno ,double amount);
	void deposite(int accno ,double amount);
	void checkBalence(int accno);
}



class MyBank extends AccountInitialization implements Bank {

	int i;
	
	@Override
	public void widraw(int accno, double amount) {
		int f=0;
		for(i=1;i<=ano-1;i++){
			System.out.println(i);
			if(accno == ac[i].getAcno()){
				f=1;
				break;
			}
		}
		try{
			if(f==0){
				throw new Exception();
			}
			else{
			
			double balence = ac[accno].getAmount();
			double bal = balence-amount;
			if(bal > 500) {
				bal = balence-amount;
				ac[accno].setAmount(bal);
				}
			}
		}catch(Exception e){
			System.out.println("Invalid Acount number");
		}
		
		
		
		
		
		
	}

	@Override
	public void deposite(int accno, double amount) {
		// TODO Auto-generated method stub
		double balence = ac[accno].getAmount();
		double bal = balence+amount;
		ac[accno].setAmount(bal);
		
	}

	@Override
	public void checkBalence(int accno) {
		// TODO Auto-generated method stub
		String name = ac[accno].getName();
		double balence = ac[accno].getAmount();
		System.out.println("Name="+name);
		System.out.println("Balence="+balence);
		
	}

	@Override
	void transfer(int accno, int accnow,double amount) {
		// TODO Auto-generated method stub
		double balence = ac[accno].getAmount();
		double bal = balence-amount;
		if(bal > 500) {
			bal = balence-amount;
			ac[accno].setAmount(bal);

			double balenc = balence+amount;
			ac[accnow].setAmount(balenc);
		}
		else {
			System.out.println("balnce is insufficiant you can't transfer");
		}
		
	}
	
	
	
}
