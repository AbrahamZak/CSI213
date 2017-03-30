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
		
		//Now we will test out methods to move a Stack to a Queue,
		//a Queue to a stack, and a Stack to another Stack
		//Create our test Stack and do some basic testing
		
		//We will create a stack and add some data to it
		Stack A = new Stack();
		A.push("Have");
		A.push("A");
		A.push("Good");
		A.push("Day");
		
		System.out.println();
		
		//Create the queue we will be transferring the stack to
		Queue B = new Queue();
		
		//do the transfer
		stackToQueue(A, B);
		
		System.out.println();
		
		//Print our stack and queue, the stack should be empty the queue should 
		//contain the strings in the following order: Have A Good Day
		A.print();
		B.print();
		
		System.out.println();
		
		//Now we dequeue our queue to make sure that it dequeues in the same order
		//in which our stack popped
		//Should be order: Day->Good->A->Have
		B.dequeue();
		B.dequeue();
		B.dequeue();
		B.dequeue();
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
			if (toQueue.peek() == "Empty Stack"){
				break;
			}
		}
	}
	
	/**
	 * Method to move a queue to a stack
	 * @param toStack
	 * @param fromQueue
	 */
	public static void QueuetoStack(Queue toStack, Stack fromQueue){
		//Loop through the queue until it is empty
		while (toStack !=null){
			//Push the end of the queue, then dequeue the queue
			fromQueue.push(toStack.peek());
			toStack.dequeue();
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
		}
		
		//Loop through the temp stack until it is empty
		while (temp!=null){
			//Push to the second stack then pop from the temp
			b.push(temp.peek());
			temp.pop();
		}
	}

}
