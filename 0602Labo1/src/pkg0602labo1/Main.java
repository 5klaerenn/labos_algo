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
        */
        
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
        
        System.out.printf("%d %d %s", nbr1, nbr2, op);
        
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
