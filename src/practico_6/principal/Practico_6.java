/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico_6.principal;

import practico_6.entidades.*;

import java.util.Iterator;

/**
 *
 * @author Usuario
 */
public class Practico_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Directorio d1 = new Directorio();
        d1.agregarCliente(25381304, "Pogliese", "Javier", "Merlo", 266481043);
        d1.agregarCliente(27462011, "Abram", "Paula", "Rosario", 266427427);
        
        
        Iterator<Cliente> it = d1.getDirectorio().iterator();
         while (it.hasNext()) {
 
        System.out.println(it.next().getApellido());
         }
           
         
        
    }
    
}
