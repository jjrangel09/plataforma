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
public class Profesor extends Persona implements Serializable {


    private String materias;

    Profesor(int nDocumento, String tipoDoc, String nombre, String apellido) {
        super(nDocumento, tipoDoc, nombre, apellido);
    }

    public void SETMaterias(String mat){
        String materia = "";
        this.materias = materia;
}
}
