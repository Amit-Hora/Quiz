package com.codefriend.javaclasses.helloworlds;
import java.util.BitSet;

public class BitSetHelloWorld {

	public static void main(String[] args) {
		 BitSet bits1 = fromString("1000001");
	        BitSet bits2 = fromString("1111111");

	        System.out.println(toString(bits1)); // prints 1000001
	        System.out.println(toString(bits2)); // prints 1111111

	        bits2.and(bits1);
	       
	        System.out.println(toString(bits2)); // prints 1000001
	        BitSet bits11 = new BitSet();
	        bits11.set(1);
	        System.out.println(bits11);
	}
	 private static BitSet fromString(final String s) {
	        return BitSet.valueOf(new long[] { Long.parseLong(s, 2) });
	    }

	    private static String toString(BitSet bs) {
	        return Long.toString(bs.toLongArray()[0], 2);
	    }
}
