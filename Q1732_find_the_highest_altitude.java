package leetcode.easy;

public class Q1732_find_the_highest_altitude {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

    public int largestAltitude(int[] gain) {
        
        
        int[] alt = new int[gain.length+1];
        
        alt[0] = 0;
        int max = alt[0];
        for( int i=0;i < gain.length ; i++){
            alt[i+1] = alt[i] + gain[i];
            if(max < alt[i+1]) max = alt[i+1];
        }
        return max;
        
    }
}
