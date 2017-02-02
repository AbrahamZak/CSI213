package rolePlayingGame;

public class TestCode {

	//This is test code that will check all methods of all types of items
	public static void main(String[] args) {
		
		//2 test weapons, sword and bow
		//Name, weight, description, damage
		Weapon sword = new Weapon ("Sword",10,"is the main weapon of a warrior.", 5);
		Weapon bow = new Weapon ("Bow", 3, "is the weapon of choice for a hunter.", 3);
		
		//test armor
		//Name, weight, description, defense
		Armor steelArmor = new Armor ("Steel Armor", 25, "is sturdy armor for a warrior class.", 10);

		//test food, apple and cake
		//Name, weight, description, nutrition, quantity
		Food apple = new Food ("Apple", 1, "is a wonderful snack for anytime.", 3, 5);
		Food cake = new Food ("Cake", 2, "is delicous, what a treat!", 10, 2);
		
		//testing getName method
		System.out.println(sword.getName());
		System.out.println(bow.getName());
		System.out.println(steelArmor.getName());
		System.out.println(apple.getName());
		System.out.println(cake.getName());
		
		System.out.println();
		
		//testing getWeight method
		System.out.println(sword.getWeight());  //10
		System.out.println(bow.getWeight());    //3
		System.out.println(steelArmor.getWeight());  //25

		System.out.println();
		
		//these should return weight * quantity which will be 5 & 4
		System.out.println(apple.getWeight());
		System.out.println(cake.getWeight());

		System.out.println();
		
		//testing examine method
		System.out.println(sword.examine());
		System.out.println(bow.examine());
		System.out.println(steelArmor.examine());

		System.out.println();
		
		//these should go back to returning the weight of a single unit which will be 1 & 2
		System.out.println(apple.examine());
		System.out.println(cake.examine());

		System.out.println();
		
		//testing getDamage method and setDamage
		System.out.println(sword.getDamage());  //5
		System.out.println(bow.getDamage());    //3
		sword.setDamage(15);
		System.out.println(sword.getDamage());   //15

		System.out.println();
			
		//testing getDefense method and setDefense
		System.out.println(steelArmor.getDefense());  //10
		steelArmor.setDefense(30);
		System.out.println(steelArmor.getDefense());  //30

		System.out.println();
		
		//testing getNutrition
		System.out.println(apple.getNutrition());  //3
		System.out.println(cake.getNutrition());  //10

		System.out.println();
		
		//testing changing quantity and then viewing weight
		System.out.println(apple.getWeight());  //should be 1 * 5 = 5
		apple.setQuantity(25);
		System.out.println(apple.getWeight());  //should be 1 * 25 = 25	

		System.out.println();
		
		System.out.println(cake.getWeight());  //should be 2 * 2 = 4
		cake.setQuantity(7);
		System.out.println(cake.getWeight());  //should be 2 * 7 = 14		
	}

}
