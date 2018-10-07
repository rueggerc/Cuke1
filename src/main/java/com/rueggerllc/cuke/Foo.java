package com.rueggerllc.cuke;

public class Foo {
	
	public void execute() {
		System.out.println("Here is a Foo class");
	}

	public void anotherMethod() {
		Bar bar = new Bar();
		bar.doIt(42);
	}
	
}
