package leetcode.easy;

public class Q1304_find_n_unique_integers_sum_up_to_zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumZero(5);

	}

	  public  static int[] sumZero(int n) {
	     
		  int[] ans = new int[n];
		  int index=0;
		  if (n==1) return new int[] {0};
		  int i=1;
		  int npres=n;
		  while((n-2)>=0) {
			  int randn = (int)Math.random();
			  ans[index] = randn;
			  index++;
			  ans[index] =  -randn;
			  index++;
			  n=n-2;
		  }
		  if(n!=0) ans[index] =0;
		  return ans;
		  
	    }
}
