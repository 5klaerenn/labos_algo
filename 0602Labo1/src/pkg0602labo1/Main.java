/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg0602labo1;

import java.util.Scanner;

/**
 *
 * @author Sklaerenn
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        /* 
    ============================================================================    
            EXERCICE 1 
        Écrire un algorithme (pseudo code) qui récupère le nom, 
        le prénom et l’année de naissance d’une personne, ensuite il affiche le 
        nom, le prénom et l’âge de cette personne.
    ============================================================================
        
        
    String nom, prenom;
    int year;
    int currentYear = 2023;
    
    
        System.out.println("Entrez votre nom");
        nom = sc.nextLine();
        System.out.println("Entrez votre prenom");
        prenom = sc.nextLine();
        System.out.println("Entrez votre année de naissance");
        year = estEntier();
        
        if(year < currentYear && year > 1900){
            System.out.println("Votre nom est : "+nom);
            System.out.println("Votre prenom est : "+prenom);
            System.out.printf("%s %d %s", "Vous avez ", currentYear-year, " ans");
        } else {
            System.out.println("Erreur dans la date");
        }
*/
        
        /* 
    ============================================================================    
            EXERCICE 2 
        Modifier l’algorithme de la calculatrice simple afin qu’elle puisse 
        effectuer en plus des additions et des soustractions, des opérations de 
        multiplications et de divisions. Assurez-vous que l’on ne puisse diviser
        par zéro.
    ============================================================================
        
        
        int nbr1, nbr2;
        String entry;
        char op; 
        
        System.out.println("Entrez un premier nombre");
        nbr1 = estEntier();
        System.out.println("Entrez un second nombre");
        nbr2 = estEntier();
        System.out.println("Entrez votre operateur");
        entry = sc.nextLine();
        op = entry.charAt(0);
        
        switch(op){
                System.out.println(nbr1+nbr2);
                break;
            case '-':
                System.out.println(nbr1-nbr2);
                break;
            case '*':
                System.out.println(nbr1*nbr2);
                break;
            case '/':
                if(nbr2 > 0)
                    System.out.println(nbr1/nbr2);
                else
                    System.out.println("Erreur, on ne peut diviser par 0");
                break;
            default :
                System.out.println("Erreur");
                break;
        }
*/
        
            /* 
    ============================================================================    
            EXERCICE 3 
        Écrire un algorithme (pseudo code) qui demande un nombre plus grand que 
        100.  En cas de réponse inférieure à 100, on fera apparaître un message: 
        « Plus petit que 100! Entrez de nouveau un nombre.», sinon on fera 
        apparaître un message : « Votre numéro est : » et on affichera le numéro
        entré.
    ============================================================================
          
            
         int n;
         
        System.out.println("Entrez un nombre plus que 100");
        n = sc.nextInt();
        
        while(n < 100){
            System.out.println("Plus petit que 100 ! Entrez de nouveau un nombre");
            n = sc.nextInt();
        }
        
        System.out.println("Votre nombre est : "+n);
*/ 
            
                /* 
    ============================================================================    
            EXERCICE 4 
        Faites l’algorithme (pseudo code) permettant de classer en ordre 
        croissant trois nombres fournis par l’usager du programme.
    ============================================================================        

                
        int a, b, c;
         
        System.out.println("Entrez un premier nombre");
        a = sc.nextInt();
        System.out.println("Entrez un second nombre");
        b = sc.nextInt();
        System.out.println("Entrez un troisieme nombre");
        c = sc.nextInt();
                        
        if(a<=b && b<=c)
            System.out.printf("%s %s %s\n", a, b, c);
        else if(a<=c && c<=b)
            System.out.printf("%s %s %s\n", a, c, b);
        else if(b<=c && c<=a)
            System.out.printf("%s %s %s\n", b, c, a);
        else if(b<=a && a<=c)
            System.out.printf("%s %s %s\n", b, a, c);
        else if(c<=a && a <=b)
            System.out.printf("%s %s %s\n", c, a, b);
        else 
            System.out.printf("%s %s %s\n", c, b, a);
                
*/                 
    /* 
    ============================================================================    
            EXERCICE 5 
        Écrire un algorithme qui permet d’échanger le contenu de deux variables
    ============================================================================            

    
    String a, b, c;
    a = "Hello";
    b = "World";
    
    c = a;
    a = b; 
    b = c; 
    
        System.out.println(a+b);
*/    
    /*
    ============================================================================    
            EXERCICE 6 
        Produisez le pseudocode qui demande à l’utilisateur de lui fournir 3 
        nombres et qui affiche le plus petit. 
    ============================================================================

    
    int nbr1, nbr2, nbr3; 
    
        System.out.println("Entrez un premier nombre");
        nbr1 = sc.nextInt();
        System.out.println("Entrez un second nombre");
        nbr2 = sc.nextInt();
        System.out.println("Entrez un troisieme nombre");
        nbr3 = sc.nextInt();
        
        if(nbr1 <= nbr2 && nbr1 <= nbr3)
            System.out.println("Le plus petit nombre est "+nbr1);
        else if(nbr2 <= nbr1 && nbr2 <= nbr3)
            System.out.println("Le plus petit nombre est "+nbr2);
        else
            System.out.println("Le plus petit nombre est "+nbr3);
*/
    /*
    ============================================================================    
            EXERCICE 6 
        Écrire un algorithme (pseudo code) qui permet de savoir si une année est
        bissextile
        En fait c'est trés simple, si l 'année est divisible par 4 et en même 
        temps elle n'est pas divisible par 100 ou au contraire qu'elle soit 
        divisible par 400 alors elle est bissextile, sinon elle ne l'est pas.
 
    ============================================================================
        
    int year; 
    
        System.out.println("Entrez l'annee");
        year = estEntier();
        
        if(year >= 0){
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                System.out.println("Annee bissextile");
            else 
                System.out.println("Annee non-bissextile");
        } else 
            System.out.println("Erreur dans l'entree de l'annee");
    
*/
    
    

    }
    
        static int estEntier(){
        Scanner sc = new Scanner(System.in);
        int n;            
        while(!sc.hasNextInt()){
            System.out.println("Erreur, entrez un nombre entier");
            sc.next(); 
            } 
            return n = sc.nextInt();
        }
    
}
