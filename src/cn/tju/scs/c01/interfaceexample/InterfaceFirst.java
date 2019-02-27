package cn.tju.scs.c01.interfaceexample;

interface A {
	public abstract void print(); 
}

interface B{
	public abstract void get();
}

class X implements A, B{

	@Override
	public void get() {
		System.out.println("Print B");
	}

	@Override
	public void print() {
		System.out.println("Get A");
		
	}
	
}

public class InterfaceFirst {

//	public static void main(String[] args) {
//		X x = new X();
//		A a = x;
//		B b = x;
//		a.print();
//		b.get();
//	}
	
	public static void main(String[] args) {
		A a = new X();
		B b = (B)a;
		b.get();
	}

}
