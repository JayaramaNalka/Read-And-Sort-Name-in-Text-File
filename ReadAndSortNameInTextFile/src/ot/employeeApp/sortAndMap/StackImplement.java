package ot.employeeApp.sortAndMap;

import java.util.Scanner;

public class StackImplement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Stack Test\n");
		System.out.println("Enter Size of Integer Stack ");
		int n = scan.nextInt();
		Stack stk = new Stack(n);
		char ch;
		do {
			System.out.println("\nStack Operations");
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("4. check empty");
			System.out.println("5. check full");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter integer element to push");
				stk.push(scan.nextInt());

				break;
			case 2:

				System.out.println("Popped Element = " + stk.pop());

				break;

			case 4:
				System.out.println("Empty status = " + stk.isEmpty());
				break;
			case 5:
				System.out.println("Full status = " + stk.isFull());
				break;

			}
			stk.display();
			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch = scan.next().charAt(0);

		} while (ch == 'Y' || ch == 'y');
	}
}