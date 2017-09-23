package babylonianMethod;

public class BabylonianTestCode {

	//Test method for the Babylonian Method Code
	public static void main(String[] args) {
		//Test to find the square root of 100 with an error allowance of 1
		//The number it prints squared should be 100 +- 1
		System.out.println(BabylonianMethod.SquareRoot(100,1));
		//It ends up printing 9.99... which squared = approximately 99.8
		
		System.out.println();
		
		//Test to find the square root of 54 with an error allowance of 2
		//The number it prints squared should be 54 +- 2
		System.out.println(BabylonianMethod.SquareRoot(54,2));
		//It ends up printing 7.21... which squared = approximately 52.02
		
		System.out.println();
		
		//Test to find the square root of 2,938,461 with an error allowance of 300
		//The number it prints squared should be 2938461 +- 300
		System.out.println(BabylonianMethod.SquareRoot(2938461,300));
		//It ends up printing 1714.27... which squared = approximately 2,938,721.63
	}

}
