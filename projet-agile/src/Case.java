package projet.agile.gr3;

public class Case {
	public Caract caractere;
	private boolean obstacle;
	
	public Case(Caract caractere, boolean obstacle) {
		super();
		this.caractere = caractere;
		this.obstacle = obstacle;
	}
	
	public char getChar() {
		return this.caractere.getChar();
	}
	/*
	public boolean isChest() {
		if(this.contenu.getClass() instanceof Chest) {
			return true;
		}
		return false;
	}
	
	public boolean isMonster() {
		if(this.contenu.getClass() instanceof Monster) {
			return true;
		}
		return false;
	}*/
	
}
