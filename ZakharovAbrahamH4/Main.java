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
	}

}
