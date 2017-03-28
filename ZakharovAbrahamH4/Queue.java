package stacksAndQueuesADT;

public class Queue {

	//Our initial node (which starts empty)
    private Node root = null;
    
    /**
     * Method to add a node to the beginning of our queue
     * @param add
     */
    public void enqueue(String add) {
    	
    	//Create the node we will be adding from the string given
    	 Node newNode = new Node (add);
    	 
    	//If the queue is empty, add this initial node as the root
   	     if (root == null){
   		 root = newNode;
   	     }
   	     
   	     //If the queue is not empty, place the new node at the end of the list
   		 else{
   			 
   		//set a temp node equal to our root
   			Node currentNode = root;
   			
   		//Continue looping through the queue until we get to the end	
   		 while(currentNode.getName()!= null)
         {

       	  //If the next node is empty we break the loop
       	  if (currentNode.getNext()==null){
       		  break;
       	  }
       	  
       	  //Get the next node
             currentNode = currentNode.getNext();
         }
   		 
   		 //Set our new node to the last node in the queue
   		 currentNode.setNext(newNode);
   		 }	  
   	  }
}
