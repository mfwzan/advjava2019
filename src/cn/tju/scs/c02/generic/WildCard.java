package cn.tju.scs.c02.generic;

public class WildCard<T> {
	private T foo;
	
	public T getFoo() {
		return foo;
	}

	public void setFoo(T foo) {
		this.foo = foo;
	}
	
	public static void main(String[] args) {
		WildCard<?> ge = new WildCard<String>();
//		ge.setFoo();
		
		
		WildCard<String> ge2 = new WildCard<String>();
		ge2.setFoo("Hello world");
		
		ge = ge2;
		
		System.out.println(ge.getFoo());
	
		
		
	}


}
