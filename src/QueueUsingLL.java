public class QueueUsingLL {
	public static void main(String[] args) {
		CustomFunctionsUsingQueueInLinkedList queue = new CustomFunctionsUsingQueueInLinkedList();

		System.out.println(queue.isEmptyQueueCheck());
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);

		queue.displayQueue();

		queue.dequeue();
		System.out.println("Peak :"+ queue.QueuePeek());



	}
}