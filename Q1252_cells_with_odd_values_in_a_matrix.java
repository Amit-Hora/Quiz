package leetcode.easy;

public class Q1252_cells_with_odd_values_in_a_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int oddCells1(int m, int n, int[][] indices) {

		boolean rows[] = new boolean[m];
		boolean cols[] = new boolean[n];
		int oddcount = 0;
		for (int i = 0; i < indices.length; i++) {
			rows[indices[i][0]] = rows[indices[i][0]] ^ true;
			cols[indices[i][1]] = cols[indices[i][1]] ^ true;
		}

		for (boolean rv : rows) {
			if(!rv) oddcount++;
		}

		for (boolean cv : cols) {
			if(!cv) oddcount++;
		}
		return oddcount;
	}

	public static int oddCells(int m, int n, int[][] indices) {

		int[][] metrics = new int[m][n];
		int oddcount = 0;
		for (int[] index : indices) {
			int row = index[0];
			int col = index[1];
			for (int i = 0; i < n; i++) {
				metrics[row][i]++;
				if (metrics[row][i] % 2 != 0 && metrics[row][i] != 0) {
					oddcount++;
				} else if (metrics[row][i] % 2 == 0 && metrics[row][i] != 0) {
					oddcount--;
				}
			}

			for (int i = 0; i < m; i++) {
				metrics[i][col]++;
				if (metrics[i][col] % 2 != 0 && metrics[i][col] != 0) {
					oddcount++;
				} else if (metrics[i][col] % 2 == 0 && metrics[i][col] != 0) {
					oddcount--;
				}
			}

		}
		return oddcount;
	}
}
