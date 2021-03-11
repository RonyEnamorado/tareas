/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.individual.módulo.pkg5;


    public class Cuadrado extends Formas {
private double Area;

public Cuadrado(){}
public Cuadrado(double area){
this.Area=area;
}
    public double getArea() {
        return Area;
    }


    
    public void setArea(double Area) {
        this.Area = Area;
    }
    public void Dibujar(){
    String forma ="Cuadrado";
        Dibujar(forma);
    }
    
    public void Calcular_Area(){
    
        System.out.println("El Area es :"+getArea());
    
    }
}

