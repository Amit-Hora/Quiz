package leetcode.easy;

public class BinarySearch {
	
	public static void main(String args[]) {
		int[] arr = {1,2,3};
		int element = 4;
		int result=binarySearch(arr, element, 0, arr.length-1);
		System.out.println(result);
		
	}
	
	static int binarySearch(int [] arr, int element, int left, int right) {
		
		if (left > right) {
			return -1;
		}
		int mid = left + ((right-left)/2);
		
		if (arr[mid] == element) return mid;
		else if (arr[mid] > element) {
			System.out.println(mid+"--left"+ left+" --right "+right);
			return binarySearch(arr,element,left,mid-1);
		}
		else {
			System.out.println(mid+"--left"+ left+" --right "+right);
			return binarySearch(arr,element,mid+1,right);
		}
		
		
	}

}
