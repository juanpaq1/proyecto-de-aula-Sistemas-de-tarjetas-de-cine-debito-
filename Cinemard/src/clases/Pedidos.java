/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Pedidos {

    private int Num_Bol_Com;
    private int Num_Com_Com;
    private ArrayList<Comida> comidas;
    private ArrayList<Boleta> boletas;
    private double TotalPagar;

    public Pedidos() {
        this.Num_Bol_Com = 0;
        this.Num_Com_Com = 0;

    }

    public int getNum_Bol_Com() {
        return Num_Bol_Com;
    }

    public void setNum_Bol_Com(int Num_Bol_Com) {
        this.Num_Bol_Com = Num_Bol_Com;
    }

    public int getNum_Com_Com() {
        return Num_Com_Com;
    }

    public void setNum_Com_Com(int Num_Com_Com) {
        this.Num_Com_Com = Num_Com_Com;
    }

    public void agregarBoletas(int CantidadBol) {
        Num_Bol_Com += CantidadBol;
    }

    public void agregarCombos(int CantidadCom) {
        Num_Com_Com += CantidadCom;
    }

    public ArrayList<Comida> getComidas() {
        return comidas;
    }

    public void setComidas(ArrayList<Comida> comidas) {
        this.comidas = comidas;
    }

    public ArrayList<Boleta> getBoletas() {
        return boletas;
    }

    public void setBoletas(ArrayList<Boleta> boletas) {
        this.boletas = boletas;
    }

    public double getTotalPagar() {
        return TotalPagar;
    }

}


