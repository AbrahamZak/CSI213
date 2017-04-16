package bubbleSort;

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
    public void add(int insert) { 
    	//Create a node from our int
    	Node node = new Node(insert);
    	
    	 //If the list is empty, add this initial node as both the root and tail
    	 if (root == null){
    		 size++;
    		 root = node;
    		 tail = node;
    		 return;
    	 }
    	
    	 //If not, add to the end of the list
    	 else{
    		//set a temp node equal to our root
             Node currentNode = root;
             
             //Continue looping through the list until we get to the end,
             while(currentNode.getValue()!=0)
             {
           	  
           	  //If the next node is empty we break the loop
           	  if (currentNode.getNext()==null){
           		  break;
           	  }
           	  
           	  //Get the next node
                 currentNode = currentNode.getNext();
             }
             //Set the node we're adding to the end of the list
             currentNode.setNext(node);
             node.setPrevious(currentNode);
             tail=node;
             //Increase size by 1
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
          if (currentNode.getValue()==0){
        	  System.out.println("The list is empty.");
        	  return;
          }
          
          //Continue looping through the list until we get to the end,
          //printing each node in the process
          while(currentNode.getValue()!=0)
          {
        	  //Print the current node
        	  System.out.println(currentNode.getValue());
        	  
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
          while (currentNode!=null){
        	  
        	//Print the current node
        	  System.out.println(currentNode.getValue());
        	  
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
   public boolean findNode(int search){
	   //Make a temp node called checker (copy of our root)
	   Node checker = root;
	   
	   //If the very first node is equal to the one we are searching for, return true
	   if(checker.getValue() == search) {
		   return true;
	   }
	   //Otherwise search the entire list for a matching node
	   else {
	   while(checker.getNext() != null){
		   checker = checker.getNext();
		   if (checker.getValue() == search) {
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
		   System.out.println("Node: " + delete.getValue() + " has been deleted.");
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
		   System.out.println("Node: " + delete.getValue() + " has been deleted.");
		   }
			   
			   
		   }
	   }
   /**
    * Method to Bubble Sort the list
    */
   public void bubbleSort(){
	   //Create a boolean that will turn true once our list is sorted
	   boolean isSorted = false;
	   
	   //set a temp node equal to our root
       Node currentNode = root;
       
       //Create a counter for our loop, our loop only needs to execute as much as
       //the size of the list
       int counter = 0;
       
       //Continue looping until we've looped the amount of times as the size of the list
       while (counter != size){
    	   
    	   //If we hit the tail, start from the beginning, add 1 to the counter
    	   if (currentNode == tail){
			   currentNode = root;
			   counter++;
		   }  
    	   
    	   //Check if the current node's value is greater than the next node
    	   //If it is, swap them
    	   if (currentNode.getValue()>currentNode.getNext().getValue()){
    		   int tempValue = currentNode.getValue();
    		   currentNode.setValue(currentNode.getNext().getValue());
    		   currentNode.getNext().setValue(tempValue);
    	   }
    	   
    	   //As long as we aren't at the tail, we keep going to the next node
    		   if (currentNode != tail){
    			   currentNode = currentNode.getNext();
    		   }
    		   
    		   
    		   
    		  
    	   }
    	   
       }
   }
	  
   
       
       
   


