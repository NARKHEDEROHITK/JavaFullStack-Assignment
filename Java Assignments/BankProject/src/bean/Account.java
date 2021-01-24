package bean;

public class Account {
	private String name;
	private double amount;
	private long acno;
	public Account(String name,double amount,long acno){
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
