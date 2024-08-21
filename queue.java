package datastructures;


import java.util.LinkedList;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue <String> filmqueue = new LinkedList<>();
		
		
		//Check the queue is empty
		System.out.println("Is empty :"+filmqueue.isEmpty());
		
		//Insert elements to the Queue.
		filmqueue.offer("The lost city");
		filmqueue.offer("Red notice");
		filmqueue.offer("Scooby doo");
		filmqueue.offer("Iron man");
		filmqueue.offer("Garfield");
		
		System.out.println("Is empty :"+filmqueue.isEmpty());
		
		//Print the created Queue.
		System.out.println("elements of the Queue :"+filmqueue);
		
		//Check the size of the Queue
		System.out.println("size of the Queue : "+filmqueue.size());
		
		//Get the next processing element of the Queue
		System.out.println("Next processing element :"+filmqueue.peek());
		
		//Remove an element from the Queue
		filmqueue.poll();
		
		System.out.println("Queue after remove onece :"+filmqueue);
		
		




		
	}

}
