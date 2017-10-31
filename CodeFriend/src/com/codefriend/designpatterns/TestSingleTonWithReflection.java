package com.codefriend.designpatterns;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestSingleTonWithReflection {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		SingleTon s1=SingleTon.getInstance();
		Object s2=null;
		for (Constructor<?> c:SingleTon.class.getDeclaredConstructors()){
				c.setAccessible(true);
				s2=c.newInstance();
		}
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
