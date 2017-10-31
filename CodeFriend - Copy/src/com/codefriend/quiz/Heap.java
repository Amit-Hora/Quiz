package com.codefriend.quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Heap {
    private Queue<Integer> low = new PriorityQueue<>(Comparator.reverseOrder());
    private Queue<Integer> high = new PriorityQueue<>();

    public void add(int number) {
        Queue<Integer> target = low.size() <= high.size() ? low : high;
        target.add(number);
        balance();
    }

    private void balance() {
        while(!low.isEmpty() && !high.isEmpty() && low.peek() > high.peek()) {
            Integer lowHead= low.poll();
            Integer highHead = high.poll();
            low.add(highHead);
            high.add(lowHead);
        }
    }

    public double median() {
        if(low.isEmpty() && high.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        } else {
            return low.size() == high.size() ? (low.peek() + high.peek()) / 2.0 : low.peek();
        }
    }
    public static void main(String[] args) {
    	Heap heap=new Heap();
		Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     
	     for(int i=0;i<n;i++){
	    	 heap.add(sc.nextInt());
	    	 System.out.println(heap.median());
	    	 
	     }
	
	}
}