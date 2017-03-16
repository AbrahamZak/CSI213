package doublyLinkedList;

public class Main {

	
	public static void main(String[] args) {
		//Creates our test doubly linked list
		DoublyList testList = new DoublyList();
		
		//Creates some test nodes
		Node testNodeOne = new Node ("Hello");
		Node testNodeTwo = new Node ("Goodbye");
		Node testNodeThree = new Node ("Shalom");
		Node testNodeFour = new Node ("Adios");
		
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
		
		//Try to find a node that exists in the list and then try to find a node that doesn't
		if (testList.findNode("Shalom")==true){
			System.out.println("Node found.");
		}
		else{
			System.out.println("Node not found.");
		}
		
		if (testList.findNode("Adios")==true){
			System.out.println("Node found.");
		}
		else{
			System.out.println("Node not found.");
		}
		
		System.out.println();
		
		//Destroy the list
		testList.destroy();
		
		//Iterate the list forwards after deletion
	    testList.iterateForwards();
		
	    System.out.println();
	    

		//Return the size of the list after destroying it
		System.out.println(testList.getSize());
		
		System.out.println();
	    
		//Add some new nodes to the list
		testList.add(testNodeFour);
		testList.add(testNodeTwo);
		testList.add(testNodeThree);
		

		//Return the size of the list after adding new nodes
		System.out.println(testList.getSize());
		
		System.out.println();
		
		//Iterate the list forwards after adding new nodes
		testList.iterateForwards();
		
		System.out.println();
		
		//Attempt to delete a node that is not on the list
		testList.deleteNode(testNodeOne);
		
		System.out.println();
		
		//Delete a node on the list
		testList.deleteNode(testNodeTwo);
		
		System.out.println();
		
		//Return the size of the list after deleting the node
		System.out.println(testList.getSize());
		
		System.out.println();
		
		//Iterate the list forwards after deleting the node
		testList.iterateForwards();
		
		System.out.println();
		
		//Iterate the list backwards after deleting the node
		testList.iterateBackwards();
		
		System.out.println();
	}

}
