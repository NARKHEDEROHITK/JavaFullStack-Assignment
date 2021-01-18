import java.util.Scanner;
class Student{
	int[] marks = new int[4];
	int total,id,age;
	double avg;
	String name;
	Scanner sc = new Scanner(System.in);
	void read(){
		System.out.println("Enter student record");
		System.out.println("Enter student ID");
		id = sc.nextInt();
		System.out.println("Enter student name");
		name = sc.next();
		System.out.println("Enter student Age");
		age = sc.nextInt();
		System.out.println("Enter student marks math,physics,chemistry,biology out of 100");
		for(int i=0;i<marks.length;i++){
			marks[i]=sc.nextInt();
			total=total+marks[i];
		}
		
	}
	void grade(){
		avg = total/marks.length;
		if(avg > 90){
			System.out.println("Grade = A+");
		}else if(avg > 80){
			System.out.println("Grade = A");
		}else if(avg > 70){
			System.out.println("Grade = B");
		}else if(avg > 55){
			System.out.println("Grade = C");
		}else{
			System.out.println("Grade = D");
		}
	}
	void display(){
		System.out.println("Student Id = "+id);
		System.out.println("Student Name = "+name);
		System.out.println("Student age = "+age);
	}
}
class StudentTest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no Students=");
		int n = sc.nextInt();
		Student std[] = new Student[n];
		for(int i=0;i<n;i++){
			std[i] = new Student();
			std[i].read();
			 
		}
		for(int i=0;i<n;i++){
			std[i].display();
			std[i].grade();
			 
		}
		
	}
}