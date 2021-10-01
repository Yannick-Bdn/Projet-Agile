package projet.agile.gr3;

public class Map {
    
    public int y;
    public int x;
    public Case [][] map;
    public static Player j1;

    public Map(int h){
        this.y = h;
        this.x = AskAndDisplay.getRandomNumberInRange(5,20);
        this.map = new Case[y][x];
        System.out.println(" " + this.x + " " + this.y + " " + this.map[0].length + " " + this.map.length);
        initialiserTerrain();
        placementMobs();
        
    }
    
    public void placementMobs() {
        
        
        int mod = j1.levelmap%5;
        int nMonster = 0;
        if(mod==1 || mod==2) {
            nMonster=monsterCounter(1,this.map[0].length);
        }else if(mod==3) {
            nMonster=monsterCounter(2,this.map[0].length);
        }else if(mod==4) {
            nMonster=monsterCounter(3,this.map[0].length);
        }else if(mod==0) {
            nMonster=monsterCounter(4,this.map[0].length);
        }else {
            System.out.println("Error");
        }
        
        for(int i = 0; i < nMonster ; i++) {
            Case monstre = new Case(Caract.MONSTER,true);
            
            int xM,yM;
            do {
            xM = AskAndDisplay.getRandomNumberInRange(0, this.map[0].length-1);
            yM = AskAndDisplay.getRandomNumberInRange(0, this.map.length-1);
            }while(validEmplacement(map, xM, yM) == false);
            System.out.println(xM +" "+yM);
            placerMonstre(monstre, map, xM, yM); 
            System.out.println(xM +" "+yM);
        }    
    }
    
    int monsterCounter(int n, int coordx) {
        int nMonster=0;
        System.out.println(" coordx : " + coordx);
        if(coordx <10) {
            nMonster=1;
        }else if(coordx<15) {
            nMonster=2;
        }else if(coordx<20) {
            if(n==1) {
                nMonster=2;
            }else {
                nMonster=3;
            }
        }else if(coordx==20) {
            if(n==1) {
                nMonster=2;
            }else if(n==2){
                nMonster=3;
            }else {
                nMonster=4;
            }
        }
        return nMonster;
    }
    
    
    public void initialiserTerrain() {

        for (int y = 0; y < this.map.length ; y++) {
            for (int x = 0; x < this.map[0].length;x++) {
                Case c = new Case(Caract.VIDE, true);
                if(y==0) {
                    c = new Case(Caract.PLEIN,false);
                }
                if(x==0) {
                    c = new Case(Caract.PLEIN,false);
                }
                if(y==this.map.length-1) {
                    c = new Case(Caract.PLEIN,false);
                }
                if(x==this.map[1].length-1) {
                    c = new Case(Caract.PLEIN,false);
                }
                map[y][x] = c;
            }
            
        }
    }
    
    public void placerMonstre(Case c, Case[][] m, int h, int l) {
        m[l][h] = c;
    }
    
    public boolean validEmplacement(Case[][] carte, int x, int y) {
        boolean result = true;
        Case c = carte[y][x];
        if (c.getChar() == ' ') {
            result = true;
        }
        return result;
    }
    

    public String toString() {
        String result = "";
        for (int y = 0; y < map.length ; y++) {
            result = result+"\n";
            for (int x = 0; x < map[0].length ;x++) {
                /*tableau[x][y] = x + y;*/
                if(x==0)result = result+map[y][x].getChar();
                else result = result + "."+map[y][x].getChar();
            }
        }
        return result;
    }
    
    
    
    public static void main(String[] args) {
        j1 = new Player(1, 0, 1, "Bruno");
        Map m = new Map(10);
        System.out.println(m.toString());
    }
    
}