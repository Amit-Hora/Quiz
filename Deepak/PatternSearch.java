package com.test.practice;
import java.util.*;
public class PatternSearch {
private TreeMap <Character,ArrayList<String>> tm;
public PatternSearch()
{
	tm = new TreeMap();
}
public void add(char c,String s)
{
	//System.out.println(c);
	ArrayList<String> ll ;
	if(tm.isEmpty())
	{
		ll = new ArrayList();
		ll.add(s);
		tm.put(c,ll );
	}
	else if(tm.containsKey(c))
	{
		ll = tm.get(c);
		ll.add(s);
		tm.put(c, (ArrayList<String>) ll);
	}
	else
	{
		ll = new ArrayList();
		ll.add(s);
		tm.put(c, (ArrayList<String>) ll);
	}
	
}

public void find(char c,String pat)
{
	int matchCnt=0;
	if(this.tm.containsKey(c))
	{
		List ll = this.tm.get(c);
		Iterator itr  = ll.iterator();
		while(itr.hasNext())
		{
			String str = (String) itr.next();
			if(str.startsWith(pat))
			{
				matchCnt++;
			}
		}
	}
	System.out.println(matchCnt);
}
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
    int cnt = Integer.parseInt(sc.nextLine());
    PatternSearch ps = new PatternSearch();
    while(cnt > 0)
    {
    	String[] token = sc.nextLine().split(" ");
    	switch(token[0]){
    	case "add" :
    		//System.out.println(token[1]+" "+token[1].charAt(0));
    		ps.add(token[1].charAt(0), token[1]);
            break;
    	case "find" :
    		ps.find(token[1].charAt(0),token[1]);
    		break;
    	default :
    		break;
    	}
    	cnt--;
    	
    }
}
}
