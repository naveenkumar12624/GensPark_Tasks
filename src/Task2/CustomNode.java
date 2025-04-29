package Task2;

public class CustomNode {

	private int value;
	private CustomNode nextNode;

	public CustomNode(int value, CustomNode nextNode) {
		this.value= value;
		this.nextNode =nextNode;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		if (value<0) {
			return;
		}
		this.value =value;
	}

	public CustomNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(CustomNode nextNode) {
		this.nextNode =nextNode;
	}
}

