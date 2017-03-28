package stacksAndQueuesADT;

public class Queue {

	//Our initial node (which starts empty)
    private Node front = null;
    private Node back = null;
    
    /**
     * Method to add a node to the beginning of our queue
     * @param add
     */
    public void enqueue(String add) {
    //Create the node we will be adding from the string given
   	 Node newNode = new Node (add);
   	 
   	//If the queue is empty, add this initial node as the front
  	     if (front == null){
  		 front = newNode;
  		 back = newNode;
  		 System.out.println("enqueue (" + add + ")");
  	     }
  	     
  	     //If the queue is not empty, make the new node the front
  		 else{
  			newNode.setNext(front);
  			front = back;
   			front = newNode;
  			System.out.println("enqueue (" + add + ")");
  		 }	  
    	
   	  }
    
    /**
     * Method to remove the node at the end of our queue
     */
    public void dequeue() {
    	//If there is only one item in our queue, remove that one item
    	if (front.getNext()==null){
    		System.out.println("dequeue (" + front.getName() + ")");
    		front = null;
    		back = null;
    		return;
    	}
    	
    	//If there is more than one item, iterate our queue until we reach the end and
    	//remove that item from the queue
    	else{
    		System.out.println("dequeue (" + back.getName() + ")");
    		
    		//set a temp node equal to our front
            Node currentNode = front;
            
            //Iterate the queue until we reach the node before the end of the list
            while(currentNode.getNext()!= back){
            	currentNode = currentNode.getNext();
            }
            
            //Replace the last node on our queue with the one right before it
            currentNode.setNext(null);
            back = currentNode;
            
    		
    	}
    }
    
    /**
     * Method to get the data from the end of our queue
     */
    public String peek(){
    	//If there is only one item in our queue, return the data from it
    	if (front.getNext()==null){
    		return front.getName();
    	}
    	
    	//Otherwise return the back node
    	else{
    		return back.getName();
    	}
    }
    
    /**
     * Method to iterate the queue and print its contents
     */
    public void print(){
    	//set a temp node equal to our front
        Node currentNode = front;
        
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
