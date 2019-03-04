package cn.tju.scs.c01.finalexample;

public class BikeFinalVar {
	final int speedlimit = 90; // final variable
	void run(){
//		speedlimit = 200;
	}

	public static void main(String[] args) {
		BikeFinalVar bike = new BikeFinalVar();
		System.out.println(bike.speedlimit);
		

	}

}
