package leetcode.easy;

public class Q1572_matrix_diagonal_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int diagonalSum(int[][] mat) {
        int sum=0;
        int common=0;
        for(int i=0,j=mat[0].length-1;i<mat.length;i++,j--){
            
            sum=sum+mat[i][i]+mat[i][j];
                if(i==j)common=mat[i][j];
        }
        return sum-common;
        // return sum;
    }
}
