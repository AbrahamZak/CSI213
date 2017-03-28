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
    
    /**
     * Method to iterate the stack and print its contents
     */
    public void print(){
    	//set a temp node equal to our root
        Node currentNode = root;

        //If the stack is empty, let the user know you can't iterate it
        if (currentNode==null){
      	  System.out.println("The list is empty.");
      	  return;
        }
        
        //Continue looping through the stack until we get to the end,
        //printing each node in the process
        System.out.print("Stack: ");
        while(currentNode.getName()!= null)
        {
      	  //Print the current node
      	  System.out.print(currentNode.getName() + " ");
      	  
      	  //If the next node is empty we break the loop
      	  if (currentNode.getNext()==null){
      		  break;
      	  }
      	  
      	  //Get the next node
            currentNode = currentNode.getNext();
        }
        System.out.println();
    }
}
