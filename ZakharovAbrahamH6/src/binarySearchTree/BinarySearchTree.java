package binarySearchTree;

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
	if (root==null){
		this.setRoot(word);
	   	System.out.println("++Root: " + word);
		return;
	}
 	 if (word.equals(node.getWord())){
 		System.out.println("++Counter " + word);
  	   node.setCounter(node.getCounter()+1);
  	   return;
     }
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
}
