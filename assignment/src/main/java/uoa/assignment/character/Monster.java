package uoa.assignment.character;

import java.util.Random;

public class Monster extends GameCharacter {

	public Monster(String name) {
		super(name);
	}

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


	public String decideMove () {
		return "move";
	}

}