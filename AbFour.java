abstract class AbFour{
	AbFour(){
		System.out.println("It is a constructor created in an abstract class");
	}
	abstract void m1();
}

class TistOne extends AbFour{
	
	void m1(){
		System.out.println("m1 method is overriden through TistOne");
	}
	
	TistOne(){
		super();
		System.out.println("TistOne is a constructor from TistOne class");
	}
	
	public static void main(String[] argv){
		TistOne t = new TistOne();
		t.m1();
	}
}

/* It is possible to declare a constructor in an abstract class */