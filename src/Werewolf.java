public class Werewolf {
	
	public String getName() {
		return this.getClass().getSimpleName();
	}
	
	int AC = 20;
	int HP = 108;
	
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
	
	public void Greatclub(){
		System.out.println("Greatclubbed!");
	}
	
}