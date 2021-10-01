package projet.agile.gr3;

public class CaseVide implements Case {

	@Override
	public char getChar() {
		return ' ';
	}

	@Override
	public boolean isObstacle() {
		return false;
	}
	
}
