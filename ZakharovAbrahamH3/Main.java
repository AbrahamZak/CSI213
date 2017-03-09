package doublyLinkedList;

public class Main {

	
	public static void main(String[] args) {
		//Creates our test doubly linked list
		DoublyList testList = new DoublyList();
		
		//Creates some test nodes
		Node testNodeOne = new Node ("Hello");
		Node testNodeTwo = new Node ("Goodbye");
		Node testNodeThree = new Node ("Shalom");
		
		testList.add(testNodeOne);
		testList.add(testNodeTwo);
		testList.add(testNodeThree);
		
		testList.iterateForwards();
		testList.iterateBackwards();
	}

}
