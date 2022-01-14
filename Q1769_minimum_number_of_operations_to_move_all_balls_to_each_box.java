package leetcode.easy;

public class Q1769_minimum_number_of_operations_to_move_all_balls_to_each_box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class Solution {
	    public int[] minOperations(String boxes1) {
	        char[] boxes = boxes1.toCharArray();
	        
	        int res[] = new int[boxes.length];
	        int ahead=0;
	        int behind=0;
	        for(int i =0 ;i < boxes.length;i++){
	            
	            if(boxes[i] =='1'){
	                ahead++;
	                res[0]+=i;
	            }
	        }
	        
	        if(boxes[0]=='1'){
	            ahead--;
	            behind++;
	        }
	        
	        for(int i=1;i<boxes.length;i++){
	            res[i]=res[i-1]-ahead+behind;
	            if(boxes[i]=='1'){
	                ahead--;
	                behind++;
	            }
	        }
	        
	        return res;
	        
	    }
	}
}

