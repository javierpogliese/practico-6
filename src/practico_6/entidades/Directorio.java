/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico_6.entidades;

import java.util.HashSet;
import java.util.Iterator;
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
    
    public String buscarCliente(long telefono) {
        for (Cliente cliente : directorio) {
            if (cliente.getTelefono()==telefono) {
                return cliente.toString();
            }
        }
        return null;
    }
    
    
    public String buscarTelefono(String apellido) {
        for (Cliente cliente : directorio) {
            if (cliente.getApellido()==apellido) {
                return cliente.toString();
            }
        }
        return null;
    }
    
    public Set<Cliente> buscarClientes (String apellido) {
        Set<Cliente> filtro = new HashSet<>();
            for (Cliente cliente : directorio) {
                if (cliente.getApellido()==apellido) {
                    filtro.add(cliente);
                }
            }
        return filtro;
    }
    public void borrarCliente (long telefono) {
        for (Cliente cliente : directorio) {
            if (cliente.getTelefono()==telefono) {
                directorio.remove(cliente);
            }
        }
    }

    public HashSet<Cliente> getDirectorio() {
        return directorio;
        
    }

      
}
