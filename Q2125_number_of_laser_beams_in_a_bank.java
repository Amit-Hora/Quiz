package leetcode.easy;

public class Q2125_number_of_laser_beams_in_a_bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Solution {
	    public int numberOfBeams(String[] bank) {
	        
	        int prev=-1;
	        int curr=-1;
	        int j=0;
	         int prod=0;
	        for(String st:bank){
	           
	            int sum=0;
	            for(char ch:st.toCharArray()){
	                sum+=Integer.parseInt(ch+"");
	               
	            }
	             if(sum!=0){
	                    // stnums.add(sum);
	                 if(prev==-1){
	                     prev=sum;
	                 }
	                 else{
	                     curr=sum;
	                 }
	                 
	                 if(prev!=-1 && curr!=-1){
	                     prod+=prev*curr;
	                     prev=curr;
	                     curr=-1;
	                 }
	                   
	                }
	              
	        }
	        
	      
	        
	        
	        return prod;
	    }
	}
}
