/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author HP
 */
public class Boleta {
    
      private final double Pbole=8000;
      private int Nbole;
      

    public Boleta(int Nbole) {
        this.Nbole = Nbole;
    }

    public double getPbole() {
        return Pbole;
    }

    public int getNbole() {
        return Nbole; 
    }

    public void setNbole(int Nbole) {
        this.Nbole = Nbole;
    }
    
    
}
