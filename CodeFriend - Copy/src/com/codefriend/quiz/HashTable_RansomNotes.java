package com.codefriend.quiz;

import java.util.Hashtable;
import java.util.Scanner;

public class HashTable_RansomNotes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] values = in.nextLine().split(" ");
		int m = Integer.parseInt(values[0]);
		int n = Integer.parseInt(values[1]);

		String ransom[] = new String[2];
		Hashtable<String, Integer> magzineTable = new Hashtable<>();

//		Hashtable<String, String> noteTable = new Hashtable<>();

		for (int ransom_i = 0; ransom_i < 2; ransom_i++) {
			ransom[ransom_i] = in.nextLine();
			// System.out.println(ransom_i);
		}

		for (String magZineWord : ransom[0].split(" ")) {
			if (magzineTable.containsKey(magZineWord)) {
				int counter=magzineTable.get(magZineWord);
				magzineTable.put(magZineWord, counter+1);
			} else {
				magzineTable.put(magZineWord, 1);
			}
		}
		int count = 0;
		for (String ransomWord : ransom[1].split(" ")) {
			if (magzineTable.containsKey(ransomWord) &&  magzineTable.get(ransomWord)>0) {
				count++;
				int counter=magzineTable.get(ransomWord);
				magzineTable.put(ransomWord, counter-1);
			}
			// noteTable.put(ransomWord,null);
		}


		if (count == n) {
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}

	}
}
