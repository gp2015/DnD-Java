import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		// Player naming character
		PlayerChar player = new PlayerChar();
		Scanner in = new Scanner(System.in);
		System.out.println("Name your character: ");
		String charName = in.nextLine();
		in.close();
		player.setName(charName);
		String playerName = player.getName();
		
		// Combat variable init
		int dmg = player.damage();
		
		// Monster init
		Werewolf monster1 = new Werewolf();
		String monster1Name = monster1.getName();
		
		Wererat monster2 = new Wererat();
		String monster2Name = monster2.getName();
		
		String combatResult = player.attack(monster2.ac);
		int monster2dmgTaken = monster2.calcHp(dmg);
		
		if (combatResult == ("Hits")) {
			System.out.println(playerName + " attacks " + monster2Name + " and " + combatResult + "!" + " " + monster2Name + " takes " + dmg + " damage and has " + monster2dmgTaken + " HP remaining!");
		} else {
			System.out.println(playerName + " attacks " + monster2Name + " and " + combatResult + "!");
		}
		
		monster2.resetHp();
		
		Wererat wererat1 = new Wererat();
		printer("Hello, I'm a " + wererat1.getName());
		//System.out.println(wererat1.getName());
	}
	
        public static void printer(Object obj) {
        	System.out.println(obj.toString());
        }
}
