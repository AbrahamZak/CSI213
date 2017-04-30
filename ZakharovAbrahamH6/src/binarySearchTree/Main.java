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
		File f = new File ("text.txt");
		try {
			Scanner scan = new Scanner(f);
			while (scan.hasNextLine()){
				importTree.insert(scan.next());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
