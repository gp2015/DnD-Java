public class Wererat {
	
	public String getName() {
		return this.getClass().getSimpleName();
	}	
	
	int AC = 17;
	int HP = 48;
	
	public int getAC() {
		return this.AC;
	}
	
	public int getHP() {
		return this.HP;
	}
	
	public int calcHP(int dmg) {
		HP -= dmg;
		return this.HP;
	}
	
	public void resetHP() {
		this.HP = 48;
	}
	
	public void ShortSword(){
		System.out.println("ShortSworded!");
	}
	
}