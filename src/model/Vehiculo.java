/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Natha
 */
public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private double precio;
    private String tipo;

    public Vehiculo(String matricula, String marca, String modelo, double precio, String tipo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", tipo=" + tipo + '}';
    }
    
    
    
    
}
