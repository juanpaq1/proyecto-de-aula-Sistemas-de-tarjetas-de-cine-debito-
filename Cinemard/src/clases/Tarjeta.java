/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author HP
 */
public class Tarjeta {
    
    
    private String nombreUsuario;
    private String cedulaUsuario;
    private double Csal;

    public Tarjeta(String Nombre,String Cedula, double saldoInicial) {
        this.nombreUsuario = Nombre;
        this.cedulaUsuario = Cedula;
        this.Csal = saldoInicial;
    }    

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCedulaUsuario() {
        return cedulaUsuario;
    }

    public void setCedulaUsuario(String cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    public double getSaldo() {
        return Csal;
    }

    public void setSaldo(double saldo) {
        this.Csal = saldo;
    }
    
     public void comprarBoletas(int cantidadBoletas, double costoPorBoleta) {
        double costoTotal = cantidadBoletas * costoPorBoleta;
        if (Csal >= costoTotal) {
            Csal -= costoTotal;
            System.out.println("Compra de " + cantidadBoletas + " boleta(s) exitosa. Nuevo saldo: " + Csal);
        } else {
            System.out.println("Saldo insuficiente para comprar " + cantidadBoletas + " boleta(s).");
        }
    }

    public void comprarCombo(int numeroCombo, double precioCombo, int cantidadCombos) {
        double costoTotal = precioCombo * cantidadCombos;
        if (Csal >= costoTotal) {
            Csal -= costoTotal;
            System.out.println("Compra de " + cantidadCombos + " combo(s) " + numeroCombo + " exitosa. Nuevo saldo: " + Csal);
        } else {
            System.out.println("Saldo insuficiente para comprar " + cantidadCombos + " combo(s) " + numeroCombo);
        }
    }
}
