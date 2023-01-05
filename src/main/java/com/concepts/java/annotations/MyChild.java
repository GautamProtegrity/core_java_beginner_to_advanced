package com.concepts.java.annotations;

public class MyChild extends MyParent {

	@Override
	public String greet(String name) {
		return "Hi " + name;
	}
}
