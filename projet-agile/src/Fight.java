package projet.agile.gr3;

public class Fight {
	public static boolean Combat(Player p, Monster m) {
		boolean alive;
		int tour=0;
		do{
			AskAndDisplay.clearScreen();
			Ath(p, m, tour);
			p.action(m);
			
			if (m.getAlive()) {
				m.action(p, "physique");
			}else {
				System.out.println();
			}
			alive = p.getAlive() && m.getAlive();
			tour++;
		}while(alive);	
		
		if (p.getAlive()) {
			System.out.println(p.name + " a vaincu " + m.name);
			return true;
		}else {
			System.out.println(p.name + " a été dévoré par " + m.name);
			return false;
		}
	}
	
	
	
	public static void Ath(Entity e1, Entity e2, int tour) {
		for (int i = 0; i <= 50; i++) {
			System.out.print("-");
			
		}
		System.out.println("\nTour : " + tour);
		System.out.println("vie du joueur : "+e1.getVie());
		System.out.println("vie du monstre : "+e2.getVie()+" faiblesse : "+e2.getFaiblesse() + " resistance : "+e2.getResistance());
		System.out.println("\n\n\t\t\t\t\t"+e2.getName()+"\n\n\n"+"\t\t\tVS"+"\n\n\n\t"+e1.getName()+"\n\n");
	}
	
	public static void main(String[] args) {
		Monster m1 = new Monster(0, 0, 1, "Devil", 5, 12, 12, "magique", null);
		Player p1 = new Player(0, 0, 0, "Player");
		
		Combat(p1,m1);
	}
}
