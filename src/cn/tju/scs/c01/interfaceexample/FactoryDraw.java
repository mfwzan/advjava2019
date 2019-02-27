package cn.tju.scs.c01.interfaceexample;

public class FactoryDraw {
	public static Drawable5 getInstance(String drawName) {
		if ("rectangle".equals(drawName)) {
			return new Rectangle5();
		}else if ("circle".equals(drawName)) {
			return new Circle5();
		}else {
			return null;
		}
	} 

}
