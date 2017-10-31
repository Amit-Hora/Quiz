package com.codefriend.hackerrank.graph;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * https://www.hackerrank.com/challenges/torque-and-development The Ruler of
 * HackerLand believes that every citizen of the country should have access to a
 * library. Unfortunately, HackerLand was hit by a tornado that destroyed all of
 * its libraries and obstructed its roads! As you are the greatest programmer of
 * HackerLand, the ruler wants your help to repair the roads and build some new
 * libraries efficiently.
 * 
 * HackerLand has cities numbered from to . The cities are connected by
 * bidirectional roads. A citizen has access to a library if:
 * 
 * Their city contains a library. They can travel by road from their city to a
 * city containing a library. The following figure is a sample map of HackerLand
 * where the dotted lines denote obstructed roads:
 * 
 * image
 * 
 * The cost of repairing any road is dollars, and the cost to build a library in
 * any city is dollars.
 * 
 * You are given queries, where each query consists of a map of HackerLand and
 * value of and .
 * 
 * For each query, find the minimum cost of making libraries accessible to all
 * the citizens and print it on a new line.
 * 
 * Input Format
 * 
 * The first line contains a single integer, , denoting the number of queries.
 * The subsequent lines describe each query in the following format:
 * 
 * The first line contains four space-separated integers describing the
 * respective values of (the number of cities), (the number of roads), (the cost
 * to build a library), and (the cost to repair a road). Each line of the
 * subsequent lines contains two space-separated integers, and , describing a
 * bidirectional road connecting cities and . Constraints
 * 
 * Each road connects two distinct cities. Output Format
 * 
 * For each query, print an integer denoting the minimum cost of making
 * libraries accessible to all the citizens on a new line.
 * 
 * Sample Input
 * 
 * 2 3 3 2 1 1 2 3 1 2 3 6 6 2 5 1 3 3 4 2 4 1 2 2 3 5 6 Sample Output
 * 
 * 4 12 Explanation
 * 
 * We perform the following queries:
 * 
 * HackerLand contains cities connected by bidirectional roads. The price of
 * building a library is and the price for repairing a road is . image The
 * cheapest way to make libraries accessible to all is to:
 * 
 * Build a library in city at a cost of . Repair the road between cities and at
 * a cost of . Repair the road between cities and at a cost of . This gives us a
 * total cost of . Note that we don't need to repair the road between cities and
 * because we repaired the roads connecting them to city !
 * 
 * In this scenario it's optimal to build a library in each city because the
 * cost of building a library () is less than the cost of repairing a road ().
 * image
 * 
 * There are cities, so the total cost is .
 * 
 * @author AHora2
 *
 */
public class Hackerland {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			int n = in.nextInt();
			Graph g = new Graph(n, false);
			int m = in.nextInt();
			long clib = in.nextInt();
			long croad = in.nextInt();
			for (int a1 = 0; a1 < m; a1++) {
				int city_1 = in.nextInt();
				int city_2 = in.nextInt();
				g.insertEdge(city_1 - 1, city_2 - 1);// starting at 0
			}
			System.out.println(getCost(g, clib, croad));
		}
	}

	private static long getCost(Graph g, long clib, long croad) {
		if (clib < croad) {
			return clib * g.v;
		}
		boolean visited[] = new boolean[g.v];
		long cost = 0;
		for (int i = 0; i < g.v; i++) {
			if (!visited[i]) {
				int x = DFSUtil(g, visited, i);
				cost += (x - 1) * croad;
				cost += clib;
			}
		}
		return cost;
	}

	private static int DFSUtil(Graph g, boolean visited[], int current) {
		int count = 1;
		visited[current] = true;
		for (int a : g.list[current]) {
			if (!visited[a]) {
				count += DFSUtil(g, visited, a);
			}
		}
		return count;
	}
}

class Graph {
	int v;
	LinkedList<Integer> list[];
	private final boolean directed;

	/**
	 * Constructor of Graph, takes no. of vertex and boolean value to specify
	 * whether graph is directed or not
	 */
	Graph(int v, boolean directed) {
		this.v = v;
		this.directed = directed;
		list = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			list[i] = new LinkedList<Integer>();
		}
	}

	/*
	 * vertex numbering start with 0 as well as adjacency list no. start with 0
	 */

	public void insertEdge(int a, int b) {
		list[a].add(b);
		if (!directed) {
			list[b].add(a);
		}
	}

}
