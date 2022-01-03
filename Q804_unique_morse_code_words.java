package leetcode.easy;

public class Q804_unique_morse_code_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] points = new int[2][2];
		points[0] = new int[]{1,1};
		points[1] = new int[]{3,4};
		System.out.println(minTimeToVisitAllPoints(points));
	}
	
	 public static int minTimeToVisitAllPoints(int[][] points) {
	        
	        int counter =0;
	        for(int i=0;i<points.length-1;i++){
	            
	            int p1[] = points[i];
	            int p2[] =points[i+1];
	            
	            counter+=Math.max(Math.abs(p1[0]-p2[0]),Math.abs(p1[1]-p2[1]));
	            
	        }
	        return counter;
	        
	    }

}
