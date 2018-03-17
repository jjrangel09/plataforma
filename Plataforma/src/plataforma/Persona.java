/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plataforma;

import java.io.*;

/**
 *
 * @author JuanJ
 */
public class Persona implements Serializable {

    
    private int nDocumento;
    private String tipoDoc;
    private String nombre;
    private String apellido;
   

    Persona(int nDocumento, String tipoDoc, String nombre, String apellido) {
        this.nDocumento = nDocumento;
        this.tipoDoc = tipoDoc;
        this.nombre = nombre;
        this.apellido = apellido;
       
    }

   

    public String getNomC() {
        String retorno = nombre + " " + apellido;
        return retorno;
    }

    @Override
    public String toString() {
        String cadena = nombre + " " + apellido +"\n" + nDocumento + "\n" + tipoDoc;
        return cadena;
    }
}
