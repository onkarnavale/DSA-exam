package com.arraystack.main;

import com.arraystack.oops.Stack;

public class StackMain {

	public static void main(String[] args) {
		
		Stack s = new Stack(4);
		
		s.push(12);
		s.push(23);
		s.push(45);
		s.push(10);
		
		System.out.println();
		System.out.println("All elements of stack are: ");
		s.displayStack();
		
		System.out.println();
		System.out.println();
		System.out.println("Popped element is: " + s.pop());
		
		System.out.println();
		System.out.println("New elements of stack are: ");
		s.displayStack();

		System.out.println();
		System.out.println();
		System.out.println("Element using peek method: " + s.peek());
		
		System.out.println();
		System.out.println("Number of elements are : " + s.count());
	}

}
