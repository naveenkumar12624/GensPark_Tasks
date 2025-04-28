public class CustomFunctionsUsingQueueInLinkedList {
		private class Node {
			int data;
			Node next;


			Node(int data) {
				this.data = data;
				this.next = null;
			}
		}

		private Node front;
		private Node rear;

		public CustomFunctionsUsingQueueInLinkedList(){
			front = rear = null;
		}

		public void enqueue(int data){
			Node newNode = new Node(data);

			if(rear == null){
				front = rear = newNode;
				return ;
			}
			rear.next = newNode;
			rear = newNode;
		}

		public int dequeue(){
			if(front==null){
				System.out.println("Queue is Empty");
				return -1;
			}
			int dequeuedNode = front.data;
			front = front.next;
			if(front==null) rear =null;
			return dequeuedNode;
		}

		public int QueuePeek(){
			if(rear==null){
				System.out.println("Queue is Empty");
				return -1;
			}
			return front.data;
		}

		public boolean isEmptyQueueCheck(){
			return rear==null;
		}

		public void displayQueue(){
			if(rear==null){
				System.out.println("Queue is Empty");
			}
			Node current  = front;
			while(current!=null){
				System.out.print(current.data+" ");
				current = current.next;
			}
			System.out.println();
		}


}
