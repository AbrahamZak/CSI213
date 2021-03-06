package stacksAndQueuesADT;

public class Main {

	public static void main(String[] args) {
		//Create our test Stack and do some basic testing
		Stack testStack = new Stack();
		//Push the strings "Hello" and "Goodbye" to our test stack
		testStack.push("Hello");
		testStack.push("Goodbye");
		//Print our stack to check if both were added correctly
		testStack.print();
		//Peek our stack, should return "Goodbye" since this is at the top of our stack
		System.out.println(testStack.peek());
		//Pop the top of the stack leaving only Hello
		testStack.pop();
		//Peek our stack, should return "Hello"
		System.out.println(testStack.peek());
		//Print our stack, should only contain the string "Hello"
		testStack.print();
		
		System.out.println();
		
		//Create our test Queue and do some basic testing
		Queue testQueue = new Queue();
		//Enqueue the strings "Holla" and "Adios" to our test stack
		testQueue.enqueue("Holla");
		testQueue.enqueue("Adios");
		//Print our queue to check if both were added correctly
		testQueue.print();
		//Peek our queue, should return "Hola", since this is at the end of our queue
		System.out.println(testQueue.peek());
		//Dequeue our stack leaving only Adios
		testQueue.dequeue();
		//Peek our queue, should return "Adios", since this is at the end of our queue
		System.out.println(testQueue.peek());
		//Print our Queue, should only contain string "Adios"
		testQueue.print();
		
		System.out.println();
		
		//Now we will test out the method to move a Stack to a Queue
		
		//We will create a stack and add some data to it
		Stack stack = new Stack();
		stack.push("Have");
		stack.push("A");
		stack.push("Good");
		stack.push("Day");
		
		System.out.println();
		
		//Create the queue we will be transferring the stack to
		Queue queue = new Queue();
		
		//do the transfer
		//We keep in mind that the stack will pop in the order:
		//Day Good A Have, so our final queue should dequeue in that same order
		stackToQueue(stack, queue);
		
		System.out.println();
		
		//Print our stack and queue, the stack should be empty the queue should 
		//contain the strings in the following order: Have A Good Day
		stack.print();
		queue.print();
		
		System.out.println();
		
		//Now we dequeue our queue to make sure that it dequeues in the same order
		//in which our stack popped
		//Should be order: Day->Good->A->Have
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();

		//TEST COMPLETE
		System.out.println();
		
		//Now we will test out the method to move a Queue to a Stack
		queue.enqueue("Eight");
		queue.enqueue("Days");
		queue.enqueue("A");
		queue.enqueue("Week");
		
		System.out.println();
		
		//Print our stack and queue, the stack should be empty the queue should 
		//contain the strings in the following order: Week A Days Eight
		stack.print();
		queue.print();
				
		System.out.println();
		
		//do the transfer
		//We keep in mind that the queue will dequeue in the order:
		//Eight Days A Week, so our final stack should pop in that same order
		queueToStack(queue, stack);
				
		System.out.println();
				
		//Print our stack and queue, the queue should be empty the stack should 
		//contain the strings in the following order: Eight Days A Week
		stack.print();
		queue.print();
				
		System.out.println();
		
		//Now we pop our stack to make sure that it pops in the same order
		//in which our queue dequeued
		//Should be order: Eight->Days->A->Week
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		//TEST COMPLETE
		System.out.println();
		
		//Now we will test out the method to move a Stack to another Stack
		//First, we create a second stack and add some data to our first stack
		stack.push("Stacks");
		stack.push("Making");
		stack.push("I'm");
		
		Stack stackTwo = new Stack();
		
		System.out.println();
	
		//Print our stacks, our original stack should be I'm Making Stacks
		//while our second should be empty
		stack.print();
		stackTwo.print();
		
		System.out.println();
		
		//We do the transfer, keeping in mind that our first stack
		//will pop in the order of: I'm Making Stacks
		stackToStack(stack,stackTwo);
		
		System.out.println();
		
		//Print our stacks, our original stack should be empty 
		//while our second should be I'm Making Stacks
		stack.print();
		stackTwo.print();
		
		System.out.println();
		
		//Note: Since they are both stacks and both have the same strings
		//in the same order we do not have to pop the second stack to
		//check if it will pop the same way as the first
		
		//TEST COMPLETE
		
	}
	/**
	 * Method to move a stack to a queue
	 * @param toQueue
	 * @param fromStack
	 */
	public static void stackToQueue(Stack toQueue, Queue fromStack){
		//Loop through the stack until it is empty
		while (toQueue != null){
			//Enqueue the top of the stack, then pop the stack
			fromStack.enqueue(toQueue.peek());
			toQueue.pop();
			//If the Stack is empty, end the loop
			if (toQueue.peek() == "Empty Stack"){
				System.out.println("Transfer Complete");
				break;
			}
		}
	}
	
	/**
	 * Method to move a queue to a stack
	 * @param toStack
	 * @param fromQueue
	 */
	public static void queueToStack(Queue toStack, Stack fromQueue){
		//Since queues are FIFO we need to first move our first stack to a temp stack
		//Then move that temp stack into our stack
		Stack temp = new Stack();
		
		//Loop through the queue until it is empty
		while (toStack !=null){
			//Push the end of the queue, then dequeue the queue
			temp.push(toStack.peek());
			toStack.dequeue();
			//If the Queue is empty, end the loop
			if (toStack.peek() == "Empty Queue"){
				break;
			}
		}
		
		while (temp!=null){
			//Push to the second stack then pop from the temp
			fromQueue.push(temp.peek());
			temp.pop();
			//If the stack is empty, end the loop
			if (temp.peek() == "Empty Stack"){
				System.out.println("Transfer Complete");
				break;
			}
		}
	}

	/**
	 * Method to move one stack to another stack
	 * @param a
	 * @param b
	 */
	public static void stackToStack(Stack a, Stack b){
		//Since stacks are LIFO we need to first move our first stack to a temp stack
		//Then move that temp stack into our second stack
		Stack temp = new Stack();
		
		//Loop through the first stack until it is empty
		while (a!=null){
			//Push to the temp stack then pop from the original
			temp.push(a.peek());
			a.pop();
			//If the stack is empty, end the loop
			if (a.peek() == "Empty Stack"){
				break;
			}
		}
		
		//Loop through the temp stack until it is empty
		while (temp!=null){
			//Push to the second stack then pop from the temp
			b.push(temp.peek());
			temp.pop();
			//If the stack is empty, end the loop
			if (temp.peek() == "Empty Stack"){
				System.out.println("Transfer Complete");
				break;
			}
		}
	}

}
