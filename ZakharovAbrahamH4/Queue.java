package stacksAndQueuesADT;

public class Queue {

	//Our initial node (which starts empty)
    private Node top = null;
    
    /**
     * Method to add a node to the beginning of our queue
     * @param add
     */
    public void enqueue(String add) {
    //Create the node we will be adding from the string given
   	 Node newNode = new Node (add);
   	 
   	//If the queue is empty, add this initial node as the top
  	     if (top == null){
  		 top = newNode;
  		 System.out.println("enqueue (" + add + ")");
  	     }
  	     
  	     //If the queue is not empty, make the new node the top
  		 else{
  			 newNode.setNext(top);
  			 top = newNode;
  			System.out.println("enqueue (" + add + ")");
  		 }	  
    	
   	  }
    
    /**
     * Method to remove the node at the end of our queue
     */
    public void dequeue() {
    	//If there is only one item in our queue, remove that one item
    	if (top.getNext()==null){
    		System.out.println("dequeue (" + top.getName() + ")");
    		top = null;
    		return;
    	}
    	
    	//If there is more than one item, iterate our queue until we reach the end and
    	//remove that item from the queue
    	else{
    		//set a temp node equal to our top
    		Node currentNode = top;
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
    
    /**
     * Method to get the data from the end of our queue
     */
    public String peek(){
    	//If there is only one item in our queue, return the data from it
    	if (top.getNext()==null){
    		return top.getName();
    	}
    	
    	//Otherwise iterate the list until we reach the end and return the data
    	//from the last node in the list
    	else{
    		//set a temp node equal to our top
    		Node currentNode = top;
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
    		//return the data from that node
    		return currentNode.getName();
    	}
    }
    
    /**
     * Method to iterate the queue and print its contents
     */
    public void print(){
    	//set a temp node equal to our top
        Node currentNode = top;
        
        //If the queue is empty, let the user know you can't iterate it
        if (currentNode==null){
      	  System.out.println("The list is empty.");
      	  return;
        }
        
        //Continue looping through the queue until we get to the end,
        //printing each node in the process
        System.out.print("Queue: ");
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
