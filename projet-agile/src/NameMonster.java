package projet.agile.gr3;

public enum NameMonster {
	CHICKEN	 (1,1,1) 			,RAT	(1, 1.5 ,1) 		,BAT(0.5,1,2) 			,VIPER(0.1,2,0.5)	,BEAR(0.9,1,0.75), 
	SCORPION (0.1,1.5,1)		,SPIDER	(0.2,0.75,1) 		,SKELETON(0.9,1.25,0.75),GOBLIN(0.5,1,1.5), 
	TROLL	 (0.7,1,0.5)		,MUMMY 	(0.8,0.5,1)			,GHOST(0.3,0.25,1.5) 	,GHOUL(0.8,1.25,0.75),
	DARK_ELF (0.1,0.25,1.5) 	,GRIFFIN(0.7,1.25,0.5)		,ORC(1,1,1) 			,ENT(0.2,0.25,2),
	GOLEM    (0.5,0.5,0.5)		,WYVERN	(0.8,0.75,1)		,WIZARD(0,0.5,1.5)		,DRAGON(0.8,0.5,1),
	GIANT    (1,0.25,0.75)		,HYDRA	(0.8,0.25,1)		,DEVIL(0,0.75,0.25)		,DEATH_ANGEL(0.5,0.25,0.25);
	//25 Monstres 
	
	NameMonster(double tauxAtkP,double tauxResP,double tauxResM) {
		this.tauxAtkP=tauxAtkP;
		this.tauxResM=tauxResM;
		this.tauxResP=tauxResP;
	}

	public double tauxAtkP;
	public double tauxResP;
	public double tauxResM;

	public double getTauxAtkP() {
		return tauxAtkP;
	}
	
	public double getTauxAtkM() {
		return 1-tauxAtkP;
	}
	
	
	public double getTauxResP() {
		return tauxResP;
	}

	public double getTauxResM() {
		return tauxResM;
	}
	
}

