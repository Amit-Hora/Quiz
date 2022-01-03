package leetcode.easy;

public class Q1266_minimum_time_visiting_all_points {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	   public int minTimeToVisitAllPoints(int[][] points) {
	        
	        int counter =0;
	        for(int i=0;i<points.length-1;i++){
	            
	            int p1[] = points[i];
	            int p2[] =points[i+1];
	            
	            counter+=Math.max(Math.abs(p1[0]-p2[0]),Math.abs(p1[1]-p2[1]));
	            
	        }
	        return counter;
	        
	    }
}
