package stacksAndQueuesADT;


public class Stack {
	//Our initial node (which starts empty)
    private Node top = null;
    
    /**
     * Method to add a node to the beginning of our stack
     * @param add
     */
    public void push(String add) {
    	
    	//Create the node we will be adding from the string given
    	 Node newNode = new Node (add);
    	 
    	//If the stack is empty, add this initial node as the top
   	     if (top == null){
   	    	top = newNode;
   		 System.out.println("push (" + add + ")");
   	     }
   	     
   	     //If the stack is not empty, make the new node the top
   		 else{
   			newNode.setNext(top);
   			top = newNode;
   			System.out.println("push (" + add + ")");
   		 }	  
   	  }
    
    /**
     * Method to remove the top node of our stack
     */
    public void pop() {
    	//If there is only one item in our stack, remove that one item
    	if (top.getNext()==null){
    		System.out.println("pop -> " + top.getName());
    		top = null;
    		return;
    	}
    	//If there is more than one item set the top to next node
    	else{
    	System.out.println("pop -> " + top.getName());
    	top = top.getNext();
    	}
    }
    
    /**
     * Method to get the data from the top node of our stack
     */
    public String peek() {
    	String peek = top.getName();
    	return peek;
    }
    
    /**
     * Method to iterate the stack and print its contents
     */
    public void print(){
    	//set a temp node equal to our top
        Node currentNode = top;

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
