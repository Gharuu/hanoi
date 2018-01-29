
public interface IPile<T> 
{
    boolean empiler(Disc o);        //Ajoute un nouvel élément en haut de la pile
    T depiler();                //Retire l'élément au sommet de la pile
    T sommet();                 //Retourne l'élément situé au sommet, sans le retirer
    boolean estVide();              //Teste si la pile est vide
    boolean estPleine();            //Teste si la pile est pleine
    int taille();                   //Retourne le nombre d'éléments se trouvant dans la pile
}
