package binarySearchTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinarySearchTree {
//The root node of our binary search tree
private Node root;

//Set to root to null
public BinarySearchTree(){
	root = null;
}

/**
 * Method to set the root to a certain word
 * @param word
 */
public void setRoot(String word){
    root = new Node(word);
}

/**
 * Getter for the root node
 * @return
 */
public Node getRoot(){
    return root;
}

/**
 * Method to insert a string node starting at the root
 * @param word
 */
public void insert(String word)
{
   insert(root, word);
}

/**
 * Method to insert the node, it will place to the left or right depending on the characters in the word
 * If a word already in the tree is inserted, the program will just add 1 to that node's counter
 * @param node
 * @param word
 */
private void insert(Node node, String word)
{
	//If the root is null, set our word as the root
	if (root==null){
		this.setRoot(word);
	   	System.out.println("++Root: " + word);
		return;
	}
	//If the word is the same as the word already in the tree, increase the counter by 1
 	 if (word.equals(node.getWord())){
 		System.out.println("++Counter " + word);
  	   node.setCounter(node.getCounter()+1);
  	   return;
     }
 	 //If the word is less than the word in the tree either add that word to
 	 //the left or continue down the left if there is already something there
 	  if (word.compareTo(node.getWord())<0){
   	if (node.left == null){
   	System.out.println("++Inserted " + word + " to the left of " + node.getWord());
   	 Node nodeLeft = new Node (word);
   	 node.left = nodeLeft;
   	 return;
   	}
   	else{
   		insert (node.left, word);
   	}
   }
 	 //If the word is greater than the word in the tree either add that word to
  	 //the right or continue down the right if there is already something there
    if (word.compareTo(node.getWord())>0){
   	if (node.right == null){
   	System.out.println("++Inserted " + word + " to the right of " + node.getWord());
   	Node nodeRight = new Node (word);
      	 node.right = nodeRight;
      	 return;
   	}
   	else{
   		insert (node.right, word);
   	}
   }
}

/**
 * Method to print the tree inorder beginning at the root
 */
public void inorder()
{
    inorder(root);
}

/**
 * Method to print the data in the tree inorder
 * @param r
 */
private void inorder(Node r)
{
    if (r!= null){
   	 inorder(r.left);
   	 System.out.println(r.getWord() + ": " + r.getCounter());
   	 inorder(r.right);
    }
}

/**
 * Method to import a text file into a binary search tree
 * @param importTree
 */
public void importFile(String fileName){
	File f = new File (fileName + ".txt");
	//Scan and add each word in the file to the tree
	try {
		Scanner scan = new Scanner(f);
		while (scan.hasNextLine()){
			insert(scan.next());
		}
		//This will catch the error if the file isn't found
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
}

/**
 * Method to search the tree beginning at the root
 */
public Node search (String word){
	return search(word, root);
}

/**
 * Method to search the tree recursively in order to find a node
 * that matches a search term (string), returns the node
 * @param word
 * @param node
 * @return node
 */
public Node search (String word, Node node){
	//If we haven't found the search term, return null
	if (node==null){
		return null;
	}
	//If we found the search term, return the node with that search term
	else if (word.equals(node.getWord())){
  	   return node;
     }
	//Otherwise move to the left or right of the tree depending on the search
	//term and current position
	 if (word.compareTo(node.getWord())<0){
		   		return search (word, node.left);
		   	}
	 else if (word.compareTo(node.getWord())>0){
		   		 return search (word, node.right);
		   	}
	return node;
	

	}
/**
 * Method to delete a node from the tree starting its search at the root
 * It will set the root equal to a new tree that has the node removed
 * @param word
 */
public void delete (String word){
	root = delete(root, word);
}

/**
 * Method that searches for a specific node and deletes it from the tree,
 * it starts its search at the root
 * @param word
 * @param root
 */
public Node delete (Node root, String word){
	//If the tree is empty, return root
    if (root == null)  return root;
    
    //Otherwise, recursively move through the tree until we find a node
    //that matches to the term
    if (word.compareTo(root.getWord()) < 0)
        root.left = delete(root.left, word);
    else if (word.compareTo(root.getWord()) > 0)
        root.right = delete(root.right, word);

    //Once we find the node that matches the term we need to check how we are going
    //to delete it
    else
    {
        //If the node only has one child or none we can return its left or right
    	//as the new root term (in that part of the tree)
        if (root.left == null){
        	System.out.println("Removed: " + word);
        	 return root.right;
        }  
        else if (root.right == null){
        	System.out.println("Removed: " + word);
            return root.left;
        }
        //If the node has two children we get the smallest node in the right subtree
        root.setWord(minWord(root.right));

        // Delete it
        root.right = delete(root.right, root.word);
    }
    //Return our root after all modifications, it becomes our new root
    return root;
	}

/**
 * Method to find the smallest node in the right subtree, only used when we have two
 * children in a node we want to delete
 * @param root
 * @return
 */
String minWord(Node root)
{
    String minw = root.getWord();
    while (root.left != null)
    {
        minw = root.left.getWord();
        root = root.left;
    }
    return minw;
}
}


