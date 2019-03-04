package cn.tju.scs.c01.exception;

public class ExceptionDemo {

//	public static void main(String[] args) {
//		System.out.println("1. Division start...");
//		System.out.println("2. Division:" + (10/2));
//		System.out.println("3. Division End");
//
//	}
	
	public static void main(String[] args) {
		System.out.println("1. Division start...");
		try {
			System.out.println("2. Division:" + (10/0));
		} catch (ArithmeticException e) {
//			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("3. Division End");
		
	}

}
