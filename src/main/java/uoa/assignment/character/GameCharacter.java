package uoa.assignment.character;

public abstract class GameCharacter {
    
	private String name ="";
	
	private int health = 100; 
	
	public int row;
	public int column;
<<<<<<< HEAD


=======
	
	
>>>>>>> 83c112b30a4c1b325845554430821161ed5a8f92
	public GameCharacter (String name) {
		this.name = name;
	}
	
	public abstract void hurtCharacter (GameCharacter character);
	
	public abstract boolean successfulDefense ();
<<<<<<< HEAD

=======
	
	
>>>>>>> 83c112b30a4c1b325845554430821161ed5a8f92
	public String sayName() {
	return name; 
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
}

