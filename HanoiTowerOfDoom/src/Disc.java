import java.util.Scanner;


public class Disc implements Comparable<Disc>{

    @Override
    public int compareTo(Disc o) {
        if(this.rayon < o.rayon)
        {
            System.out.println("Ce disque peut être déplacé (plus petit que celui visé)");
            return -1;
        }

        else
        {
            if(this.rayon == o.rayon)
            {
                System.out.println("Ce disque a la même taille que l'autre");
                return 0;
            }
            else
            {
                System.out.println("Ce disque ne peut pas être déplacé (plus grand que celui visé)");
                return 1;
            }
        }
    }
    
    //Attributs
    Scanner reader = new Scanner(System.in);
    int rayon;
    
    //Constructeur
    public Disc(int r)
    {
        this.rayon = r;
    }
    
    //Accesseurs
    public int getRayon()
    {
        return this.rayon;
    }
    
    public void setRayon()
    {
        int monRayon = reader.nextInt();
        this.rayon = monRayon;
    }
    
    public String toString()
    {
        return "Ce disque a un rayon de " + this.rayon + "cm.";
    }  
}
