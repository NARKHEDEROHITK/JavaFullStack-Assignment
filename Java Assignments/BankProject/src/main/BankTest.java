package main;
import service.*;
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
					if(mb.validAccount(accno) == 1){
							mb.checkBalence(accno);
					}
					
					break;
			case 3:System.out.println("Enter your Account number=");
					accno=sc.nextInt();
					if(mb.validAccount(accno) == 1){
							System.out.println("Enter your amount which is widraw=");
							amount=sc.nextInt();
							mb.widraw(accno, amount);
						}
					
					break;
			case 4:System.out.println("Enter your Account number=");
						accno=sc.nextInt();	
						if(mb.validAccount(accno) == 1){
							System.out.println("Enter your amount which is deposite=");
							amount=sc.nextDouble();
							mb.deposite(accno, amount);
						}
						break;
			case 5:System.out.println("Enter your Account number=");
					accno=sc.nextInt();
					if(mb.validAccount(accno) == 1){
							System.out.println("Enter your amount which is widraw=");
							amount=sc.nextDouble();
							System.out.println("Enter  transfer account number=");
							accnow=sc.nextInt();
							if(mb.validAccount(accnow) == 1){
								mb.transfer(accno,accnow,amount);
							}
							
						}
					
					break;
			case 6:flag=0;
				System.out.println("Thank you Visit Again");
					break;
			default:System.out.println("Please enter right choice");
			}
		}while(flag==1);

	}
}
