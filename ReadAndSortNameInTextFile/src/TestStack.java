
public class TestStack {
	 public static void main(String args[]) {
			System.out.println("Stack using Array");
		        System.out.println("----------------------------");
		        // Stack is defined to hold only String values
			Stack<String> arrayStack = new Stack<String>();
			System.out.println("Is Empty: "+arrayStack.isEmpty());
			System.out.println("Initial Stack size : "+arrayStack.size());
			arrayStack.push("Element One");
			arrayStack.push("Element Two");
			System.out.println("Stack size after push : "+arrayStack.size());
			System.out.println("Topmost element : "+arrayStack.pop());
			System.out.println("Stack size after pop : "+arrayStack.size());
			System.out.println("Is Empty: "+arrayStack.isEmpty());
			System.out.println("Topmost element : "+arrayStack.pop());
			System.out.println("Is Empty: "+arrayStack.isEmpty());
			
		   }

}
