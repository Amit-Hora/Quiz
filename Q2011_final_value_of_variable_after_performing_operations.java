package leetcode.easy;

public class Q2011_final_value_of_variable_after_performing_operations {

	public static void main(String args[]) {
		
		System.out.println(finalValueAfterOperations(new String[] {"--X","X++","X++"}));

	}

	
	
	public static int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String op:operations){
            if(op.contains("++")){
                x=x+1;
            }
            else{
                x=x-1;
            }
        }
        return x;
        
    }
	
	// charAT is faster than conatins
	public static int finalValueAfterOperations1(String[] operations) {
		 int value = 0;
	        if(operations != null){
	            for(String operation : operations){
	                if(operation.charAt(1) == '+'){ // X++ or ++X - the character at index 1 is +
	                    ++value;
	                }else{
	                    --value;
	                }
	            }
	        }
	        
	        return value;
        
    }
	
}
