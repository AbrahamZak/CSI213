package babylonianMethod;

public class BabylonianMethod {


public static double SquareRoot(double squareRoot, double errorAmount){
	return BabylonianMath(squareRoot, squareRoot/2, errorAmount);
}

public static double BabylonianMath (double squareRoot, double testNumber, double errorAmount){
	if ((testNumber*testNumber)-errorAmount<squareRoot  && squareRoot<(testNumber*testNumber)+errorAmount){
	return testNumber;
	}
	return BabylonianMath (squareRoot, ((testNumber+squareRoot)/testNumber)*0.5, errorAmount);
}
}
