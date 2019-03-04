package cn.tju.scs.c01.polymorph;

class C extends A{
	public void print(){
		System.out.println("Print() C");
	}
}

public class PolyMorphDemo {
//	public static void main(String[] args) {
//		B b = new B();
//		b.print();	
//	}
	
	//向上转型
//	public static void main(String[] args) {
//		A a = new B();
//		a.print();
//	}
	
	
//	public static void main(String[] args) {
//		A a = new B();
//		B b = (B)a;
//		b.print();
//	}
	
//	public static void main(String[] args) {
//		A a = new A();
//		B b = (B)a;
//		b.print();
//	}
	
//	public static void main(String[] args) {
//		A a = new B();
//		System.out.println(a instanceof A);
//		System.out.println(a instanceof B);
////		System.out.println(null instanceof A);
//	}
	
	
	//向上转型可以实现参数统一，还可以调用子类覆写后的方法体，即同一个方法针对于不同的子类有不同的实现
//	public static void main(String[] args) {
//		A a1 = new B();
//		A a2 = new C();
//		a1.print();
//		a2.print();
//		
//	}
	
	public static void main(String[] args) {
		A a = new B();
//		a.funB(); 
		B b = (B)a;
		b.funB();
		
//		new B().funB();
		
		
	}
	
//	public static void main(String[] args) {
//		fun(new C());
//	}
//	
//	public static void fun(A b) {
//		b.print();
//	}
	
//	public static void main(String[] args) {
//		A a = new B();
//		if (a instanceof B) {
//			B b = (B)a;
//			b.print();
//		}
//		
//	}


}
