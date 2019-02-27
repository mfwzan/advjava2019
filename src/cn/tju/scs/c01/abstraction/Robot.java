package cn.tju.scs.c01.abstraction;

public class Robot extends Action {

	@Override
	public void eat() {
		System.out.println("机器人在补充能量！");
	}

	@Override
	public void sleep() {
	}

	@Override
	public void work() {
		System.out.println("机器人在工作");
	}

}
