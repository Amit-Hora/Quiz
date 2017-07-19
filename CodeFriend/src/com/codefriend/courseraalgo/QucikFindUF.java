package com.codefriend.courseraalgo;

import java.util.Scanner;

public class QucikFindUF {

	private int[] id;
	
	public QucikFindUF(int N){
		
		id = new int[N];
		// N is the biggest value 
		for(int i=0;i<N;i++){
			id[i]=i;
		}
		
	}
	
	public boolean connected(int p ,int q){
		return (id[p] == id[q]);
	}
	
	public void uniion(int p,int q){
		
		int pid=id[p];
		int qid=id[q];
		for(int i=0;i<id.length;i++){
			if(id[i] ==  pid){
				id[i]=qid;
			}
		}
	
				
	}
	

	public static void main(String args[]){
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the biggest element");
		int N=scanner.nextInt();
		QucikFindUF quickFindUF=new QucikFindUF(N);
		System.out.println(" Enter U to form union and F to find and Q to quit");
		char choice=scanner.next().charAt(0);
		while(choice!='Q'){
			
			switch (choice){
			
			case 'U' :{
				System.out.println(" Enter the pth element");
				int p=scanner.nextInt();
				System.out.println("Enter the qth element");
				int q=scanner.nextInt();
				quickFindUF.uniion(p, q);
				System.out.println("Joined");
				break;
			}
			case 'F' :{
				System.out.println(" Enter the pth element");
				int p=scanner.nextInt();
				System.out.println("Enter the qth element");
				int q=scanner.nextInt();
				System.out.println(quickFindUF.connected(p, q));
			}
			
			}
			System.out.println(" Enter U to form union and F to find and Q to quit");
			choice=scanner.next().charAt(0);
			
		}
		
		
		
		
		
		
		
	}
}
