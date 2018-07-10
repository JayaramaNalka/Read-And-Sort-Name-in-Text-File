package ot.employeeApp.sortAndMap;

import java.util.*;

class Stack {
	protected int arr[];
	protected int top, size, len;

	public Stack(int n) {
		size = n;
		len = 0;
		arr = new int[size];
		top = -1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == size - 1;
	}

	public void push(int i) {
		if (top + 1 >= size)
			throw new IndexOutOfBoundsException("Overflow Exception");
		if (top + 1 < size)
			arr[++top] = i;
		len++;
	}

	public int pop() {
		if (isEmpty())
			System.out.println("Underflow Exception");
		len--;
		return arr[top--];
	}

	public void display() {
		System.out.print("\nStack = ");
		if (len == 0) {
			System.out.print("Empty\n");
			return;
		}
		for (int i = top; i >= 0; i--)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
