package com.codefriend.quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Strings_MakingAnagrams {

 public static int numberNeeded(String first, String second) {
	 int firstLength=first.length();
	 int secondLength=second.length();
	 long matchcount=0;
	 StringBuilder myComparator = null;
	String toCompare="",toIterate="";
	 if(firstLength>secondLength){
		 toIterate=second;
		 toCompare=first;
		 
	 }else{
		 toIterate=first;
		 toCompare=second;
		 
	 }
	 myComparator=new StringBuilder(toCompare);
//	 System.out.println("length of first String "+ firstLength);
//	 System.out.println("length of second string "+ secondLength);
	 int count=0;
	 for(char element:toIterate.toCharArray()){
		 
		 int index=myComparator.toString().indexOf(element);
		 if(index!=-1){
//			 System.out.println("Common char " + element);
			 
			 myComparator.deleteCharAt(index);
			 count++;
		 }
	 }
	 
	 return ((firstLength-count)+(secondLength-count));
	 
  }

  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String a = in.next();
      String b = in.next();
      System.out.println(numberNeeded(a, b));
  }
  
}
