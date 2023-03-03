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
        
        /* 
    ============================================================================    
            EXERCICE 1 
        Écrire un algorithme (pseudo code) qui récupère le nom, 
        le prénom et l’année de naissance d’une personne, ensuite il affiche le 
        nom, le prénom et l’âge de cette personne.
    ============================================================================
        */
        
    String nom, prenom;
    int year;
    int currentYear = 2023;
    Scanner sc=new Scanner(System.in);
    
        System.out.println("Entrez votre nom");
        nom = sc.nextLine();
        System.out.println("Entrez votre prenom");
        prenom = sc.nextLine();
        System.out.println("Entrez votre année de naissance");
        year = sc.nextInt();
        
        if(year < currentYear && year > 1900){
            System.out.println("Votre nom est : "+nom);
            System.out.println("Votre prenom est : "+prenom);
            System.out.printf("%s %d %s", "Vous avez ", currentYear-year, " ans");
        } else {
            System.out.println("Erreur dans la date");
        }
        
        
        
        
        
    }
    
}
