public class Monster {

	protected String name;
	protected int ac;
	protected int maxHp;
	protected int hp;

	public Monster(String name, int ac, int maxHp) {
		this.name = name;
		this.ac = ac;
		this.maxHp = hp;
		this.hp = this.maxHp;
	}

	// getters
	public String getName() {
		return this.name;
	}

	public int getAc() {
		return this.ac;
	}

	public int getHp() {
		return this.hp;
	}

	public int getMaxHp() {
		return this.maxHp;
	}

	//setters
	public void setName(String name) {
		this.name = name;
	}

	public void setAc(int ac) {
		this.ac = ac;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	// methods
	public int calcHp(int dmg) {
		this.hp -= dmg;
		return this.hp;
	}

	public void resetHp() {
		this.hp = maxHp;
	}
}
