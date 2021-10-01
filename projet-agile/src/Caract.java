package projet.agile.gr3;

public enum Caract {
    
    VIDE(0,' '),PLEIN(0,'X'),MONSTER(0,'M'),ARMURE(50,'C'),VIE(25,'C');
        
    private int value;
    private char c;
    
    Caract(int v, char c){
        this.value = v;
        this.c = c;
    }
    
   char getChar() {
	   return this.c;
   }

}