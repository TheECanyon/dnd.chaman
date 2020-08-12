public class Char {
	
	//Properties
	String name;
	
	
	//Maybe via 'stats'-array + iteration? -> enables configurability
	int strength;
	int dex;
	int con;
	int intelligence;
	int wisdom;
	int charisma;
	
	int strmod = (strength - 10)/2;
	int dexmod = (dex - 10)/2;
	int conmod = (con - 10)/2;
	int intmod = (intelligence - 10)/2;
	int wismod = (wisdom - 10)/2;
	int charmod = (charisma - 10)/2;
	
	int speed;
	int init = dexmod;
	int armorclass;
	int profbonus;
	
	Charclass charclass;
	Race race;
	
	public void ausgabe() {
		System.out.println("Dies ist eine Testmethode zur Ausgabe. Es sind ");
	}
	
}
