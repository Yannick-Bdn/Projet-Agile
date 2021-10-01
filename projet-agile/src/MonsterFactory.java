package projet.agile.gr3;

public class MonsterFactory {
	
	//retourne les 3 noms de monstre du stage
	public static String[] getMonster (int palier) {
		String[] tab = new String[3];
		NameMonster[] mob = NameMonster.values();
		for (int i = 0; i < tab.length; i++) {
			int ord=i+palier*3-3 ;
			if (ord>mob.length-1) {
				ord=mob.length-1;
			}
			tab[i]=""+mob[ord].name();
		}
		
		return tab;
	}
	
	//retourne les 1 noms de monstre aléatoirement du stage
	public static NameMonster getMonsterRan (int stage) {
		String[] tab = getMonster(stage);
		return NameMonster.valueOf(tab[AskAndDisplay.getRandomNumberInRange(0,2)]);
	}
	
	//crée un monstre avec des statistique aléatoire
	public static Monster createMonster (int y, int x, int levelmap) {
		NameMonster nom = MonsterFactory.getMonsterRan(levelmap);
		String f=null,r=null;
		if(nom.getTauxResM()>nom.getTauxResP()) {
			f="physique";
			r="magique";
		}else if(nom.getTauxResP()>nom.getTauxResM()) {
			f="magique";
			r="physique";
		}
		Monster m = new Monster(y,x,levelmap,nom.name(),AskAndDisplay.getRandomNumberInRange(5, 10)+levelmap*2, AskAndDisplay.getRandomNumberInRange(0, 2)+levelmap,
				AskAndDisplay.getRandomNumberInRange(0, 2)+levelmap,f,r,nom.getTauxResM(),nom.getTauxResP(),nom.tauxAtkP);
		return m;
	}
}

