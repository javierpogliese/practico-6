/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico_6.entidades;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Usuario
 */
public class Directorio {
    protected HashSet <Cliente> directorio = new HashSet();
    
    public void agregarCliente(long dni, String apellido, String nombre, String ciudad, long telefono) {
        directorio.add(new Cliente(dni, apellido, nombre, ciudad, telefono));
    }
    
    public void buscarCliente(long telefono) {
             
    }
    
    
    public void buscarTelefono(String apellido) {
        
    }
    
    public void buscarClientes (String apellido) {
        
    }
    
    public void borrarCliente (Cliente cliente) {
        directorio.remove(cliente);
    }

    public HashSet<Cliente> getDirectorio() {
        return directorio;
        
    }
    
    
}

