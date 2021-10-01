package projet.agile.gr3;

public class CaseObstacle implements Case {

	@Override
	public char getChar() {
		return 'M';
	}

	@Override
	public boolean isObstacle() {
		return false;
	}
	
}
