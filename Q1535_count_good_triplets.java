package leetcode.easy;

public class Q1535_count_good_triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int countGoodTriplets(int[] arr, int a, int b, int c) {
		int count=0;
		for(int i=0; i<arr.length-2; i++)
            for(int j=i+1; j<arr.length-1; j++){
                if(Math.abs(arr[i] - arr[j]) > a)
                    continue;
                for(int k=j+1; k<arr.length; k++){
                    if(Math.abs(arr[j] - arr[k]) > b ||Math.abs( arr[i] - arr[k])> c)
                        continue;
                    count++;

                }
            }

            return count;

	}
}
