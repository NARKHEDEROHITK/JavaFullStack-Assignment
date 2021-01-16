import java.util.Scanner;
class Exam{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Online Examination");
	boolean flag,c1=false,c2=false,c3=false;
	int marks=10;
	int ans;
		do{
			System.out.println("1.English \n 2.Math \n 3.GK");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch(ch){
				case 1: if(c1)
					{
						System.out.println("You have already Fnished English Exam");
						break;
					}
					else
					{
					System.out.println("Welcome to English Examination");
					System.out.println("Which of following is not a part of speech?  \n 1.Noun \n 2.Verb \n 3.ProNoun \n 4.Article");
					System.out.println("Enter Option here:");
					ans = sc.nextInt();
					if(ans==4)
					{
						 marks = marks+10;
					}

					System.out.println("Which of following is not a part of Article? \n 1.a \n 2.an \n 3.verb \n 4.the");
					System.out.println("Enter Option here:");
					ans = sc.nextInt();
					if(ans==3)
					{
						 marks = marks+10;
					}
					
					
					
					System.out.println("Which of following is famous english writter? \n 1.mahadevi verma  \n 2.chetan Bhagat \n 3.willium Shakespere\n 4.Anjan korali");
					System.out.println("Enter Option here:");
					ans = sc.nextInt();
					if(ans==3)
					{
						 marks = marks+10;
					}
					c1=true;
					break;

					}
				
				case 2: if(c2)
					{
						System.out.println("You have already Fnished English Exam");
						break;
					}
					else
					{
						System.out.println("Welcome to Math Examination");
						System.out.println("Solve these expression : 1+2*3/3-1 \n 1. 1 \n 2.2 \n 3.3 \n 4.4");
						System.out.println("Enter Option here:");
						ans = sc.nextInt();
						if(ans==2)
						{
							 marks = marks+10;
						}

						System.out.println("Which of following Name of great Inndian Mathematician? \n 1.Srinivas Ramanujan \n 2.A.P.J Kalam \n 3.Vikram Sarabhai \n 4.Merry curiey");
						System.out.println("Enter Option here:");
						ans = sc.nextInt();
						if(ans==1)
						{
							 marks = marks+10;
						}
					
					
					
						System.out.println(" Number 50 is divisible by  \n 1.3 \n 2.10 \n 3.13 \n 4.16");
						System.out.println("Enter Option here:");
						ans = sc.nextInt();
						if(ans==2)
						{
							 marks = marks+10;
						}	
						c2=true;
						break;

					}

				case 3: if(c3)
					{
						System.out.println("You have already Fnished GK Exam");
						break;
					}
					else
					{
					 	System.out.println("Welcome to GK Examination");
						System.out.println("Who is Prime minister of India?  \n 1.Narendra Modi \n 2.Barak Obama \n 3.Manmohan sing \n 4.Ramnath Kovind");
						System.out.println("Enter Option here:");
						ans = sc.nextInt();
						if(ans==1)
						{
							 marks = marks+10;
						}

						System.out.println("Which is Capital of India? \n 1.Kolkatta \n 2.Chennai \n 3.Mumbai \n 4.Delhi");
						System.out.println("Enter Option here:");
						ans = sc.nextInt();
						if(ans==4)
						{
							 marks = marks+10;
						}
					
					
					
						System.out.println("How many states in India? \n 1.27  \n 2.28 \n 3.29\n 4.30");
						System.out.println("Enter Option here:");
						ans = sc.nextInt();
						if(ans==2)
						{
							 marks = marks+10;
						}	
						c3=true;
						break;
					}


				default:System.out.println("You Enter wrong choice");				
					
					
					
			}
			
			if(c1 && c2 && c3){
				if(marks >= 90){
					System.out.println("Congratulation you Passed with A Grade");
				}else if(marks < 90 && marks >=80){
					System.out.println("Congratulation you Passed with B Grade");
				}else if(marks < 80 && marks >=70){
					System.out.println("Congratulation you Passed with C Grade");
				}else{
					System.out.println("We are regrate for you Please try next time");
				}
			}
			
			System.out.println("Do you want to continue(1/0)");
			int exitvalue=sc.nextInt();
			if(exitvalue==0){
				if(!(c1&&c2&&c3)){
					System.out.println("All exams are Compulsory");
					flag=true;
				}
				else{
					
					flag=false;
				}
				
			}
			else{
				flag=true;	
			}
		}while(flag);
	}
}