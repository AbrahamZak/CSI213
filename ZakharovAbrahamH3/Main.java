package doublyLinkedList;

public class Main {

	
	public static void main(String[] args) {
		//Creates our test doubly linked list
		DoublyList testList = new DoublyList();
		
		//Creates some test nodes
		Node testNodeOne = new Node ("Hello");
		Node testNodeTwo = new Node ("Goodbye");
		Node testNodeThree = new Node ("Shalom");
		
		//Add the test nodes to the list
		testList.add(testNodeOne);
		testList.add(testNodeTwo);
		testList.add(testNodeThree);
		
		//Return the size of the list
		System.out.println(testList.getSize());
		
		System.out.println();
		
		//Iterate the list forwards
		testList.iterateForwards();
		
		System.out.println();
		
		//Iterate the list backwards
		testList.iterateBackwards();
		
		System.out.println();
	}

}
