package com.codefriend.designpatterns;

public class BillPughSingleTon {

	private BillPughSingleTon(){
		
	}
	private static class  innerBillPughSingleton{
			private static final BillPughSingleTon instance=new BillPughSingleTon();
	}
	
	public static BillPughSingleTon getInstance(){
		return innerBillPughSingleton.instance;
	}
	
}
