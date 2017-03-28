package stacksAndQueuesADT;


public class Stack {
	//Our initial node (which starts empty)
    private Node root = null;
    
    /**
     * Method to add a node to the beginning of our stack
     * @param add
     */
    public void push(String add) {
    	
    	//Create the node we will be adding from the string given
    	 Node newNode = new Node (add);
    	 
    	//If the stack is empty, add this initial node as the root
   	     if (root == null){
   		 root = newNode;
   		 System.out.println("push (" + add + ")");
   	     }
   	     
   	     //If the stack is not empty, make the new node the root
   		 else{
   			 newNode.setNext(root);
   			 root = newNode;
   			System.out.println("push (" + add + ")");
   		 }	  
   	  }
    
    /**
     * Method to remove the top node of our stack
     */
    public void pop() {
    	//If there is only one item in our stack, remove that one item
    	if (root.getNext()==null){
    		System.out.println("pop -> " + root.getName());
    		root = null;
    		return;
    	}
    	else{
    	System.out.println("pop -> " + root.getName());
    	root = root.getNext();
    	}
    }
    
    /**
     * Method to get the data from the top node of our stack
     */
    public String peek() {
    	String peek = root.getName();
    	return peek;
    }
}
