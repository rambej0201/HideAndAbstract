abstract class AbTwo{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	abstract void m4();
}
	//lets assume developer1 knows only m1 method' implementation
abstract class TestOne extends AbTwo{
	void m1(){System.out.println("m1 method from test1 abstract class");}
}
	//lets assume developer2 knows only m2 method' implementation
abstract class TestTwo extends TestOne{
	void m2(){System.out.println("m2 method from test2 abstract class");}
}
	//lets assume developer3 knows only m3 method' implementation
abstract class TestThree extends TestTwo{
	void m3(){System.out.println("m3 method from test3 abstract class");}
}
	//lets assume developer4 knows only m4 method' implementation
class TestFour extends TestThree{
	void m4(){System.out.println("m4 method from test4 abstract class");}
	public static void main(String[] argv){
		TestFour t = new TestFour();
		t.m1();
		t.m2();
		t.m3();
		t.m4();
	}
	
}

/* It is possble to declare any number of child classes based on number of method implementations are required. At last one method among all 
implementations do not use abstract modifier as we should to declare object and no need of extending to next child class as we have all
method implementations declared
*/