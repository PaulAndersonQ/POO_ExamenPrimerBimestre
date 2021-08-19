/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Persona;

/**
 *
 * @author Usuario
 */
public class Aplicacion {
    public static void main(String[] args) {
        
        Cliente a1=new Cliente();
        Cliente a2=new Cliente("0990394609");
        
        Persona n1= new Persona();
        Persona n2= new Persona("Anderson", "20");
        
        System.out.println("Los datos del cliente son: Telefono: " +a2.getTelefono()+" Nombre: "+n2.getNombre()+" Edad: "+n2.getEdad());
    }
}
