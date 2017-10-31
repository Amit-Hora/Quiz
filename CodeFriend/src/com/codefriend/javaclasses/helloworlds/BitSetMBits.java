package com.codefriend.javaclasses.helloworlds;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class BitSetMBits {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		BitSet[] bitSetArray = { new BitSet(N), new BitSet(N) };
		Map<String, BiConsumer<Integer, Integer>> opTolambda = new HashMap<>();
		opTolambda.put("AND", (index1, index2) -> bitSetArray[index1 - 1].and(bitSetArray[index2 - 1]));
		opTolambda.put("OR", (index1, index2) -> bitSetArray[index1 - 1].or(bitSetArray[index2 - 1]));
		opTolambda.put("SET", (index1, index2) -> bitSetArray[index1 - 1].set(index2));
		opTolambda.put("FLIP", (index1, index2) -> bitSetArray[index1 - 1].flip(index2));

		int i = 0;
		while (i <= M) {
			opTolambda.get(scanner.next()).accept(scanner.nextInt(), scanner.nextInt());    
			System.out.println(bitSetArray[0].cardinality()+" "+bitSetArray[1].cardinality());
			i++;
		}
}

}
