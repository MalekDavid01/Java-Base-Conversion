# Projet - Un convertisseur de base numérique

ICS4U	

>Pour mieux lire ce document dans VS Code, faire un clic-droit sur le fichier dans l'explorateur et choisir "Ouvrir l'aperçu" *ou* avec le document ouvert faire la combinaison de touches `Ctrl` + `Maj` + `V`.

## Objectif

Écrire et utiliser une méthode qui convertit une valeur entière décimale positive en valeur entière dans une autre base numérique. 

## Comment

* Compléter le gabarit `Projet1.java` fourni dans le répertoire du projet qui a été (ou sera) partagé via classroom.github.com.
* Compléter la méthode nommée `changeDeBase()` qui prend un paramètre -  la valeur entière décimale à convertir - et qui retourne un String représentant la valeur entière dans la base cible. Voici la signature de la méthode :
    ```java
    static String changeDeBase( int valeur )
    ```
* Le code de base définit aussi une variable globale (un membre de la classe) `int maBase` qui devrait contenir la valeur de la base numérique qui vous êtes assignée. On peut utiliser cette variable directement dans les méthodes `main()` et `changeDeBase()`.
* **Ne pas utiliser** les méthodes statiques de la classe `Integer` dans votre algorithme. Vous devrez comprendre la relation mathématique entre les différentes bases et suffisamment de techniques de programmation pour l'utiliser.
* Tester `changeDeBase()` dans la méthode `main()` de votre classe en l'appelant plusieurs fois avec différentes valeurs et en affichant le résultat.
* L'enseignant doit pouvoir lancer le programme à partir du fichier .class que vous avez compilé.
* *Astuce 1 : les opérations `/` (division entière) et `%` (restant/modulo) sont très utiles.*
* *Astuce 2 : la méthode `.charAt(int)` est utile pour sortir le caractère à une position spécifique dans un String*.

## Exemples de tests

Voici des exemples de tests avec les résultats attendus.

```java
// (maBase = 3)
System.out.println( changeDeBase( 2 ) ); 	// affiche 2 
// (maBase = 36)
System.out.println( changeDeBase( 35 ) ); 	// affiche z
// (maBase = 36)
System.out.println( changeDeBase( 36 ) ); 	// affiche 10
// (maBase = 19)
System.out.println( changeDeBase( 19 ) ); 	// affiche 10
```

## Quoi

Compétence | Critère | Commentaire | Note
--- | --- | --- | ---
CC | Utilisation des variables, des opérations, des conditions, des boucles et des fonctions. | tout est là | 4++
HP | Algorithme logique et expliqué avec des commentaires. | très bien expliqué | 4++
CO | Noms de variables clairs; structure (tabulations) claire; conventions respectées. | en séparant le commentaire de documentation de la classe, tu as brisé la documentation | 4+
MA | Travail complet selon les consignes; Aucune erreur de compilation ou d'exécution; Présence du bytecode `Projet1.class`. | tout est conforme | 4++
