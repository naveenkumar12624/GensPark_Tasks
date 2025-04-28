package Task4;

public class CustomFunctionsUsingStackInLinkedList {
	private static class Node{
		int data;
		Node next;

	Node(int data){
		this.data = data;
		this.next = null;
	}
	}

	private Node top;

	public CustomFunctionsUsingStackInLinkedList(){
		top = null;
	}

	public void push(int data){
		Node newNode = new Node(data);
		if(top==null){
			top = newNode;
		}
		else {
			newNode.next = top;
			top = newNode;
		}
	}

	public int pop(){
		if(top==null){
			System.out.println("Stack is Empty");
			return -1;
		}
		int popppedData = top.data;
		top = top.next;
		return popppedData;
	}
	public boolean isEmpty(){
		return top == null;
	}
	public void displayStack(){
		if(top==null) {
			System.out.println("Stack is Empty");
			return;
		}
		Node current = top;

		while (current!=null) {
			System.out.print( current.data+ " ");
			current = current.next;
		}
		System.out.println();
	}



}
