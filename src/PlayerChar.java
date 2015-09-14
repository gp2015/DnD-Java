public class PlayerChar {

	// Character name setter
	public String name;
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	// Character name getter
	public String getName() {
		return this.name;
	}
	
	// attack method
	public String attack(int AC) {
		DiceRoll Dice = new DiceRoll();
		if (Dice.d(20) >= AC) {
			return "Hits";
		} else {
			return "Misses";
		}
	}
	
	// damage method, 2d6
	public int damage() {
		DiceRoll Dice1 = new DiceRoll();
		int dmg = Dice1.d(6) + Dice1.d(6);
		return dmg;
	}
}