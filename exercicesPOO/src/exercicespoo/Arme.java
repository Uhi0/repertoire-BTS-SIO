/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicespoo;

/**
 *
 * @author Administrateur
 */
public class Arme {
    private String nomArme;
    private int degats;
    public Arme(String nomArme, int degats) {
        this.nomArme = nomArme;
        this.degats = degats;
    }
    public int getDegats() {
        return degats;
    }
    
    public String getNomArme() {
        return nomArme;
    }
    
    
}
