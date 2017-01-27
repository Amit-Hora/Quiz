package com.codefriend.quiz;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
	public static void main(String[] args) {
			
		
		Queue<Integer> queue=new LinkedList<>();
		
		queue.add(2);
		queue.add(3);
		queue.add(1);
		
		queue.poll();
		
		System.out.println("Linked Linked List peek "+queue.peek());//2
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		PriorityQueue<Integer> pqr=new PriorityQueue<>(Comparator.reverseOrder());// colelctions.reverseOrder()
		
		pq.add(2);
		pq.add(3);
		pq.add(1);
		
		//1 ,2 ,3
		
		pqr.add(1);
		pqr.add(3);
		pqr.add(2);
		
		pq.forEach(System.out::println);// 1,2,3
		
		System.out.println("*************************");
		
		pqr.forEach(System.out::println);// 3,2,1
		
		System.out.println("Peek of Normal "+pq.peek());//3
		
		
		pq.poll();
		
		System.out.println("Peek of Normal after poll "+pq.peek());//2
		
		System.out.println("Peek of Reverse "+pqr.peek());//1
		pqr.poll();
		
		System.out.println("Peek of Reverse after Poll "+pqr.peek());//2
		
	}
}
