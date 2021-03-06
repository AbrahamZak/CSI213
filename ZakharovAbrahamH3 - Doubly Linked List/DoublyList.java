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
    	 if (node.getName()==null) {
    		 System.out.println("This node is empty");
    		 return;
    	 }
    	 //If the list is empty, add this initial node as both the root and tail
    	 else if (root == null){
    		 size++;
    		 root = node;
    		 tail = node;
    		 return;
    	 }
    	
    	 //If there is already an existing element, find out where this new element belongs
    	 Node previous = null;
    	 Node current = root;
    	 Boolean foundPlace = false;
    	 
    	 while (current.getNext()!=null && foundPlace==false){
    		 if (node.getName().compareTo(current.getName()) < 0){
    			 foundPlace=true;
    			 break;
    		 }
    		 else{
    		 previous = current;
    		 current = current.getNext();
    		 }
    	 }
    	 
    	 //A special exception where we have to switch the second element 
    	 //with the first to place them alphabetically
    	 if (foundPlace == false && current.getNext()==null){
    		 if (node.getName().compareTo(current.getName()) < 0){
    			 foundPlace = true;
    		 }
    	 }
    	 
    	 //If the node we are adding is becoming our new root
    	 if (foundPlace == true && previous == null){
    		 root = node;
    		 node.setNext(current);
    		 current.setPrevious(node);
    		 size++;
    		 return;
    	 }
    	 
    	 //If we are adding the node in between two other nodes
    	 if (foundPlace==true){
    		 previous.setNext(node);
    		 node.setPrevious(previous);
    		 node.setNext(current);
    		 current.setPrevious(node);
    		 size++;
    		 return;
    	 }
    	 
    	//If we didn't find a place to insert this node alphabetically, we place it at the end of our list
    	 else{
    		 current.setNext(node);
    		 node.setPrevious(current);
    		 tail = node;
    		 size++;
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
		   System.out.println("Node: " + delete.getName() + " has been deleted.");
		   size--;
	   }
	   
	   //If the node we're trying to delete is not the root, we continue searching for it
	   else {
		   
		   //A loop that will track down where on the list the node we are looking for is
		   while(current.getNext() != null && current.getNext()!=delete){
			   
			   //If we haven't found it move on to the next node
			   current = current.getNext();
			   
			   //If we reach the end of the list and the node isn't found, let the user know that the node
			   //can't be deleted because it isn't in the list
			   if (current.getNext()==null){
				   System.out.println("Node not found for deletion.");
				   return;
			   }
			   
			   }
		   
		   //If we track the node, set a new node pointing to it called "removal"
		   if (current.getNext()==delete){
		   Node removal = current.getNext();
		   
		   //If the node we are trying to remove is the tail
		   if (tail==removal){
			   
			   //Set the previous node to the tail, and empty out the data in the old tail
			   Node tempPrev = removal.getPrevious();
			   removal = null;
			   tail = tempPrev;
		   }
		   
		
		   //If it is not the tail
		   if (tail!=removal){
			   
			   //We set pointers to the previous node and the next node
			   Node tempPrev = removal.getPrevious();
			   Node tempNext = removal.getNext();
			   
			   //Remove useless data from our node to delete, while connecting its previous and next nodes to each other
			   tempPrev.setNext(tempNext);
			   tempNext.setPrevious(tempPrev);
			   removal = null;
		   }
		   
		   //In any case we decrease size by 1 and let the user know which node we deleted
		   size--;
		   System.out.println("Node: " + delete.getName() + " has been deleted.");
		   }
			   
			   
		   }
	   }
	  
   }
       
       
   


