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
public class Personnage {
    private String nomPerso;
    private int pointsVie;
    private Arme uneArme;
    private Categorie laCategorie;

    public Personnage(String nomPerso, int pointsVie) {
        this.nomPerso = nomPerso;
        this.pointsVie = pointsVie;
    }

    public Personnage(String nomPerso, int pointsVie, Arme uneArme) {
        this.nomPerso = nomPerso;
        this.pointsVie = pointsVie;
        this.uneArme = uneArme;
    }
    
    public void attaquer(Personnage cible){
        //si il a plus de vie que mon arme ne fait de dégat
        if(cible.getPointsVie() > uneArme.getDegats()){
            //enlever de la vie
            cible.setPointsVie(cible.getPointsVie() - uneArme.getDegats());
        }else{ //sinon, il est mort
            cible.setPointsVie(0);
        }
    }
    public void equiper(Arme a){
        uneArme = a;
    }
    public int getPointsVie() {
        return pointsVie;
    }
    public void setPointsVie(int pointsVie) {
        this.pointsVie = pointsVie;
    }
    
    
}
