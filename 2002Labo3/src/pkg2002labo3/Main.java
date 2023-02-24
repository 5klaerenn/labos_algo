/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2002labo3;

import java.util.Scanner;

/**
 *
 * @author 5klaerenn
 */
public class Main {

    public static void main(String[] args) {
        
/*
         Scanner sc=new Scanner(System.in);
        
        
         ====================================================================================
         
         Exercice 1 : nous allons reprendre quelques exercices du labo 1 en java
        1-Modifier l’algorithme de la calculatrice simple afin qu’elle puisse effectuer en plus des additions et des soustractions,  des opérations de multiplications et de divisions. Assurez-vous que l’on ne puisse diviser par zéro.
        2-Écrire un algorithme qui permet d’échanger le contenu de deux variables
        3-Écrire un programme qui permet d’afficher le maximum parmi 2 nombres entrés par l’utilisateur.
      
        double n; 
             
       System.out.println("Entrez un premier nombre");
       double nbr1 =sc.nextDouble();
       System.out.println("Entrez un deuxieme nomre");
       double nbr2=sc.nextDouble();
       System.out.println("Entrez votre operateur");
       char op =sc.next().charAt(0);
       sc.close();
             
        switch (op) {
            case '+':
                System.out.println(nbr1+nbr2);
                break;
            case '*':
                System.out.println(nbr1*nbr2);
                break;
            case '-':
               System.out.println(nbr1-nbr2);
               break;
            case '/':
                if (nbr2 == 0){
                    System.out.println("Erreur, on ne peut diviser par 0");
                } else {
                    System.out.println(nbr1/nbr2);
                }
               break;
            default:
                System.out.println("Erreur");
        }
        
                 
       System.out.println("Votre premier nombre est : " + nbr1);
       System.out.println("Votre deuxieme nombre est : " + nbr2);
       System.out.println("Nous avons echange les valeurs");
               n = nbr1;
               nbr1 = nbr2 ;
               nbr2 = n; 
       System.out.println("Votre premier nombre est maintenant : " + nbr1);
       System.out.println("Votre deuxieme nombre est maintenant : " + nbr2);   
       
       
        if(nbr1 > nbr2){
           System.out.printf("%s", nbr1 + " > " + nbr2);
       } else if (nbr1 == nbr2){
           System.out.println("Les deux nombres sont egaux");
       }
        else {
           System.out.printf("%s", nbr1 + " < " + nbr2);
       }
        
     =================================================================================
         
         EXERCICE 2 
         
         Permettre à l’utilisateur d’entrer la longueur et la largeur d’un rectangle, affichez par la suite le périmètre et la surface de ce rectangle. 
        Assurez-vous que l’utilisateur ne rentre pas des valeurs négatives.

        
       double perimeter, aire, length, width; 
        
        System.out.println("Entrez la longueur de votre rectangle");
        length = sc.nextDouble();
        System.out.println("Entrez la largeur de votre rectangle");
        width = sc.nextDouble();
        sc.close();
               
        
        if (length >= 0 || width >= 0) {
            perimeter = (length+width)*2;
            System.out.println("Le perimetre de votre rectangle est : " + perimeter + "cm");
            aire = length*width;
            System.out.println("L'aire de votre rectangle est : " + aire + "cm^2");
        } else {
            System.out.println("Erreur, vous ne pouvez entrer de valeurs negatives");
        }
         
         
        =======================================================================================
         
       EXERCICE 3 :
       
        Permettre à l’utilisateur d’entrer le radius d’un cercle, et calculer sa surface et son périmètre, afficher le résultat dans le format de deux chiffres après la virgule. 
        Assurez-vous que l’utilisateur ne rentre pas des valeurs négatives.
       
             
       double perimeter, aire, radius; 
        
        System.out.println("Entrez le rayon de votre cercle");
        radius = sc.nextDouble();
        
        if (radius >= 0) {
            perimeter = 2*Math.PI*radius;
            System.out.printf("Le perimetre est %.2f cm\n", perimeter);
            aire = Math.PI*(radius*radius);
            System.out.printf("L'aire de votre cercle est %.2f cm^2\n", aire);
            System.out.printf("%s %.2f %s %.2f %s", "Le perimetre est", perimeter, "cm et l'aire est", aire, "cm^2\n");
        } else {
            System.out.println("Erreur, vous ne pouvez entrer de valeurs negatives");
        }
         
       ===================================================================================
        
        EXERCICE 4 :
        Permettre à l’utilisateur d’entrer son âge, si l’âge entré est >=18ans alors un message est affiché indiquant son âge ainsi que la décision s’il est majeur ou non. 
        Faites les validations nécessaires.
     
       int age;
       
       System.out.println("Entrez votre age");
       age = sc.nextInt();
       sc.close();
       
       if (age > 0 && age < 115) {
           if (age >= 18) {
               System.out.println("Vous avez " + age + ", vous etes majeur");
           }
        } else {
               System.out.println("Erreur");
           }
          
         
         =======================================================================================
         
         EXERCICE 5 : 
         
         Exercice 5 :
        Dans le contexte des mois, permettre à l’utilisateur d’entrer le mois en lettre et le système affiche si ce mois-là est composé de 30 jours, de 31 jours ou de 28 jours dans le cas du mois de février.
        Utilisez la structure switch case

        String choix;    
        
        System.out.println("Choisissez un mois pour savoir combien de jour celui-ci est compose");
        choix = sc.next();
        sc.close();
        String mois = choix.toLowerCase();
             
        
        switch (mois) {
            case "janvier", "mars", "mai", "juillet", "août", "octobre", "décembre":
               System.out.println(mois + " compte 31 jours"); 
                break;
            case "avril", "juin", "septembre", "novembre":
               System.out.println(mois + " compte 30 jours");
               break;
            case "février":
               System.out.println("Fevrier compte 28 jours"); 
               break;
            default:
               System.out.println("Erreur dans l'entree du mois");
               break;
        }
         
         
        ==========================================================================
         
         EXERCICE 6
         
        Un peu à la manière des jeux vidéo, votre programme demande d’abord à l’usager de lui fournir les coordonnées x et y d’un point, sa longueur et sa largeur, pour définir une zone rectangulaire.
        Cette zone ayant été définie, votre programme demande alors à l’usager de lui fournir un autre point (une valeur de x et une valeur de y) et il doit indiquer si le point est dans la zone définie 
        précédemment ou non. ( on ne vous demande pas de dessiner)
        
        
        double x, y, lon, larg, xtest, ytest, xMax, yMax;
        
        System.out.println("Entrez votre premiere coordonnee");
        x = sc.nextDouble();
        System.out.println("Entrez votre seconde coordonnee");
        y = sc.nextDouble();
        System.out.println("Entrez la longueur de la zone");
        lon = sc.nextDouble();
        System.out.println("Entrez la largeur de la zone");
        larg = sc.nextDouble();
        System.out.println("Entrez une coordonnee pour un second point");
        xtest = sc.nextDouble();
        System.out.println("Entrez une deuxieme coordonnee pour un second point");
        ytest = sc.nextDouble();
        sc.close();
        
        xMax = x + lon;
        yMax = y + larg;
        
        if (xtest >= x && xtest <= xMax && ytest >= y && ytest <= yMax) {
                   System.out.println("Le point est dans la zone definie");
               } else {
            System.out.println("Le point est en dehors de la zone definie");
        } 
         
         
     */  
        
    }
    
}
