/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labo2_906;

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
        Exercice 1:
        Écrire un algorithme portant sur les structures de répétition et faites en sorte que l’usager puisse fournir lui-même la valeur supérieure de la boucle, et affiche ensuite tous les chiffres entre 0 et cette valeur
        */
       
            
//        System.out.println("Entrez un nombre");
//        int n=sc.nextInt();
//        byte  i;
//        
//        for (i=0; i <= n; i++){
//                System.out.println(i);
//        }
        
        /*
        Exercice 2:
        Écrire un algorithme qui demande un nombre entier positif à l’usager et qui calcule ensuite la somme de tous les nombres plus petit ou égaux au nombre entré. 
        Par exemple, si l’usager entre le chiffre 8, votre programme devra afficher 36 car  8+7+6+5+4+3+2+1 = 36.
        Appeler une fonction pour retourner le resultat

 */      
        
        System.out.println("Entrez un nombre entier positif");
        int n = sc.nextInt();
//        int i;
//        int somme =0;
        
        while (n < 0) {            
             System.out.println("Entrez un nombre entier positif");
             n = sc.nextInt();
        }
                    
        System.out.println(maxSum(n));
        

        
        
        /*
        Exercice 3 :
Écrire un algorithme qui demande un nombre entier positif à l’usager et qui calcule ensuite le produit de tous les nombres plus petit ou égaux au nombre entré. 

        
        
        System.out.println("Entrez un nombre entier positif");
        int n = sc.nextInt();
        int i;
        int produit = 1;
        
        while(n < 0){
            System.out.println("Entrez un nombre entier positif");
            n = sc.nextInt();
        }
        
        for(i = n; i > 0; i--){
            produit = produit * i;
        }
        
        System.out.println(produit);
      
*/
        
        /*
       Exercice 4 :
Écrire un algorithme qui demande à l’usager d’entrer un nombre et qui affiche tous les nombres pairs inférieur ou égal à la valeur entrée dans l’ordre décroissant. Par exemple, si on entre 13, on veut voir afficher 12 10 8 6 4 2.
        
        
        int j, i; 
        
        System.out.println("Entrez un nombre"); 
        int n = sc.nextInt(); 
        
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
        Exercice 5 :
Écrire un algorithme qui affiche la table de multiplication (jusqu’à 10) d’un entier positif entré par l’utilisateur
Appeler une méthode pour le traitement

      
        
        int result, i;
        
        System.out.println("Entrez un entier positif");
        int n = sc.nextInt(); 
        
        while(n<0){
            System.out.println("Entrez un entier positif");
            n = sc.nextInt();
        }
        
        for(i=1; i<=10; i++){
            result = n*i;
            System.out.printf("%s", n + "*" + i + "= " + result+ " \n");
        } 
         */
        
        /*
        Exercice 6 :
Écrire un algorithme qui parcoure les nombres de 1 à 10 et les affiche seulement si  a+b =c+d , on les appelle les nombres chanceux (lucky numbers)
        
        
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
        Exercice 7:
Écrire un programme qui initialise un tableau de 10 éléments, et qui demande ensuite à l’utilisateur d’entrer 10 notes des étudiants, puis appelle une fonction qui va calculer et retourner la moyenne des étudiants.
        
                
        int i, notes[] ,sum;
        double moy;
        notes = new int[10];
        
        for(i=0; i <notes.length; i++) {
            System.out.println("Entrez votre note"); 
            int n = sc.nextInt() ;
            notes[i] = n;
        }
        
        sum = 0;
        moy = 0 ;
        
        for (i = 0; i<= notes.length; i++){
           sum = sum + 1;
           moy = sum / notes.length;
        } 
        
        System.out.println(moy);
        
        
        */
        
        
        
        
    }
    
    static int maxSum(int n){
        int i;
        int somme = 0;
        for (i=n; i>0; i--) {
            somme = somme + i;
        } return somme;
        }

}
