package com.codefriend.quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Contacts {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int n=Integer.parseInt(scanner.nextLine());
		Map<Character,ArrayList<String>> charToContacts=new HashMap<>();
		
		for(int i=0;i<n;i++){
			String[] inputs=scanner.nextLine().split(" ");
			switch(inputs[0]){
			case "add":{
				Optional<ArrayList<String>> contactsStartingOptional = Optional.ofNullable(charToContacts.get(inputs[1].charAt(0)));
				if(contactsStartingOptional.isPresent()){
					contactsStartingOptional.get().add(inputs[1]);
				}
				else{
					ArrayList<String> contactsStarting=new ArrayList<>();
					contactsStarting.add(inputs[1]);
					charToContacts.put(inputs[1].charAt(0), contactsStarting);
					
				}
				break;
			}
			case "find":{
				
				final AtomicInteger indexHolder = new AtomicInteger(0);
				Optional<ArrayList<String>> contactsStartingOptional = Optional.ofNullable(charToContacts.get(inputs[1].charAt(0)));
				if(contactsStartingOptional.isPresent()){
					ArrayList<String> contactsStarting=contactsStartingOptional.get();
					contactsStarting.forEach(x->{
	                    if(x.startsWith(inputs[1]))
	                    {
	                    	final int index = indexHolder.getAndIncrement();
	                    }

					});
				}
				
					System.out.println(indexHolder);
				
				
				break;
			}
			}
		}
	}
	
}
