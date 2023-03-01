/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labo4;

import java.util.Scanner;

/**
 *
 * @author Sklaerenn
 */
public class Labo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        /*
        Exercice 1 :
        Affichez les chiffres pairs entre 0 et n dans l’ordre croissant, l’utilisateur ne doit pas entrer un nombre négatif.
       Assurez-vous que l’utilisateur entre bien un type numérique entier

       
        
        // MÉTHODE 1 : TRY AND CATCH
        
//        int n = 0; 
//        int i;
//        
//                boolean rep = true;
//        
//        do {
//            try {
//            System.out.println("Entrez un nombre entier positif");
//            n = sc.nextInt();
//            rep = true;
//        } catch (Exception e) {
//            System.out.println("Erreur de type");
//            sc.next();
//            rep = false;
//        }
//        } while(n<0 || rep == false);



//      MÉTHODE 2 : DO WHILE
        
        int n, i;
            
        do {  
            System.out.println("Entrez un entier positif");
            
            while(!sc.hasNextInt()){
            System.out.println("Erreur, entrez un nombre entier");
            sc.next(); 
            } n = sc.nextInt();
        } while (n < 0);

           
        for (i=0; i <= n; i+=2){
               System.out.println(i);
      }
       
       */ 
        
        
        /*Exercice 2
        Affichez les chiffres pairs entre 0 et n dans l’ordre décroissant, avec leur carré
        
        
        int n, i;
        
        System.out.println("Entrez un entier positif");
        
        while(!sc.hasNextInt()){
            System.out.println("Erreur, entrez un nombre entier");
            sc.next(); 
        } n = sc.nextInt();
        
        while(n < 0){
            System.out.println("Erreur, entrez un entier positif");
            n = sc.nextInt();
        }
        
        if (n % 2 != 0){
            n = n -1; 
       } 
        
        for(i = n; i >= 0; i-=2){
            System.out.printf("%s %s %s", i, "son carre est : " + i*i, "\n");
        }
//        */
        
        
/*Exercice 3 : 
        Trouvez le maximum, et le minimum parmi n nombres entiers entré par l’utilisateur, le n est entré au début du programme pour connaitre combien de nombre nous allons avoir
        Trouvez également le nombre de nombre pairs et le nombre de nombres impairs, utilisez deux compteurs à cet effet
       
        
        int n, num, min, max, i, j, cpteur1, cpteur2;
        cpteur1=0;
        cpteur2=0;
        
        boolean first = true;
                
        System.out.println("Combien de chiffres voulez-vous entrer ?");
        n = sc.nextInt();
        
        while(n < 0) {
            System.out.println("Erreur, entrez un nombre positif");
            n = sc.nextInt();
        }
        
        System.out.println("Entrez votre premier nombre");
        while(!sc.hasNextInt()){
            System.out.println("Erreur, entrez un nombre entier");
            sc.next(); 
            } num = sc.nextInt(); 
        if(num %2 !=0){
                cpteur1 ++;
            } else {
                cpteur2 ++;
            }
        max = num;
        min = num;
        
                      
        for (i = 2; i <= n; i++){
            System.out.println("Entrez le nombre suivant ");
            while(!sc.hasNextInt()){
            System.out.println("Erreur, entrez un nombre entier");
            sc.next(); 
            } 
            num = sc.nextInt();        
                        
            if(num >= max){
                max = num;
            } else if (num <= min) {
                min = num;
            } 
            
            if(num %2 !=0){
                cpteur1 ++;
            } else {
                cpteur2 ++;
            }
            
        }
        
        System.out.println("Le nombre minimal est : " + min);
        System.out.println("Le nombre maximal est : " + max);
        System.out.printf("%s %s", "Vous avez entre " + cpteur1, " nombres impairs \n");
        System.out.printf("%s %s", "Vous avez entre " + cpteur2, " nombres pairs \n");
        
*/
        
        
/*
        Exercice 4 
        Trouvez et affichez la factoriel d’un nombre entré par l’utilisateur, traitez les cas d’exception (factoriel de 0 égale à 1, et pas de factoriel pour les nombres négatifs)
        Assurez-vous que l’utilisateur entre bien un type numérique entier
       
        
        int n, i, facto;
        facto = 1;
        
        System.out.println("Entrez un entier positif");
        
        while(!sc.hasNextInt()){
            System.out.println("Erreur, entrez un nombre entier positif");
            sc.next(); 
        } n = sc.nextInt();
        
        if(n < 0){
            System.out.println("Erreur, pas de factoriel pour les nombres negatifs");
        } else if (n > 0){
            for(i=1; i<=n;i++){
                facto = facto*i;
            } System.out.printf("%s %s", n+"! = "+facto, "\n");
        } else {
                    System.out.println("0! = 1");
                    }
*/
        
                
    }
}
