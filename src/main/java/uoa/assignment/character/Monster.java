package uoa.assignment.character;

import java.util.Random;

public class Monster extends GameCharacter {

	public Monster(String name) {
		super(name);
	}

<<<<<<< HEAD
	@Override
	public void hurtCharacter(GameCharacter character) {
		int healthValue = character.getHealth();
		if (!character.successfulDefense()) {
			healthValue -= 20;
			character.setHealth(healthValue);
		}
	}

	@Override
	public boolean successfulDefense() {
		Random random = new Random();
		boolean defenseResult = random.nextBoolean();
		return defenseResult;

	}


=======

	public void hurtCharacter(GameCharacter character) {
		
	}

	
	public boolean successfulDefense() {
		Random random = new Random();
        boolean defenseResult = random.nextBoolean();
        if (defenseResult == false) {
            int healthValue = getHealth();
            healthValue = healthValue - 20;
            setHealth(healthValue);
            return false;
        } else {
            return true;
        }
	}


	
>>>>>>> 83c112b30a4c1b325845554430821161ed5a8f92
	public String decideMove () {
		return "move";
	}

<<<<<<< HEAD
}
=======
}
>>>>>>> 83c112b30a4c1b325845554430821161ed5a8f92
