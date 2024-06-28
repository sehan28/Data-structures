package datastructures;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				//creating a Stack.
				Stack<String> filmstack = new Stack<>();
				
				//insert items to the Stack
				filmstack.push("Titanic");
				filmstack.push("Pirates of the carribian");
				filmstack.push("Bad boys");
				filmstack.push("Load of the rings");
				filmstack.push("Batman");
				
				//view the items of the Stack
				System.out.println(filmstack);
				
				//remove item from Stack
				filmstack.pop();
				System.out.println(filmstack);
				
				//remove another item from Stack
				filmstack.pop();
				System.out.println(filmstack);
				
				//insert a new item to stack
				filmstack.push("Harry potter");
				System.out.println(filmstack);
				
				//view the item in the top of the Stack
				String topItem = filmstack.peek();
				System.out.println("this is the top item : "+topItem);
				
				
				
				
				
				
				
				
				
				
	}

}
