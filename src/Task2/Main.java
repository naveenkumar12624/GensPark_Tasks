package Task2;
public class Main {

	public static void main(String[] args) {

		CustomLinkedList list = new CustomLinkedList();
		list.insertAtEnd(50);
		list.insertAtEnd(100);
		list.insertAtEnd(200);
		list.insertAtEnd(300);
		list.insertAtEnd(400);
		list.insertAtEnd(500);

		System.out.println("Initial List:");
		list.displayList();

		int nodeCount = list.getNodeCount();
		System.out.println("Node Count: " + nodeCount);

		list.removeLastNode();
		System.out.println("After Removing Last Node:");
		list.displayList();

		list.removeAtIndex(2);
		System.out.println("After Removing Node at Index 0:");
		list.displayList();

		nodeCount = list.getNodeCount();
		System.out.println("Node Count: " + nodeCount);
	}
}
