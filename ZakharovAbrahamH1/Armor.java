package rolePlayingGame;

//This is one type of item called armor, which has all qualities of item along with a defense integer
public class Armor extends Item {

	private int defense;
	
	//inherits variables from Item and adds defense
	public Armor(String nameOfItem, int weightOfItem, String descriptionOfItem, int defenseOfArmor) {
		super(nameOfItem, weightOfItem, descriptionOfItem);
		defense = defenseOfArmor;
	}
	
	//Method to change the amount of defense
		public void setDefense(int defenseChange){
			defense = defenseChange;
		}
		
		//Method to retrieve the weapon's defense
		public int getDefense(){
			return defense;
		}
}
