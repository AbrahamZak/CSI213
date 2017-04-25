package binarySearchTree;

public class Node {

	//Each node will reference the left node and the right node
	 Node left;
	 Node right;
	
	//The data our node is holding will be a string and a counter for how many times that string appears
	String word;
	int counter;
	
	/**
	 * Constructor to initialize a node
	 * @param add
	 */
	 public Node (String add)
	    {
	        left = null;
	        right = null;
	        word = add;
	    }
	 
	 /**
	  * Method to set the left node
	  * @param n
	  */
	 public void setLeft(Node n)
	    {
	        left = n;
	    }

	 /**
	  * Method to set the right node
	  * @param n
	  */
	    public void setRight(Node n)
	    {
	        right = n;
	    }

	    /**
		 * Getter for the left node
		 * @return the left node
		 */
	    public Node getLeft()
	    {
	        return left;
	    }

	    /**
		 * Getter for the right node
		 * @return the right node
		 */
	    public Node getRight()
	    {
	        return right;
	    }
	    
	    /**
	     * Method to set the counter for a node
	     * @param d
	     */
	    public void setCounter(int d)
	    {
	        counter = d;
	    }

	    /**
		 * Getter for the counter of a node
		 * @return the counter of a node
		 */
	    public int getCounter()
	    {
	        return counter;
	    }  
	    
	    /**
	     * Method to set the word of a node
	     * @param w
	     */
	    public void setWord(String w)
	    {
	        word = w;
	    }

	    /**
	     * Getter for the word string of the node
	     * @return the word string
	     */
	    public String getWord()
	    {
	        return word;
	    }     
}
