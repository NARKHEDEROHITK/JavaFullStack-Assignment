package service;
import bean.*;
public class MyBank extends AccountInitialization implements Bank {

	int i;
	public int validAccount(int accno) {
		int f=0;
		for(i=1;i<=ano-1;i++){
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
				return 1;
			}
			
		}catch(Exception e){
			System.out.println("Invalid Acount number");
			return 0;
		}
	}

	
	@Override
	public void widraw(int accno, double amount) {
		
			
			double balence = ac[accno].getAmount();
			double bal = balence-amount;
			try{
				if(bal > 500) {
				bal = balence-amount;
				ac[accno].setAmount(bal);
				}else{
					throw new Exception();
				}
			}catch(Exception e){
				System.out.println("You can't widraw the amount please maintain balence minimun 500rs");
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
	public
	void transfer(int accno, int accnow,double amount) {
		// TODO Auto-generated method stub
		double balence = ac[accno].getAmount();
		double bal = balence-amount;
		
		try{
			if(bal > 500) {
				
				ac[accno].setAmount(bal);
				double b=ac[accnow].getAmount();
				double balenc = b+amount;
				ac[accnow].setAmount(balenc);
			}else{
				throw new Exception();
				}
		}catch(Exception e){
			System.out.println("You can't widraw the amount please maintain balence minimun 500rs");
		}
		
		
	}
	
	
	
}
