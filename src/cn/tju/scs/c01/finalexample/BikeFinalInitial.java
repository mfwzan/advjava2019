package cn.tju.scs.c01.finalexample;

public class BikeFinalInitial {
	final int speedlimit; // blank final variable
	
	public BikeFinalInitial() {
		speedlimit = 100;
		System.out.println(speedlimit);
	}
	
//	public void setSpeedlimit() {
//		speedlimit = 400;
//	}
	

	public static void main(String[] args) {
		BikeFinalInitial bfi = new BikeFinalInitial();
//		bfi.speedlimit = 200;
		
		

	}

}
