package com.codefriend.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UnderstandingRemoveIf {

	static Predicate<Transaction> checkTransactionAmount = new Predicate<Transaction>() {

		@Override
		public boolean test(Transaction transaction) {
			return Math.round(transaction.amount) < 200000;
		}
		
	};
	
	static Predicate<Transaction> isTransactionOnline = new Predicate<Transaction>() {

		@Override
		public boolean test(Transaction transaction) {
			return transaction.transactionMethod!='O';
		}
	};

	public static void main(String[] args) {

		List<Transaction> transactions = new ArrayList<>();
		Transaction transaction1=new Transaction(10000.8d, 'C');
		Transaction transaction2=new Transaction(150000d, 'O');
		Transaction transaction3=new Transaction(300000d, 'O');
		transactions.add(transaction1);
		transactions.add(transaction2);
		transactions.add(transaction3);
		
		// Get all transactions that are done online of more then 2 lakh
		transactions.removeIf(checkTransactionAmount.or(isTransactionOnline));
		System.out.println(transactions);
	}

}

class Transaction{
	
	double amount;
	char   transactionMethod; // O for online 
	public Transaction(double amount,char transactionMethod) {
		this.amount=amount;
		this.transactionMethod=transactionMethod;
	}
	
	@Override
	public String toString() {
		return amount+","+transactionMethod;
	}
}
