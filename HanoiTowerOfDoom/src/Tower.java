import java.util.Scanner;


public class Tower implements IPile<Disc>
{

    @Override
    public boolean empiler(Disc o) 
    {
        //Ajoute un nouvel élément en haut de la pile
        if(this.taille() == 0)
        {
            this.tour[0] = o;
            this.size += 1;
            this.toutLaHaut += 1;
            return true;
        }
        else
        {
            if(this.sommet() == niet)                                           //On regarde si le sommet est le disque nul                          
            {
                if(o.compareTo(this.tour[toutLaHaut - 1]) == -1)                //On compare plutot avec l'avant dernier disque du coupregarde si le disque en haut est le disque nul
                {
                    this.tour[toutLaHaut] = o;                                  
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                if(o.compareTo(this.sommet()) == -1)            //Si le disque voulu est plus petit que le disque tout en haut qui n'est pas le disque nul
                {
                    this.tour[toutLaHaut+1] = o;
                    toutLaHaut += 1;
                    this.size += 1;
                    return true;
                }
                else
                {
                    //System.out.println("Erreur ! Le disque est trop grand !") ;
                    return false;
                }
            }    
        }
    }

    @Override
    public Disc depiler() 
    {
        //Retire l'élément au sommet de la pile, en le retournant
        if(this.taille() > 0)
        {
            Disc temp = new Disc(0);                //On crée un disque temporaire pour stocker la valeur du disque que l'on enlève
            temp = this.tour[toutLaHaut]; 
        
            this.tour[toutLaHaut] = niet;           //On remplace le disque au sommet par un disque nul
            this.size = size - 1;                   //On décrémente la taille de la tour de 1, comme on a (logiquement) enlevé un disque
            this.toutLaHaut -= 1;  
  
            return temp;
        }
        else
            return niet;                            //Si on a aucun élément à dépiler, on retourne le disque nul
    }

    @Override
    public Disc sommet() 
    {
        //Retourne l'élément situé au sommet, sans le retirer
        //System.out.println("Le disque au sommet est le suivant : \n" + this.tour[toutLaHaut]);
        return this.tour[toutLaHaut];
    }

    @Override
    public boolean estVide() 
    {
        if(this.taille() == 0)
        {
            System.out.println("La tour est vide.");
            return true;
        }
        else
        {
            System.out.println("La tour n'est pas vide.");
            return false;
        }

    }

    @Override
    public boolean estPleine() 
    {
        if(this.taille() == tailleTour)
        {
            System.out.println("La tour est pleine.");
            return true;
        }
        else
        {
            System.out.println("La tour n'est pas pleine.");
            return false;
        }
    }

    @Override
    public int taille() 
    {
        //Retourne le nombre d'éléments se trouvant dans la pile
        //System.out.println("La tour contient " + this.size + " disques.");
        return this.size;
    }
    
    //Attributs
    Scanner reader = new Scanner(System.in);
    Disc[] tour;
    int toutLaHaut;                                     //Indique l'élément se situant en haut de la pile   
    int tailleTour;
    
    int size;                                           //Indique la taille de la tour choisie (plutot que length, pour bidouiller le depilement)
    Disc niet = new Disc(0);                            //On bidouille le dépilement avec un disque nul

    
    //Constructeur
    public Tower()
    {
        this.tailleTour = 3;
        this.size = 0;
        this.tour = new Disc[3];
        this.toutLaHaut = -1;

    }
    
    public Tower(int hauteur)
    {
        this.tailleTour = hauteur;
        this.size = 0;
        this.tour = new Disc[hauteur];
        this.toutLaHaut = -1;
    }
    
    public String toString()
    {
        return "Cette tour a " + this.taille() + " disques, qui sont les suivants: " + this.tour;
    }
    
}
