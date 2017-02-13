package babylonianMethod;

public class BabylonianTestCode {

	public static void main(String[] args) {
		
		//Creates our test object, we will be looking for the square root of
		//100 with a percent error of 0%
		BabylonianMethod testRoot = new BabylonianMethod (100,0);
		//Prints the result of the Babylonian method, should be 10
		System.out.println(testRoot.SquareRoot());

		//Creates our test object, we will be looking for the square root of
		//27 with a percent error of 15%
		BabylonianMethod testRootTwo = new BabylonianMethod (27,15);
		//Prints the result of the Babylonian method, should be 5.2 +- 15%
		System.out.println(testRoot.SquareRoot());
	}

}
