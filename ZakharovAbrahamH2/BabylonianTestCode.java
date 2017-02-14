package babylonianMethod;

public class BabylonianTestCode {

	//Test method for the Babylonian Method Code
	public static void main(String[] args) {
		//Test to find the square root of 100 with an error allowance of 1
		//Should print 10 +- 1
		System.out.println(BabylonianMethod.SquareRoot(100,1));
		
		System.out.println();
		
		//Test to find the square root of 54 with an error allowance of 2
	    //Should print 7.35 +- 2
		System.out.println(BabylonianMethod.SquareRoot(54,2));
		
		System.out.println();
		
		//Test to find the square root of 2938461 with an error allowance of 2000
	    //Should print 1,714.19 +- 2000 
		System.out.println(BabylonianMethod.SquareRoot(2938461,2000));
	}

}
