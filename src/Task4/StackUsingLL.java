package Task4;

public class StackUsingLL {
	public static void main(String[] args) {

		CustomFunctionsUsingStackInLinkedList customFunctionsUsingStackInLinkedList = new CustomFunctionsUsingStackInLinkedList();
		customFunctionsUsingStackInLinkedList.push(5);
		customFunctionsUsingStackInLinkedList.push(10);
		customFunctionsUsingStackInLinkedList.push(20);

		System.out.println(customFunctionsUsingStackInLinkedList.pop());
		customFunctionsUsingStackInLinkedList.displayStack();

		customFunctionsUsingStackInLinkedList.pop();
		System.out.println(customFunctionsUsingStackInLinkedList.isEmpty());

		customFunctionsUsingStackInLinkedList.displayStack();

	}
}
