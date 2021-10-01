package projet.agile.gr3;

public interface Combattant {

	void attaque(Combattant adversaire, String typeAttaque);

	void setFaiblesseRevelee(boolean faiblesseRevelee);

	void setResistanceRevelee(boolean resistanceRevelee);

	void setVie(double d);
	
	void setSubstractVie(double d);

	String getFaiblesse();

	String getResistance();

	String getName();
	
	double getVie();
	
	

}