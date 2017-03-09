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
                 Node toAdd = node;
                 size++;
                 current.setNext(toAdd);
                 Node setPrev = new Node(current.getName());
                 current.getNext();
                 current.setPrevious(setPrev);   
    	 }
    		 
    }
    
    /**
     * Start with the head and traverse till you reach null. Print out the data in the nodes.
     */
    public void iterateForwards(){
    	//set a temp node equal to our root
          Node currentNode = root;

          
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
          while (currentNode.getPrevious()!= null){
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
    public int size() {
        return size;
    }
}

