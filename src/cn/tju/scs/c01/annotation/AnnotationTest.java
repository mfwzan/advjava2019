package cn.tju.scs.c01.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

public @interface AnnotationTest {
	String value();
	EnumTest value2();
}

enum EnumTest{
	Hello, World, Welcome;
}
