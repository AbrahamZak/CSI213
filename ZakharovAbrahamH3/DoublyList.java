package doublyLinkedList;

public class DoublyList {

	//Variable to keep track of the size of our doubly list
	private int size = 0;
	//Our initial node (which starts empty)
    private Node root = null;
    
    /**
     * Method to add a node to the doubly list
     * @param node
     */
    public void add(Node node) {
    	 if (node==null) {
    		 System.out.println("This node is empty");
    		 return;
    	 }
    	 else if (root == null){
    		 size++;
    		 root = node;
    	 }
    	 else{
    		 Node current = root;
    		 while(current.getNext() != null){
                 current = current.getNext();
                 }
                 size++;
                 current.setNext(node);
                 node.setPrevious(current); 
    	 }
    		 
    }
    
    /**
     * Start with the head and traverse till you reach null. Print out the data in the nodes.
     */
    public void iterateForwards(){
    	//set a temp node equal to our root
          Node currentNode = root;

          //If the list is empty, let the user know you can't iterate it
          if (currentNode==null){
        	  System.out.println("The list is empty.");
        	  return;
          }
          
          //Continue looping through the list until we get to the end,
          //printing each node in the process
          while(currentNode.getName()!= null)
          {
        	  //Print the current node
        	  System.out.println(currentNode.getName());
        	  
        	  //If the next node is empty we break the loop
        	  if (currentNode.getNext()==null){
        		  break;
        	  }
        	  
        	  //Get the next node
              currentNode = currentNode.getNext();
          }
}
    /**
     * Start with the tail and traverse till you reach null. Print out the data in the nodes.
     */
    public void iterateBackwards(){
    	//set a temp node equal to our root
          Node currentNode = root;
          
        //If the list is empty, let the user know you can't iterate it
          if (currentNode==null){
        	  System.out.println("The list is empty.");
        	  return;
          }
          
          //Continue looping through the list until we get to the end
          while(currentNode.getName()!= null)
          {
        	  currentNode = currentNode.getNext();
        	  
        	  //If the next node is empty we break the loop
        	  if (currentNode.getNext()==null){
        		  break;
        	  }
          }
          
          //While the previous node isn't empty we print and then move back one
          while (currentNode.getName()!= null){
        	  //Print the current node
        	  System.out.println(currentNode.getName());
        	  
        	  //If the previous is empty, we break the loop
              if (currentNode.getPrevious()==null){
    		  break;
    	      }
              
              //Otherwise we set our node to the previous one
          	  currentNode = currentNode.getPrevious();
          }
              
          }
    /**
     * Method to return the size of the list
     * @return size
     */
    public int getSize() {
        return size;
    }
    
    /**
     * Method to take a Node and check if the node is in the list.
     * If it finds the node, it returns true, otherwise it will return false
     * @param - Node
     * @return boolean 
     */
   public boolean findNode(String search){
	   //Make a temp node called checker (copy of our root)
	   Node checker = root;
	   
	   //If the very first node is equal to the one we are searching for, return true
	   if(checker.getName() == search) {
		   return true;
	   }
	   //Otherwise search the entire list for a matching node
	   else {
	   while(checker.getNext() != null){
		   checker = checker.getNext();
		   if (checker.getName() == search) {
			   return true;
	   }
	   }
	   //If it is ultimately not found, return false
	   return false;
	   }   
   }
   
   //Method to delete/destroy the list
   public void destroy(){
	   
	//set a temp node equal to our root
       Node destroy = root;
       
     //If the list is empty, let the user know you can't iterate it
       if (destroy==null){
     	  System.out.println("The list is empty.");
     	  return;
       }
       
       if (destroy.getNext()==null){
    	   destroy = null;
       }
       
       else{
    	   while (destroy.getNext() != null){
    		   Node temp = destroy.getNext();
    		   if (destroy.getPrevious()!=null){
    			   destroy.setPrevious(null);
    		   }
    		   if (destroy.getNext()!=null){
    			   destroy.setNext(null);
    		   }
    		   destroy = null;
    		   destroy = temp;
    		   
    	   }
    	   root = null;
       }
       
   }
       
       
   }


