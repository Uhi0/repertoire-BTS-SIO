/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicespoo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrateur
 */
public class Menu {
    
    private static Personnage hero;
    private static ArrayList<Personnage> ennemis;
    private static ArrayList<Arme> inventaire = new ArrayList<>();
    
    //variable pour faire de la saisie
    private static Scanner sc = new Scanner(System.in);
    
    /**
     * Créé le héro et un nombre d'ennemis alétoire
     */
    public static void creerPerso(){
        System.out.println("Choisir un nom pour votre héro");
        String nom = sc.next();
        //création de mon héro
        hero = new Personnage(nom, 100);
        //création des armes
        inventaire.add(new Arme("Epée", 10));
        inventaire.add(new Arme("Fronde", 2));
        inventaire.add(new Arme("Arc", 8));
        //choisir une arme
        for (int i = 0; i < inventaire.size(); i++) {
            System.out.println(i+" : "+ inventaire.get(i).getNomArme());
        }
        System.out.println("Choisir une arme pour votre héro (numero)");
        int numArme = sc.nextInt();
        //Equiper le héro de l'arme choisie
        hero.equiper(inventaire.get(numArme));
        
    }
    public static void creerEnnemis(){
        ennemis.add(new Personnage("Zeus", 30, new Arme("Eclair", 10)));
        ennemis.add(new Personnage("Torgal", 100, new Arme("Cailloux", 1)));
        ennemis.add(new Personnage("Orque", 10, new Arme("Marteau", 50)));
    }
    
    public static void demarrer(){
        
        
    }
}
