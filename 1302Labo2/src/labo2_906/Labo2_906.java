/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labo2_906;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sklaerenn
 */
public class Labo2_906 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        /*
        ========================================================================
            EXERCICE 1:
        Écrire un algorithme portant sur les structures de répétition et faites 
        en sorte que l’usager puisse fournir lui-même la valeur supérieure de la 
        boucle, et affiche ensuite tous les chiffres entre 0 et cette valeur.
        ========================================================================
        */
       
            
//        System.out.println("Entrez un nombre");
//        int n=sc.nextInt();
//        byte  i;
//        
//        for (i=0; i <= n; i++){
//                System.out.println(i);
//        }
        
        /*
        ========================================================================
            EXERCICE 2:
        Écrire un algorithme qui demande un nombre entier positif à l’usager et 
        qui calcule ensuite la somme de tous les nombres plus petit ou égaux au 
        nombre entré. 
        Par exemple, si l’usager entre le chiffre 8, votre programme devra 
        afficher 36 car  8+7+6+5+4+3+2+1 = 36.
        Appeler une fonction pour retourner le resultat
        ========================================================================
       
        int n = estEntierPositif();
        System.out.printf("%s %s %s %s","La somme de tous les nombres plus petits ou egaux a", +n, "est : " +maxSum(n), "\n");

        */
        
        /*
        ========================================================================
            EXERCICE 3 :
        Écrire un algorithme qui demande un nombre entier positif à l’usager et 
        qui calcule ensuite le produit de tous les nombres plus petit ou égaux 
        au nombre entré. 
        ========================================================================
               
        int n = estEntierPositif();        
        int i;
        int produit = 1;
        
        for(i = n; i > 0; i--){
            produit = produit * i;
        }
        
        System.out.printf("%s %s %s %s","Le produit de tous les nombres plus petits ou egaux a", +n, "est : " +produit, "\n");
   */         
        
        /*
        ========================================================================
            EXERCICE 4 :
        Écrire un algorithme qui demande à l’usager d’entrer un nombre et qui 
        affiche tous les nombres pairs inférieur ou égal à la valeur entrée dans 
        l’ordre décroissant. 
        Par exemple, si on entre 13, on veut voir afficher 12 10 8 6 4 2.
        ========================================================================
        
        int j, i, n; 
        
        System.out.println("Entrez un nombre"); 
        n = sc.nextInt(); 
        
        if(n%2 !=0){
            j = n - 1;
        } else {
            j = n;
        }
        
        for (i=j; i >0; i -=2){
            System.out.println(i);
        }
        */
        
        /*
        ========================================================================
            EXERCICE 5 :
        Écrire un algorithme qui affiche la table de multiplication (jusqu’à 10) 
        d’un entier positif entré par l’utilisateur
        Appeler une méthode pour le traitement
        ========================================================================
             
        int n = estEntierPositif();
        tables(n);
        
*/ 
        
        /*
        ========================================================================
            EXERCICE 6 :
        Écrire un algorithme qui parcoure les nombres de 1 à 10 et les affiche 
        seulement si a+b =c+d , on les appelle les nombres chanceux
        (lucky numbers)
        ========================================================================
                
        int a, b, c, d;
        
        for (a=1; a<=10; a++){
            for (b=1; b<=10; b++){
                for (c=1; c<=10; c++){
                    for (d=1; d<=10; d++){
                        if(a+b ==c+d){
                            System.out.printf("%s %s %s %s", a,  b,  c,  d,  " \n");
                        }
                    }
                }
            }
        }
        
        */
        
        /*
        ========================================================================
            EXERCICE 7:
        Écrire un programme qui initialise un tableau de 10 éléments, et qui 
        demande ensuite à l’utilisateur d’entrer 10 notes des étudiants, puis 
        appelle une fonction qui va calculer et retourner la moyenne des 
        étudiants.
        ========================================================================
                
        int i, notes[], n;
        notes = new int[10];
        
        for(i=0; i < notes.length; i++) {
            System.out.println("Entrez votre note");
            n = sc.nextInt();
            while(n < 0){
                System.out.println("Votre note doit etre un nombre positif");
                n = sc.nextInt() ;
            }
            notes[i] = n;
        }
        
        System.out.println("la moyenne est de : " + moyenne(notes));
*/        
        
        /*
        ========================================================================
            EXERCICE 8 :
        Écrire un algorithme qui lit deux tableaux et qui vérifie si les deux 
        sont égaux (deux tableaux sont égaux s’ils sont de la même taille, et si
        leur contenu est le même)
        ========================================================================
        
        int tab1[], tab2[], a, b, i, j;
        tab1 = new int[3];
        tab2 = new int[3];
             
        for(i=0; i < tab1.length; i++) {
            System.out.println("Entrez les chiffres du premier tableau"); 
            a = sc.nextInt() ;
            tab1[i] = a;
        }
        
        for(j=0; j < tab2.length; j++) {
            System.out.println("Entrez les chiffres du second tableau"); 
            b = sc.nextInt() ;
            tab2[j] = b;
        }

        if(compare(tab1, tab2) == false){
            System.out.println("Les tableaux ne sont pas egaux");
        } else {
            System.out.println("Les tableaux sont egaux");
        }
        */
        
        /*
        ========================================================================
            EXERCICE 9 : 
        Écrire un algorithme qui lit un tableau de lettre et qui demande à 
        l’utilisateur de saisir une lettre, ensuite parcoure le tableau et 
        compte le nombre d’occurrence de cette lettre.
        ========================================================================
        
        
        char ltr;
        char[] tab1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        
        System.out.println("Saisissez une lettre");
        ltr = sc.next().charAt(0);
        
        compte(tab1, ltr);
        */
        
        /* 
        ========================================================================
            EXERCICE 10 :
        Écrire un algorithme qui effectue une recherche d’un nombre dans un 
        tableau d’entier positif.
        Utilisez un booléen, si le nombre a été trouvé.
        ========================================================================
        
        int n;
        int i = 0;
        boolean rep = false;
        int[] tab = {1, 3, 5, 7, 9};
        
        n = estEntierPositif();
        
        while(i < tab.length && rep == false){
            if(n == tab[i])
               rep = true;
          i++;
        }
        
        if(rep == true){
            System.out.printf("%s %s %s", "Le nombre ", n, " a ete trouve\n");
        } else{
            System.out.println(n+" n'est pas dans la liste");
        }
      */  
         
    }
        
    static int estEntierPositif(){
        Scanner sc = new Scanner(System.in);
        int n;
        do {  
            System.out.println("Entrez un entier positif");
            
            while(!sc.hasNextInt()){
            System.out.println("Erreur, entrez un nombre entier");
            sc.next(); 
            } n = sc.nextInt();
        } while (n < 0);
        return n;
    }

    static int maxSum(int n){
        int i;
        int somme = 0;
        for (i=n; i>0; i--) {
            somme = somme + i;
        } return somme;
        }

    static void tables(int n){
        int i;
        int result;
        for(i=1; i<=10; i++){
            result = n*i;
            System.out.printf("%s", n + "*" + i + "= " + result + " \n");
        } 
        }
    
    static double moyenne(int notes[]){
        int sum = 0;
        int i;
        for (i = 0; i < notes.length; i++){
           sum = sum + notes[i];
        } 
        return (double) sum/notes.length;
        }
    
    static boolean compare(int tab1[], int tab2[]){
        int k = 0;
        boolean rep = true;
        
        if(tab1.length == tab2.length){
            while(k < tab1.length && rep == true){
                if(tab1[k] != tab2[k]){
                    rep = false;
                } k++;
            }
        } else {
            rep = false;
        } return rep;
    }
    
    static void compte(char tab1[], char ltr){
        int i;
        int cpteur = 0;
        
        for(i=0; i<tab1.length; i++){
            if(ltr == tab1[i])
                cpteur++;
        }      
        System.out.printf("%s %s", "Votre lettre \"" +ltr+ "\" est apparue " +cpteur, " fois\n");
    }
    
}
