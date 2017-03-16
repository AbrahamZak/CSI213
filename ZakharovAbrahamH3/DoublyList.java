package doublyLinkedList;

public class DoublyList {

	//Variable to keep track of the size of our doubly list
	private int size = 0;
	//Our initial node (which starts empty)
    private Node root = null;
    private Node tail = null;
    
    /**
     * Method to add a node to the doubly list
     * @param node
     */
    public void add(Node node) {
    	//If the node is empty, don't add it to the list, let the user know
    	 if (node==null) {
    		 System.out.println("This node is empty");
    		 return;
    	 }
    	 //If the list is empty, add this intial node as both the root and tail
    	 else if (root == null){
    		 size++;
    		 root = node;
    		 tail = node;
    	 }
    	 //If there is already an existing element, find out where this new element belongs
    	 //and insert it into the list (in alphabetical order)
    	 else{
    		 Node current = root;
    		 while(current.getNext() != null){
                 current = current.getNext();
                 }
                 size++;
                 current.setNext(node);
                 node.setPrevious(current);
                 tail = node;
    	 }
    		 
    }
    
    /**
     * Start with the root and traverse till you reach null. Print out the data in the nodes.
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
    	
    	//set a temp node equal to our tail
          Node currentNode = tail;
          
          //If the list is empty, let the user know you can't iterate it
          if (currentNode==null){
        	  System.out.println("The list is empty.");
        	  return;
          }
          
        //Continue looping through the list backwards until we get to the end,
          //printing each node in the process
          while (currentNode.getName()!=null){
        	  
        	//Print the current node
        	  System.out.println(currentNode.getName());
        	  
        	//If the previous node is empty we break the loop
        	  if (currentNode.getPrevious()==null){
        		  break;
        	  }
        	  
        	//Get the previous node
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
       
       //If the list only has 1 element, destroy that element
       if (destroy.getNext()==null){
    	   destroy = null;
       }
       
       //If there are multiple elements on the list loop through the list until the end and delete each element
       //setting it's previous and next to null, then the node itself, and then moving onto the next node
       //In the end set the root to null and size to 0
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
    	   size = 0;
       }
       
   }
   /**
    * Method to delete a specific node from the list
    * @param delete
    */
   public void deleteNode(Node delete){
	   
	   Node current = root;
	   
	 //If the very first node in our list is equal to the one we are trying to delete, delete that one while
	 //setting the next one to the new root
	   if(delete == current) {
		   Node temp = current.getNext();
		   current = null;
		   temp.setPrevious(null);
		   root = temp;
		   size--;
	   }
	   
	   
	   else {
		   while(current.getNext() != null && current.getNext()!=delete){
			   
			   current = current.getNext();
			   
			   if (current.getNext()==null){
				   System.out.println("Node not found for deletion.");
				   return;
			   }
			   
			   }
		   if (current.getNext()==delete){
		   Node removal = current.getNext();
		   
		   if (tail==removal){
			   Node tempPrev = removal.getPrevious();
			   removal = null;
			   tail = tempPrev;
		   }
		   
		   if (tail!=removal){
			   Node tempPrev = removal.getPrevious();
			   Node tempNext = removal.getNext();
			   
			   tempPrev.setNext(tempNext);
			   tempNext.setPrevious(tempPrev);
			   removal = null;
		   }
		   
		   size--;
		   System.out.println("Node: " + delete.getName() + " has been deleted.");
		   }
			   
			   
		   }
	   }
	  
   }
       
       
   


