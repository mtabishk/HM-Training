import java.util.Scanner;

class A {
	A() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter id: ");
		int id = sc.nextInt();
		
		System.out.print("Enter name: ");
		String name = sc.next();
		
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		
		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();
		
		System.out.print("Enter designation: ");
		String degn = sc.next();
		
		
		System.out.println("\n----Your Details---- \n");
		
		System.out.println("Your id is : " + id);
		System.out.println("Your name is : " + name);
		System.out.println("Your age is : " + age);
		System.out.println("Your salary is : " + salary);
		System.out.println("Your degn is : " + degn);

		sc.close();

	}
}
class Demo2 {
	public static void main(String args[]) {
		System.out.println("Hello Java from Demo2 Class!");
		A a = new A();
		
	}

}
