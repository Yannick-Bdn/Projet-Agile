package projet.agile.gr3;

public enum Items {
	SWORD(2)		,CLAWS(1)	,DAGGER	(1)		,HAMMER(3)		,BOW(2)	,CROSSBOW(3),	BATTLE_AXE(4),		    
	SCEPTER(3)	,WAND(2)		,SCROLL(1)		,MAGICAL_BOOK(2)	,MAGICAL_ORB(4)	,JEWEL(1);
	//HELMET()	,GAUNTLETS(), SHOES	,CHESPLATE, LEGGINS, CHAINMAIL
	;
	
	public int power;
	
	Items(int power) {

	}
	
}
