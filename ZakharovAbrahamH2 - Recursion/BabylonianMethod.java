package babylonianMethod;

public class BabylonianMethod {

/**
 * Initial method that starts the recursive function
 * @param squareRoot
 * @param errorAmount
 * @return BabylonianMath(squareRoot, squareRoot/2, errorAmount)
 */
public static double SquareRoot(double squareRoot, double errorAmount){
	return BabylonianMath(squareRoot, squareRoot/2, errorAmount);
}

/**
 * Recursive method that will test if our number divided by 2 is the square root
 * If not it will recursively call itself and test the 
 * ((testnumber+squareroot number)/testnumber) *0.5
 * This will continue until the result is within the error amount specified
 * @param squareRoot
 * @param testNumber
 * @param errorAmount
 * @return testNumber
 */
public static double BabylonianMath (double squareRoot, double testNumber, double errorAmount){
	if ((testNumber*testNumber)-errorAmount<squareRoot  && squareRoot<(testNumber*testNumber)+errorAmount){
		return testNumber;
	}
	return BabylonianMath (squareRoot, ((testNumber+squareRoot)/testNumber)*0.5, errorAmount);
}
}
