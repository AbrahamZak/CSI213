package bubbleSort;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		//Create our list
		DoublyList testList = new DoublyList();
		
		//Add ten random numbers to the list
		randomFill(10, testList);
		
		//Iterate the list
		testList.iterateForwards();
	}

	/**
	 * Method to fill the list with a specified amount of random integers
	 * that can go upto 100
	 * @param amount
	 * @param list
	 */
	public static void randomFill(int amount, DoublyList list){
		//Create a new random variable
		Random randomNum = new Random(); 
		
		//loop for the specified amount of times
		for (int i=0; i<amount; i++){
			//Continue adding random integers to the list until the user's
			//specified amount is reached
		   int randomResult = randomNum.nextInt(100); 
		   list.add(randomResult);
		}
	}
}
