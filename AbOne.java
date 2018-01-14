abstract class AbOne{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	void m4(){System.out.println("m4 method from AbOne parent class");}
}

class Child extends AbOne{
	void m1(){System.out.println("m1 method from child class");}
	void m2(){System.out.println("m2 method from child class");}
	void m3(){System.out.println("m3 method from child class");}
	
	public static void main(String [] argv){
		AbOne a1 = new Child();
		a1.m1(); // compile : AbOne 	runtime : Child
		a1.m2(); // compile : AbOne 	runtime : Child
		a1.m3(); // compile : AbOne 	runtime : Child
		a1.m4(); // compile : AbOne 	runtime : Child
	}
}