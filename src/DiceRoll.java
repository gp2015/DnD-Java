public class DiceRoll {
	
	public int d(int sides) {
		float rand = (float) Math.random();
		float dice = rand * sides;
		int roll = (int) Math.ceil(dice);
		return roll;
	}
	
}