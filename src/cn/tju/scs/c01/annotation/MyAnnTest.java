package cn.tju.scs.c01.annotation;

@MyAnnotation(hello = "TJU",world="SCS")
public class MyAnnTest {
	@MyAnnotation(hello = "TJUMethod",world="SCSMethod")
	public void output(){
		System.out.println("Test");
	}

}
