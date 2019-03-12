package cn.tju.scs.c02.generic;

class Message2<T>{
	private T msg;
	public void setMsg(T msg) {
		this.msg = msg;
	}
	
	public T getMsg() {
		return msg;
	}
}

public class WildCard {

//	public static void main(String[] args) {
//		Message<String> m = new Message<>();
//		m.setMsg("Hello World!");
//		fun(m);
//	}
//	
//	public static void fun(Message<String> temp) {
//		System.out.println(temp.getMsg());
//	}
	
//	public static void fun(Message<Integer> temp) {
//		System.out.println(temp.getMsg());
//	}
	
	public static void main(String[] args) {
		Message<Integer> m1 = new Message<Integer>();
	}
	

}
