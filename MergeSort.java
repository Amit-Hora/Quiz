package leetcode.easy;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {15,2,0,5,1};
		
		mergesort(arr,0,arr.length-1);
		
	}
	
	public static void mergesort (int[] arr, int lb, int ub) {
		
		if (lb < ub) {
			
			int mid = (lb + ub)/2;
			mergesort(arr,lb,mid);
			mergesort(arr,mid+1,ub);
			merge(arr,lb,mid,ub);
		}
	}

	private static void merge(int[] arr, int lb, int mid, int ub) {
		// TODO Auto-generated method stub
		
		int i = lb;
		int k = lb;
		int j = mid+1;
		int[] b = new int[ub+lb+1];
		
		while(i <= mid && j <=ub) {
			 if( arr[i] <= arr[j]) {
				 b[k] = arr[i];
				 i++;
			 }
			 else {
				 System.out.println(ub + "  " + lb+"    ");
				 System.out.println(j);
				 System.out.println(k);
				 b[k] =arr[j];
				 j++;
			 }
			k++;
		}
		
		if (i > mid) {
			
			while(j<=ub) {
				b[k] =arr[j];
				k++;
				j++;
			}
		}
		else {
			while(i<=mid) {
				b[k] =arr[i];
				k++;
				i++;
			}
			
		}
		
		for(k=lb;k<=ub;k++) {
			arr[k]=b[k];
		}
		for(int ij : arr) {
			System.out.print(ij+" ");
		}
		System.out.println("*********");
	}

}
