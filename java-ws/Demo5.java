import java.util.Scanner;

class Dev {
	int id, age, salary=60000;
	String name, design="Developer";

	Dev() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Id: ");
		id = sc.nextInt();
			
		System.out.print("Enter Name: ");
		name = sc.next();
		
		System.out.print("Enter Age: ");
		age = sc.nextInt();

		sc.close();
	}
	
	void display(){
		System.out.println("-----DETAILS-----");
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
		System.out.println("Designation: "+design);
		
	}
}

class Clerk {
	int id, age, salary=50000;
	String name, design="Clerk";

	Clerk() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Id: ");
		id = sc.nextInt();
			
		System.out.print("Enter Name: ");
		name = sc.next();
		
		System.out.print("Enter Age: ");
		age = sc.nextInt();

		sc.close();
	}
	
	void display(){
		System.out.println("-----DETAILS-----");
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
		System.out.println("Designation: "+design);
		
	}
}

class Demo5 {
	public static void main(String args[]) {
		int choice=0;
		Scanner sc = new Scanner(System.in);		
		
		do {
			System.out.println("Enter the choice: ");
			
			System.out.println("1. Developer");
			System.out.println("2. Clerk");
			System.out.println("3. Exit");
			
			choice = sc.nextInt();
			
			if(choice == 1) {
				Dev d1 = new Dev();
				d1.display();					
			} else if(choice == 2) {
				Clerk c1 = new Clerk();
				c1.display();
			} else if(choice == 3) {
				System.exit(0);
			}
		} while(choice != 3);

		sc.close();
	
	}

}
