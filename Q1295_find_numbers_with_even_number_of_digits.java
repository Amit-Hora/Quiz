package leetcode.easy;

public class Q1295_find_numbers_with_even_number_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findNumbers(int[] nums) {

		int even = 0;
		int i = 0;
		for (int number : nums) {

			while (number > 0) {
				i++;
				number = number / 10;

			}
			if (i % 2 == 0)
				even++;
			i = 0;
		}
		return even;
	}

}
