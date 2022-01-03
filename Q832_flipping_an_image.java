package leetcode.easy;

public class Q832_flipping_an_image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		/[[1,1,0],[1,0,1],[0,0,0]]
		int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
		flipAndInvertImage(image);

	}

	 public static int[][] flipAndInvertImage(int[][] image) {
	       
	        int[][] res = new int[image.length][];
	        
	        for( int i =0 ;i < image.length; i++) {
	        	res[i] = new int[image[i].length];
	        	for(int j=image[i].length-1,k=0;j>=0;j--,k++) {
	        		res[i][k] = image[i][j]==0?1:0;
	        		
	        			
	        		
	        	}
	        	
	        }
	        return res;
	    }
}
