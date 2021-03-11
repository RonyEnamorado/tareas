/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.individual.módulo.pkg5;


public class TareaIndividualMódulo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo figura_circulo=new Circulo(5);
                figura_circulo.Calcular_Radio();
                figura_circulo.Dibujar();
                
                
     
               
        Triangulo figura_triangulo=new Triangulo(9);
                  figura_triangulo.Calcular_Angulo();
                  figura_triangulo.Dibujar();
                  
        Area  figura_cuadrado=new Area(4);
                  figura_cuadrado.Calcular_Area();
                  figura_cuadrado.Dibujar();
                
        Color    figura_formas=new Color();
                  figura_formas.Calcular_Color();
                  figura_formas.Dibujar();
               
                  
        
    }
    
}
