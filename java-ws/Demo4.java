class X {

	X() {
		System.out.println("Hello from Constructor X!");
	}	
	void X(){	
		System.out.println("Hello from X Method!");
	}
}

class Demo4 {
	public static void main(String args[]) {
		X x1 = new X();
		x1.X();
	}
}
