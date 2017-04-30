package binarySearchTree;


public class Main {

	public static void main(String[] args) {
		//Create a test tree
		BinarySearchTree testTree = new BinarySearchTree();
		
		//Add data to our tree from text file
		testTree.importFile("text");
		
		//Search for a specific string, the method returns the node of the search term
		//We use try in order to catch a possible null pointer exception
		//because the search returns a null node if the term isn't found
		try{
			 if ("hello".equals(testTree.search("hello").getWord())){
		 }
			 System.out.println("Found");
		 }
		 catch(NullPointerException e ){
			 System.out.println("Not found.");
		 }
		  
		 //Search for a string not in our tree
		 try{
			 if ("hello".equals(testTree.search("nothing").getWord())){
		 }
			 System.out.println("Found");
		 }
		 catch(NullPointerException e ){
			 System.out.println("Not found.");
		 }
		
		//Print the tree inorder
		testTree.inorder();
	}
	
	

}
