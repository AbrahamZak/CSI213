package rolePlayingGame;

//This is one type of item called weapon, which has all qualities of item along with a damage integer
public class Weapon extends Item {
	
	private int damage;

	//inherits variables from Item and adds damage
	public Weapon(String nameOfItem, int weightOfItem, String descriptionOfItem, int damageOfWeapon) {
		super(nameOfItem, weightOfItem, descriptionOfItem);
		damage = damageOfWeapon;
	}
	
	//Method to change the amount of damage
	public void setDamage(int damageChange){
		damage = damageChange;
	}
	
	//Method to retrieve the weapon's damage
	public int getDamage(){
		return damage;
	}
}
