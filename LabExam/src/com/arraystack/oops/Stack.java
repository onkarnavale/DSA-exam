package com.arraystack.oops;

public class Stack {

	private int[] arr;
	private int top;
	
	public Stack(int size) {
		arr = new int[size];
		top = -1;
	}
	
	public void push(int element) {
		
		if(top == arr.length-1) {
			System.out.println("Stack is full, wont be able to push element");
			return;
		}
		top = top + 1;
		arr[top] = element;
		System.out.println("element pushed into stack");
	}
	
	public Integer pop() {
		
		if( top == -1) {
			return null;
		}
		int element = arr[top];
		top--;
		return element;
	}
	
	public Integer peek() {
		if (top == -1) {
			return null;
		}
		return arr[top];
	}
	
	public Integer count() {
		
		return top+1;
	}
	
	public void displayStack() {
		for(int i = top; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
