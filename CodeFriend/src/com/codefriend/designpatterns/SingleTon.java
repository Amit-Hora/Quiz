package com.codefriend.designpatterns;

public class SingleTon {

	private static SingleTon singleTonObj;
	private SingleTon(){
			if(SingleTon.singleTonObj!=null){
			     throw new RuntimeException("Can't instantiate singleton twice");
			}
	}
	
	public synchronized static SingleTon getInstance(){
		if(singleTonObj==null){
			singleTonObj=new SingleTon();
		}
		return singleTonObj;
	}
	
	
}
