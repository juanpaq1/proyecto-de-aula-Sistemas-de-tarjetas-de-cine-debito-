/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author HP
 */
public class Comida {
    private final double Preciocombo1 = 100.0;
    private final double Preciocombo2 = 150.0;
    private int Num_Com;

    
    public double getPreciocombo(int Num_Com) {
        
        if (Num_Com == 1){
        return Preciocombo1;
        } else if (Num_Com == 2){
            return Preciocombo2;
        } else {
            return 0;
        }
    }

    public int getNum_Com() {
        return Num_Com;
    }

    public void setNum_Com(int Num_Com) {
        this.Num_Com = Num_Com;
    }
}
