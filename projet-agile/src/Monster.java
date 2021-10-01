package projet.agile.gr3;


public class Monster extends Entity {
	private double tauxAtkP;
	
	public Monster(int y, int x, int levelmap, String name, int vie, int degatsMagiques, int degatsPhysiques,String faiblesse, String resistance, double tauxResM, double tauxResP, double tauxAtkP) {
		super(y, x, levelmap, name, vie, degatsMagiques, degatsPhysiques,faiblesse,resistance, tauxResM, tauxResP);
		this.tauxAtkP=tauxAtkP;
	}
	
	//methode action rand magique/physique
	
	
	
	
	public static void main(String[] args) {
		Monster m= MonsterFactory.createMonster(0, 0, 9);
		System.out.println(m.toString());
		
		String[] tab=MonsterFactory.getMonster(9);
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
	}
	
	
}
