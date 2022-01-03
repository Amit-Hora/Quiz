package leetcode.easy;

public class Seggregate {

	public static void main(String args[]) {
		
		int arr[] = {2,0,1,1};
		
		int mid=0,low = 0; int high = arr.length-1;
	/**
	 * move 0's to left
	 * move 2's to right
	 * you will be left with 1's in the middle
	 */
		while (mid <= high) {
			
			if (arr[mid] ==0) {
				swap(arr, mid, low);
				low++;
				mid++;
			}
			else if (arr[mid] ==2) {
				swap(arr, mid, high);
				high --;
			}
			else {
				mid++;
			}
			
			
		}
		for(int i:arr) {
			System.out.println(i);
		}
		
	}
	
	public static void swap(int[] arr, int i, int j) {
		
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
