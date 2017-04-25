package binarySearchTree;

public class Main {

	public static void main(String[] args) {
		//Create a test tree
		BinarySearchTree testTree = new BinarySearchTree();
		
		//Add data to our tree
		testTree.setRoot("hello");
		testTree.insert("goodbye");
		testTree.insert("hello");
		testTree.insert("goodbye");
		testTree.insert("goodbye");
		
		//Print the tree inorder
		testTree.inorder();
	}

}
