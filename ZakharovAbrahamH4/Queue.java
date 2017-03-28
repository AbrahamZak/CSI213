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
  		 System.out.println("enqueue (" + add + ")");
  	     }
  	     
  	     //If the queue is not empty, make the new node the root
  		 else{
  			 newNode.setNext(root);
  			 root = newNode;
  			System.out.println("enqueue (" + add + ")");
  		 }	  
    	
   	  }
    
    /**
     * Method to remove the node at the end of our queue
     */
    public void dequeue() {
    	//If there is only one item in our queue, remove that one item
    	if (root.getNext()==null){
    		System.out.println("dequeue (" + root.getName() + ")");
    		root = null;
    		return;
    	}
    	
    	//If there is more than one item, iterate our queue until we reach the end and
    	//remove that item from the queue
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
    		
    		//Once we are looking at the last node of the list,
    		//set that node equal to null
    		System.out.println("dequeue (" + currentNode.getName() + ")");
    		currentNode = null;
    
    	}
    }
    
    
}
