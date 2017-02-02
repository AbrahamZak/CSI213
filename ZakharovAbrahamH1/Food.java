package rolePlayingGame;

//This is one type of item called food, which has all qualities of item along with 
//a nutrition value and a quantity value

public class Food extends Item {

	public int quantity;
	public int nutrition;
	
	//inherits variables from Item and adds quantity and nutrition
	public Food(String nameOfItem, int weightOfItem, String descriptionOfItem, int nutritionOfFood, int quantityOfFood) {
		super(nameOfItem, weightOfItem, descriptionOfItem);
		quantity = quantityOfFood;
		nutrition = nutritionOfFood;
	}
	
	//Method to retrieve the food's nutrition
	public int getNutrition(){
		return nutrition;
	}
	
	//Method to retrieve the food's quantity
	public int getQuantity(){
		return quantity;
	}
	
	//Method to set the food's quantity
	public void setQuantity(int quantityChange){
		quantity = quantityChange;
	}
}
