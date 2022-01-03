package leetcode.easy;

public class Q1720_decode_xored_array {
	
	
	public static void main(String args[]) {
		int a = 5 ^7;
		int b = 5 ^ a;
		System.out.println(a);
		System.out.println(b);
	}

	public int[] decode(int[] encoded, int first) {
		
		int arr[] = new int[encoded.length+1];
		arr[0] = first;
		for( int i =0 ;i< encoded.length;i++ ) {
			
			arr[i+1] = encoded[i]^arr[i];
		}
		return arr;

	}
}
