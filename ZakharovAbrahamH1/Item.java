package rolePlayingGame;

//We create our main class Item which includes the variables for the name of the item,
//the weight of the item, and the description for when we want to 'examine' the item
public class Item {
public String name;
public int weight;
public String description;

public Item (String nameOfItem, int weightOfItem, String descriptionOfItem){
	name = nameOfItem;
	weight = weightOfItem;
	description = descriptionOfItem;
}

//Method to retrieve the item's name
public String getName(){
	return name;
}

//Method to retrieve the item's weight
public int getWeight(){
	return weight;
}

//Method to retrieve the item's description
public String examine(){
	return "The " + name + " " + description + " It weighs " + weight + ".";
}
}
