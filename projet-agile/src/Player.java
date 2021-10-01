package projet.agile.gr3;

import java.util.ArrayList;

public class Player extends Entity {

	ArrayList<Items> inventory;
	
	public Player(int y, int x, int levelmap, String name, int vie, int degatsMagiques, int degatsPhysiques, int inventorySize) {
		super(y, x, levelmap, name, vie, degatsMagiques, degatsPhysiques,null,null, 1, 1);
		inventory = new ArrayList<Items>();
	}
	
	public Player(int y, int x, int levelmap, String name) {
		this(y, x, levelmap,name, 20 , 3, 3, 5);
	}
	
	public void action(Entity adversaire) {
		int reponse;
		
		
		System.out.println("Quel Action voulez-vous faire ?");
		System.out.println("\t0 Pour attaque physique");
		System.out.println("\t1 Pour attaque magique");
		System.out.println("\t2 Pour inspecter l'ennemi");
		System.out.println("\t3 Pour Afficher votre inventaire\n");

		reponse = AskAndDisplay.askValidNumber(0,3);
		
		switch(reponse) {
		  case 0:
			  this.attaque(adversaire, "physique");
		    break;
		  case 1:
			  this.attaque(adversaire, "magique");
		    break;
		  case 2:
			  if (adversaire.faiblesseRevelee) {
				resistance=this.inspecter(adversaire);
			}else {
				faiblesse=this.inspecter(adversaire);
			}
			  
		    break;
		  case 3:
			  this.afficherInventaire();
			  this.action(adversaire);
		}
		
	}
	
	public String inspecter(Entity adversaire) {
		if (!adversaire.faiblesseRevelee) {
			AskAndDisplay.clearNLines(1);
			System.out.println("Inspection revele que " + adversaire.name + " est faible contre "+adversaire.faiblesse);
			adversaire.setFaiblesseRevelee(true);
			AskAndDisplay.waitForXMs(2000);
			return adversaire.faiblesse;
		}else {
			AskAndDisplay.clearNLines(1);
			System.out.println("Inspection revele que " + adversaire.name + " est resistant contre "+adversaire.resistance);
			adversaire.setResistanceRevelee(true);
			AskAndDisplay.waitForXMs(2000);
			return adversaire.resistance;
		}
	}

	private String toStringInventory() {
		String res = "";
		for (int i = 0; i < this.inventory.size(); i++) {
			if(this.inventory.get(i) != null) {
				res = res + this.inventory.get(i) + ", ";
			}
		}
		return res;
	}
	
	public void afficherInventaire() {
		if(this.inventory.size() == 0) {
			AskAndDisplay.clearNLines(1);
			System.out.println("\nVotre inventaire est vide.");
			AskAndDisplay.waitForXMs(2000);
			AskAndDisplay.clearNLines(8);
		}else {
			System.out.println("\nVous disposez de: " + toStringInventory());
		}
	}
	
}
