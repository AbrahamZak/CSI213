package bubbleSort;

public class Node {

	//The data our node is holding will be a string
	private int value;
	
	//Each node will reference the next node and the previous node
	private Node next;
	private Node previous;
	
	/**
	 * Constructor to initialize a node
	 * @param name
	 */
	public Node(int number) {
		this.value = number;
		this.previous = null;
		this.next = null;
	}
	
	/**
	 * Getter for the next node
	 * @return the next node
	 */
	public Node getNext() {
		return next;
	}
	
	/**
	 * Getter for the previous node
	 * @return the previous node
	 */
	public Node getPrevious() {
		return previous;
	}
	
	/**
	 * Setter for the next node
	 * @param node
	 */
	public void setNext(Node node) {
		this.next = node;
	}
	
	/**
	 * Setter for the previous node
	 * @param node
	 */
	public void setPrevious(Node node) {
		this.previous = node;
	}
	
	/**
	 * Getter for the value
	 * @return value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Setter for the value
	 * @param number
	 */
	public void setValue(int number) {
		this.value = number;
	}
}
