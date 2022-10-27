/**
 * Tâche: Convertisseur de bases numériques d'un nombre de base 10 à une base quelquonque
 * Par: David Malek, maldav31@ecolecatholique.ca
 * Date: 2021-11-29
 */
import java.util.Scanner;
public class Projet1
{
    static int maBase = 33; // déclarer cette variable complétement avec votre base assignée

    public static void main( String[] args ) 
    {
        //Déclarations de variables 
        int Nombre;
        String conversion;


        System.out.print("Entrez un nombre que vous voulez que je convertisse en base 33: "); //demande l'utilisateur pour un nombre que l'on veut convertir
        Scanner input = new Scanner(System.in);
        Nombre = input.nextInt(); //prend le nombre de l'utilisateur
        conversion =  changeDeBase(Nombre); //Appel à la fonction et fournit le nombre entré par l'utilisateur
        System.out.println( "La valeur convertit est: " + conversion); // Sort la réponse convertit
        input.close();

        
        /* Exemples de test: 
        
        Nombres d'entré:
        428 ----- valeur convertit ---> cw
        33 ------ valeur convertit ----> 10
        1089 ----- valeur convertit ---> 100

        */
    }

    static String changeDeBase( int valeur )
    {
        //Déclaration de variables
        int reste = 0;
        String symboles = "0123456789abcdefghijklmnopqrstuvwxyz"; // tous les symboles pour représenter un nombre dans les bases de 2 à 36
        String Liste = ""; // Liste pour stocker les restes de la division succéssive. 

        //MÉTHODE MATHÉMATIQUE POUR EXÉCUTER LA CONVERSION
        /*une expression polynomiale est exprimée sous forme d'un nombre multiplié
         par une puissance d'une base ex: 212 en base (10) = 2 x 10^2 + 1 x 10^1 + 2 x 10^0; 2,1 et 2 sont le code d'un nombre en base 10.
        Donc on doit stocker les restes de la division*/
        
        //Si valeur == 0
        if ( valeur == 0 ) // Si la valeur == 0, la boucle de la ligne 56 est "False", donc il n'y a pas de valeur retournée. Il faut mettre la condition que si la "valeur" est égale à 0, qu'elle devrait ajouter à "Liste" 0 (car il n'y a pas de reste dans une division de 0 par un nombre).
        {
            Liste = Liste + 0;
        }
        
        //Si valeur est plus grande que 0
        while ( valeur > 0 ) // La division arrète lorsque le quotient devient 0. On doit diviser le quotient par la base cible       
        {
            reste = valeur % maBase; //Le reste
            valeur = valeur / maBase; // Le quotient devient le dividende afin de de continuer la division succéssive       
            Liste = symboles.charAt(reste) + Liste; //Puisqu'on veut stocker le reste qui compose le code selon la base cible
        }
        return Liste; //"Liste" sera retourné à main dans la variable "conversion".
    }  
}