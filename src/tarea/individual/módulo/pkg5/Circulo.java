/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.individual.módulo.pkg5;


public class Circulo extends Formas{
private double Radio;

public Circulo(){}
public Circulo(double radio){
this.Radio=radio;
}
    public double getRadio() {
        return Radio;
    }


    
    public void setRadio(double Radio) {
        this.Radio = Radio;
    }
    public void Dibujar(){
    String forma ="Circulo";
        Dibujar(forma);
    }
    
    public void Calcular_Radio(){
    
        System.out.println("El radio es :"+getRadio());
    
    }
}
