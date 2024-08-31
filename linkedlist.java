package datastructures;

import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create linked list.
		LinkedList<String> linklist1 =new LinkedList<>();
		
		// add new elements to the linked list
		linklist1.add("America");
		linklist1.add("Kanada");
		linklist1.add("Japan");
		linklist1.add("Australia");
		linklist1.add("Sri lanka");
		
		System.out.println(linklist1);
		
		//remove elements from the linked list
		linklist1.remove();
		System.out.println(linklist1);
		
		// remove selected item from linked list
		linklist1.remove("Japan");
		System.out.println(linklist1);
		
		// add new items for the begin and the end of the linked list
		linklist1.addFirst("France");
		linklist1.addLast("India");
		System.out.println(linklist1);
		
		//add an item for specified place
		linklist1.add(3, "Germany");
		System.out.println(linklist1);
		
		//remove an item from specified location
		linklist1.remove(2);
		System.out.println(linklist1);




		
		
		
	}

}
