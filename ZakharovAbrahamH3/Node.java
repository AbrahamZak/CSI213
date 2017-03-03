package doublyLinkedList;

public class Node {

	private String name;
	private Node next;
	private Node previous;
	
	public Node(String name) {
		this.name = name;
		this.previous = null;
		this.next = null;
	}
	
	public Node getNext() {
		return next;
	}
	
	public Node getPrevious() {
		return previous;
	}
	
	public void setNext(Node node) {
		this.next = node;
	}
	
	public void setprevious(Node node) {
		this.previous = node;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
