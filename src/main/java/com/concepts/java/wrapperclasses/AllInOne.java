package com.concepts.java.wrapperclasses;

public class AllInOne {

	public static void main(String[] args) {
		
		int x = 100;
		String y = Integer.toString(x);
		
		Integer b = Integer.parseInt(y);
		
		int z = b.intValue();
		
		Integer c = z;
		
		String d = c.toString();
		
		int e = Integer.parseInt(d);

	}

}
