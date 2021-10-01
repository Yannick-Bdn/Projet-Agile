package projet.agile.gr3;

public class Entity {
	public int y;
	public int x;
	public int levelmap;
	public String name;
	public double vie;
	public int degatsMagiques;
	public int degatsPhysiques;
	public String faiblesse;
	public String resistance;
	public double tauxResM;
	public double tauxResP;
	public boolean faiblesseRevelee;
	public boolean resistanceRevelee;
	public boolean alive;
	
	
	public Entity(int y, int x, int levelmap, String name, int vie, int degatsMagiques, int degatsPhysiques, String faiblesse, String resistance, double tauxResM, double tauxResP) {
		this.y = y;
		this.x = x;
		this.levelmap = levelmap;
		this.name = name;
		this.vie = vie;
		this.degatsMagiques = degatsMagiques;
		this.degatsPhysiques = degatsPhysiques;
		this.faiblesse = faiblesse;
		this.resistance = resistance;
		this.faiblesseRevelee=false;
		this.resistanceRevelee=false;
		this.alive = true;
		this.tauxResM=tauxResM;
		this.tauxResP=tauxResP;
	}
	
	//Override
	public void attaque(Entity adversaire, String typeAttaque) {
		int efficace = 0;
		if(adversaire.getFaiblesse() != null) {
			
			if(adversaire.getFaiblesse().equalsIgnoreCase(typeAttaque)){
				efficace = 1;
			}
		}
		if(adversaire.getResistance() != null) {
			if(adversaire.getResistance().equalsIgnoreCase(typeAttaque)){
				efficace = -1;
			}
		}

		switch(typeAttaque) {
		  case "physique":
			  adversaire.setSubstractVie(this.degatsPhysiques * adversaire.getTauxResP());
			  AskAndDisplay.clearNLines(1);
			  System.out.println(this.name + " fait une attaque physique sur " + adversaire.getName());

		    break;
		  case "magique":
			  adversaire.setSubstractVie(this.degatsMagiques * adversaire.getTauxResM());
			  AskAndDisplay.clearNLines(1);
			  System.out.println(this.name + " fait une attaque magique sur " + adversaire.getName());
		    break;
		}
		
		if (efficace == 1) {
			System.out.println("C'est super efficace !");
		}else if(efficace == -1) {
			System.out.println("Ce n'est pas très efficace.");
		}
		
		AskAndDisplay.waitForXMs(2500);
		
	}

	public void setFaiblesseRevelee(boolean faiblesseRevelee) {
		this.faiblesseRevelee = faiblesseRevelee;
	}

	public void setResistanceRevelee(boolean resistanceRevelee) {
		this.resistanceRevelee = resistanceRevelee;
	}
	
	public void setVie(double vie) {
		this.vie = vie;
	}
	
	public String getFaiblesse() {
		if (faiblesseRevelee) {
			return faiblesse;
		}else
			return "inconnue";
	}

	public String getResistance() {
		if (resistanceRevelee) {
			return resistance;
		}else
			return "inconnue";
	}

	public String getName() {
		return this.name;
	}

	public double getVie() {
		return this.vie;
	}

	public void setSubstractVie(double d) {
		this.setVie(getVie()-d);
		if (getVie()<=0) {
			this.alive=false;
		}		
	}

	public boolean getAlive() {
		return alive;
	}

	public double getTauxResM() {
		return tauxResM;
	}

	public double getTauxResP() {
		return tauxResP;
	}

	@Override
	public String toString() {
		return "Entity [y=" + y + ", x=" + x + ", levelmap=" + levelmap + ", name=" + name + ", vie=" + vie
				+ ", degatsMagiques=" + degatsMagiques + ", degatsPhysiques=" + degatsPhysiques + ", faiblesse="
				+ faiblesse + ", resistance=" + resistance + ", tauxResM=" + tauxResM + ", tauxResP=" + tauxResP
				+ ", faiblesseRevelee=" + faiblesseRevelee + ", resistanceRevelee=" + resistanceRevelee + ", alive="
				+ alive + "]";
	}
	

}
