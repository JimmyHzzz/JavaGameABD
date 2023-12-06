package uoa.assignment.character;

import java.util.Random;

public class Player extends GameCharacter{

	public Player(String name) {
		super(name);
	}

<<<<<<< HEAD
	@Override
	public void hurtCharacter(GameCharacter character) {
		if (!character.successfulDefense()) {
			int healthValue = character.getHealth();
			healthValue = healthValue - 50;
			character.setHealth(healthValue);
		}
	}

	@Override
	public boolean successfulDefense() {
		Random random = new Random();
		float successProbability = 0.3f;
		boolean defenseResult = random.nextFloat() < successProbability;
		return defenseResult;

	}
}
=======
	
	public void hurtCharacter(GameCharacter character) {
		
	}

	
	public boolean successfulDefense() {
		return true;
	}

}
>>>>>>> 83c112b30a4c1b325845554430821161ed5a8f92
