package projet.agile.gr3;

public class MaindeTest {
	public static void main(String[] args) {
		Monster m1 = new Monster(0, 0, 1, "Devil", 5, 2, 2, "magique", null);
		Player p1 = new Player(0, 0, 0, "Player");
		p1.inventory.add(Items.BATTLE_AXE);
		
		while(m1.vie>0) {
			System.out.println("\n\n\n\n\n\n\n\n\n");
			System.out.println("vie du monstre : "+m1.vie+" faiblesse : "+m1.getFaiblesse() + " resistance : "+m1.getResistance());
			p1.action(m1);
		}
		if (m1.vie<=0) {
			System.out.println("monstre est mort");
		}
	}
	
}
