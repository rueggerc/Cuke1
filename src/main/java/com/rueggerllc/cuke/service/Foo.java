package com.rueggerllc.cuke.service;

public class Foo {
	
	public void execute() {
	}

	public void anotherMethod() {
		Bar bar = new Bar();
		bar.doIt(42);
	}
	
	public int yetAnotherMethod() {
		int x = 43;
		for (int i = 0; i < 10; i++) {
			x += i;
		}
		return x;
	}
	
	public boolean isPalindrome(String inputString) {
		System.out.println("CHECKING PALINDROME: " + inputString);
	    if (inputString.length() == 0 || inputString.length() == 1) {
	        return true;
	    } else {
	        char firstChar = inputString.charAt(0);
	        char lastChar = inputString.charAt(inputString.length() - 1);
	        String mid = inputString.substring(1, inputString.length() - 1);
	        return (firstChar == lastChar) && isPalindrome(mid);
	    }
	}
	
}
