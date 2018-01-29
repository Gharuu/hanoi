public class Main 
{
    public static void main(String[] args) 
    {        
        //Test des disques
	    Disc dOr = new Disc(5);
	    Disc moby = new Disc(20);
	    Disc oFever = new Disc(50);
	    
	    dOr.compareTo(moby);
	    dOr.compareTo(oFever);
	    
	    moby.compareTo(dOr);
	    moby.compareTo(oFever);
	    
	    oFever.compareTo(dOr);
	    oFever.compareTo(moby);
	    
	    System.out.println("");
	    //Test des tours
	    Tower Babel = new Tower();
	    
	    System.out.println(Babel.taille());
	    Babel.empiler(dOr);
	    System.out.println(Babel.taille());
	    Babel.empiler(oFever);
	    System.out.println(Babel.taille());
	    
	    Babel.depiler();
	    System.out.println(Babel.taille());
	    
	    System.out.println("");
	    
	    Babel.empiler(oFever);
	    Babel.empiler(moby);
	    Babel.empiler(dOr);
	    System.out.println(Babel.taille());
	    System.out.println(Babel.sommet());
	    System.out.println(Babel.estVide());
	    System.out.println(Babel.estPleine());
    }
}
