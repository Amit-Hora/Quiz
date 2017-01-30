package com.wordsearch.Contacts;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Search {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    values data = new values();
    int n = in.nextInt();
    for(int a0 = 0; a0 < n; a0++){
      String op = in.next();
      String contact = in.next();
      if ("add".equals(op)) {
        add(contact,data);
      } else if("find".equals(op)) {
        int count = find(contact, data);
        System.out.printf(count +"\n");
      }
    }
  }
  

  private static class values {
    int count;
    Map<Character, values> words;

    public values() {
      count = 0;
      words = new HashMap<Character,values>();
    }

    public void incrementCount() {
      count++;
    }

    public int getcount() {
      return count;
    }

    public Map<Character,values> getwords() {
      return words;
    }
  }
  
  public static void add(String tobeadded, values data) {
	    if (tobeadded == null || tobeadded.length() == 0) {
	      return;
	    }

	    Character nextChar = tobeadded.charAt(0);
	 
	    String remainingString = tobeadded.substring(1);
	   
	    if(data.getwords().get(nextChar) == null) {
	      data.getwords().put(nextChar, new values());
	    }

	 
	    data.getwords().get(nextChar).incrementCount();

	    add(remainingString, data.getwords().get(nextChar));
	  }

	  public static int find(String tobefound, values data) {

	    if (tobefound == null || tobefound.length() == 0) {
	      return data.getcount();
	    }

	    Character nextChar = tobefound.charAt(0); 
	    String remainingString = tobefound.substring(1);
	    
	    if(data.getwords().get(nextChar) == null) {
	      return 0;
	    }
	    return find(remainingString, data.getwords().get(nextChar));
	  }
}