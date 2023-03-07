/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notationscientifique;

import java.util.Scanner;


/**
 *
 * @author Sklaerenn
 */
public class NotationScientifique {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double n, m ;
        int cpte = 0;
        
        
        System.out.println("Entrez un nombre");
        while(!sc.hasNextDouble()){
            System.out.println("Erreur dans l'entree du nombre. Reessayez");
            sc.next();
        } n = sc.nextDouble();
        
        m = n; //Stockage de la valeur originale de n pour l'affichage à la fin de l'operation
        
        if(n > 1 || n < -1){
            while(n > 10 || n < -10){
                n = n / 10;
                cpte ++;
            }
        } else if(n < 0 && n > -1) {
            while(n > -1){
                n = n*10;
                cpte --;
            }
        } else {
            while(n < 1){
                n = n*10;
                cpte --;
            }
        }
        
        System.out.println(m + " en notation scientifique = "+ n+" 10E"+cpte);
        
    }
    
}
