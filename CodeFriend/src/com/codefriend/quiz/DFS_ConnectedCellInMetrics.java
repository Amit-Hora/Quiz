package com.codefriend.quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class DFS_ConnectedCellInMetrics {
	private Stack<Vertex> verticesStack;
	private TreeSet<Integer> counterSet;
	public DFS_ConnectedCellInMetrics() {
		this.verticesStack=new Stack<>();
	}
	public void dgs(List<Vertex> vertexList){
		for(Vertex v:vertexList){
			
			if(!v.isVisited()){
				v.setVisited(true);
				dfsWithStack(v);
			}
			
		}
	}
	
	
	private void dfsWithStack(Vertex rootv) {
		this.verticesStack.add(rootv);
		int count=0;
		while(!this.verticesStack.isEmpty()){
			count++;
			Vertex actualVertex=this.verticesStack.pop();
//			System.out.println(actualVertex+"  ");
			
			for(Vertex v:actualVertex.getNeighList()){
				
				if(!v.isVisited()){
					
					v.setVisited(true);
					this.verticesStack.push(v);
				}
				
			}
			
			
		}
//		System.out.println(count);
		this.counterSet.add(count);
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
  List<Vertex> vList=new ArrayList<Vertex>();
		int n = Integer.parseInt(scan.nextLine());
		int m = Integer.parseInt(scan.nextLine());
		int metrix[][] = new int[n][m];
		Map<String,Vertex> indexToVertex=new HashMap<>(); 
		for (int i = 0; i < n; i++) {
			String mvalues[] = scan.nextLine().split(" ");
			for (int j = 0; j < mvalues.length; j++) {

				metrix[i][j] = Integer.parseInt(mvalues[j]);
				if(metrix[i][j]==1){
					Vertex v=new Vertex(""+metrix[i][j]);
				indexToVertex.put(i+"_"+j,v);
				vList.add(v);
				}
		
			}
		}
		
		for(String key:indexToVertex.keySet()){
			Vertex v=indexToVertex.get(key);
			String[] keyValues=key.split("_");
			int i=Integer.parseInt(keyValues[0]);
			int j=Integer.parseInt(keyValues[1]);
			
			if(indexToVertex.containsKey((i-1)+"_"+(j-1))){
				// add this vertex to its neighbor 
				Vertex vn=indexToVertex.get((i-1)+"_"+(j-1));
				// check if this vn vertex neighbor has already the current vertex in its neighbor list
				// else add
				
				if(!vn.getNeighList().contains(i+"_"+j)){
					v.getNeighList().add(vn);
				}
			}
			
			
			if(indexToVertex.containsKey((i-1)+"_"+(j))){
				// add this vertex to its neighbor 
				Vertex vn=indexToVertex.get((i-1)+"_"+(j));
				// check if this vn vertex neighbor has already the current vertex in its neighbor list
				// else add
				
				if(!vn.getNeighList().contains(i+"_"+j)){
					v.getNeighList().add(vn);
				}
			}
			
			if(indexToVertex.containsKey((i-1)+"_"+(j+1))){
				// add this vertex to its neighbor 
				Vertex vn=indexToVertex.get((i-1)+"_"+(j+1));
				// check if this vn vertex neighbor has already the current vertex in its neighbor list
				// else add
				
				if(!vn.getNeighList().contains(i+"_"+j)){
					v.getNeighList().add(vn);
				}
			}
			
			if(indexToVertex.containsKey((i)+"_"+(j-1))){
				// add this vertex to its neighbor 
				Vertex vn=indexToVertex.get((i)+"_"+(j-1));
				// check if this vn vertex neighbor has already the current vertex in its neighbor list
				// else add
				
				if(!vn.getNeighList().contains(i+"_"+j)){
					v.getNeighList().add(vn);
				}
			}
			
			
			if(indexToVertex.containsKey((i)+"_"+(j+1))){
				// add this vertex to its neighbor 
				Vertex vn=indexToVertex.get((i)+"_"+(j+1));
				// check if this vn vertex neighbor has already the current vertex in its neighbor list
				// else add
				
				if(!vn.getNeighList().contains(i+"_"+j)){
					v.getNeighList().add(vn);
				}
			}
			
			
			if(indexToVertex.containsKey((i+1)+"_"+(j-1))){
				// add this vertex to its neighbor 
				Vertex vn=indexToVertex.get((i+1)+"_"+(j-1));
				// check if this vn vertex neighbor has already the current vertex in its neighbor list
				// else add
				
				if(!vn.getNeighList().contains(i+"_"+j)){
					v.getNeighList().add(vn);
				}
			}
			
			if(indexToVertex.containsKey((i+1)+"_"+(j))){
				// add this vertex to its neighbor 
				Vertex vn=indexToVertex.get((i+1)+"_"+(j));
				// check if this vn vertex neighbor has already the current vertex in its neighbor list
				// else add
				
				if(!vn.getNeighList().contains(i+"_"+j)){
					v.getNeighList().add(vn);
				}
			}
			
			if(indexToVertex.containsKey((i+1)+"_"+(j+1))){
				// add this vertex to its neighbor 
				Vertex vn=indexToVertex.get((i+1)+"_"+(j+1));
				// check if this vn vertex neighbor has already the current vertex in its neighbor list
				// else add
				
				if(!vn.getNeighList().contains(i+"_"+j)){
					v.getNeighList().add(vn);
				}
			}
			
			
		}
/*		vList.addAll(indexToVertex.values());
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				Vertex v1=indexToVertex.get(i+""+j);
				vList.add(v1);
				if(i-1>=0 && j-1>=0 ){
					if(metrix[i-1][j-1]==1){
						
					if(!v1.getNeighList().contains((i-1)+""+(j-1)))
					v1.addNeighbour(indexToVertex.get((i-1)+""+(j-1)));			
					}
				}
				
				if(i-1>=0){
					
					if(metrix[i-1][j]==1){
					if(!v1.getNeighList().contains((i-1)+""+(j)))
					v1.addNeighbour(indexToVertex.get((i-1)+""+j));
					}
				}
				if(i-1>=0 && j+1<m){
					
					if(metrix[i-1][j+1]==1){
					
					if(!v1.getNeighList().contains((i-1)+""+(j+1)))
					v1.addNeighbour(indexToVertex.get((i-1)+""+(j+1)));
					}
				}
				
				if(j-1>=0){
					
					if(metrix[][]==1){
					
					if(!v1.getNeighList().contains((i)+""+(j-1)))
					v1.addNeighbour(indexToVertex.get(i+""+(j-1)));
					}
				}
				
				if(j+1<m){
					if(!v1.getNeighList().contains((i)+""+(j+1)))
					v1.addNeighbour(indexToVertex.get(i+""+(j+1)));
				}
				
				if(i+1<n && j-1>=0){
					if(!v1.getNeighList().contains((i+1)+""+(j-1)))
					v1.addNeighbour( indexToVertex.get((i+1)+""+(j-1)));
				}
				
				if(i+1<n){
					if(!v1.getNeighList().contains((i+1)+""+(j)))
					v1.addNeighbour(indexToVertex.get((i+1)+""+j));
				}
				if(i+1<n && j+1<m){
					if(!v1.getNeighList().contains((i+1)+""+(j+1)))
					v1.addNeighbour(indexToVertex.get((i+1)+""+(j+1)));
				}
				
			}
		}*/
		
		

		
		DFS_ConnectedCellInMetrics dFSMetrics=new DFS_ConnectedCellInMetrics();
		dFSMetrics.counterSet=new TreeSet<>();
		dFSMetrics.dgs(vList);
		System.out.println(dFSMetrics.counterSet.last());
		
	}
}


class Vertex{
	
	private String name;
	private boolean visited;
	
	private List<Vertex> neighList;
	
	public Vertex(String name) {
		this.name=name;
		this.neighList=new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getNeighList() {
		return neighList;
	}

	public void setNeighList(List<Vertex> neighList) {
		this.neighList = neighList;
	}
	
	public void addNeighbour(Vertex v){
		this.neighList.add(v);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
}