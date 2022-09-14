/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packClases;

/**
 *
 * @author Administrador
 */
public class PrimeraClase {
    int unEntero;
    String unaCadena;
    public void mostrar(){
        System.out.println("Los atributos de los objetos creados son: " +unaCadena + " y " +unEntero);        
    }
    public static void main(String[] args) {
        
        
        PrimeraClase unObjeto1 = new PrimeraClase();
        PrimeraClase unObjeto2 = new PrimeraClase();
        PrimeraClase unObjeto3 = new PrimeraClase();
        PrimeraClase unObjeto4 = new PrimeraClase();
        PrimeraClase unObjeto5 = new PrimeraClase();
        
        unObjeto1.unaCadena = "Ventilador";
        unObjeto1.unEntero = 5;
        unObjeto2.unaCadena = "Pizarra";
        unObjeto2.unEntero = 2;
        unObjeto3.unaCadena = "Aire Acondicionado";
        unObjeto3.unEntero = 1;
        unObjeto4.unaCadena = "Proyector";
        unObjeto4.unEntero = 3;
        unObjeto5.unaCadena = "PCs";
        unObjeto5.unEntero = 15;
        
        unObjeto1.mostrar();
        unObjeto2.mostrar();
        unObjeto3.mostrar();
        unObjeto4.mostrar();
        unObjeto5.mostrar();
        
    }
}
