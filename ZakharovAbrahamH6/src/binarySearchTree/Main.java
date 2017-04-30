package binarySearchTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Create a test tree
		BinarySearchTree testTree = new BinarySearchTree();
		
		//Add data to our tree from text file
		importFile(testTree);
		
		//Print the tree inorder
		testTree.inorder();
	}
	
	/**
	 * Method to import a text file into a binary search tree
	 * @param importTree
	 */
	public static void importFile(BinarySearchTree importTree){
		 Scanner sc2 = null;
		    try {
		        sc2 = new Scanner(new File("words.txt"));
		    } catch (FileNotFoundException e) {
		        e.printStackTrace();  
		    }
		    while (sc2.hasNextLine()) {
		            Scanner s2 = new Scanner(sc2.nextLine());
		        while (s2.hasNext()) {
		            String s = s2.next();
		            importTree.insert(s);
		        }
		    }
		    
	}

}
