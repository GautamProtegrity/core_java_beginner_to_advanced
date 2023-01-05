package com.concepts.java.packages.p2;

import com.concepts.java.packages.p1.A;
import com.concepts.java.packages.p1.p3.E;

import static com.concepts.java.packages.p1.A.a1;

public class C {

	public static void main(String[] args) {
		
		a1();
		A aObject = new A();
		aObject.a2();
		
		E eObject = new E();
		eObject.e1();
	}

}
