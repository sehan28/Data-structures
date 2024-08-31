package datastructures;

import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//create a priority Queue.
		Queue <Integer> priorityqueue = new PriorityQueue<>();
		
		//Insert data to queue
		priorityqueue.offer(7);
		priorityqueue.offer(5);
		priorityqueue.offer(9);
		priorityqueue.offer(2);
		priorityqueue.offer(8);
		
		
		//get data out from queue if it is not empty
		while(!priorityqueue.isEmpty()) {
			System.out.println(priorityqueue.poll());
		}

	}

}
