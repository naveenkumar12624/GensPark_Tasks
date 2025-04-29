package Task2;

public class CustomLinkedList {

	private CustomNode start;

	void displayList() {
		CustomNode temp =start;
		while (temp != null) {
			System.out.println(temp.getValue());
			temp = temp.getNextNode();
		}
	}

	void insertAtEnd(int value) {
		CustomNode newNode = new CustomNode(value, null);
		if (start == null) {
			start = newNode;
			return;
		}

		CustomNode temp =start;
		while (temp.getNextNode() != null) {
			temp = temp.getNextNode();
		}

		temp.setNextNode(newNode);
	}

	public int getNodeCount() {
		int count = 0;
		CustomNode temp =start;

		while (temp != null) {
			count++;
			temp = temp.getNextNode();
		}

		return count;
	}

	void removeAtIndex(int index) {
		if (start== null || index < 0) {
			return;
		}

		if (index ==0) {
			start = start.getNextNode();
			return;
		}

		CustomNode temp =start;
		CustomNode prev = null;

		for (int i =0; i <index; i++) {
			if (temp ==null) {
				return;
			}
			prev =temp;
			temp =temp.getNextNode();
		}

		if (temp ==null) {
			return;
		}

		prev.setNextNode(temp.getNextNode());
	}
	void removeLastNode() {
		if (start== null) {
			return;
		}

		if (start.getNextNode() ==null) {
			start = null;
			return;
		}

		CustomNode temp =start;
		while (temp.getNextNode().getNextNode() != null) {
			temp = temp.getNextNode();
		}

		temp.setNextNode(null);
	}
}
