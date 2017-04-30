package binarySearchTree;

public class Main {

	public static void main(String[] args) {
		//Create a test tree
		BinarySearchTree testTree = new BinarySearchTree();
		
		//Add data to our tree
		testTree.setRoot("hello");
		testTree.insert("hello");
		testTree.insert("goodbye");
		testTree.insert("goodbye");
		testTree.insert("zebra");
		testTree.insert("banana");
		testTree.insert("octogon");
		testTree.insert("hello");
		
		//Print the tree inorder
		testTree.inorder();
	}

}
