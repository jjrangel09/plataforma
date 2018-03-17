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
public class LeeArch {

    public void LeeArchP(){
        
        try {
            FileInputStream fis = new FileInputStream("C:/Users/JuanJ/Desktop/Profesor.dat");
            ObjectInputStream leeArch = new ObjectInputStream(fis);
            System.out.println("Listado Profesores");
            while (true) {
                Profesor recuperado = (Profesor) leeArch.readObject();
                System.out.println("Datos:");
                System.out.println(recuperado.toString());
                System.out.println("-------------------------");
                if(fis == null){
                    fis.close();
                }
                if(leeArch == null){
                    leeArch.close();
                }
            }
            
        } catch (Exception e) {
            
        }
        
    }
    public void LeeArchE(){
        try (ObjectInputStream leeArch = new ObjectInputStream(new FileInputStream("C:/Users/JuanJ/Desktop/Estudiante.dat"))) {
            System.out.println("Listado Estudiantes");
            while(true) {
                Profesor recuperado = (Profesor) leeArch.readObject();
                System.out.println("Datos:");
                System.out.println(recuperado.toString());
                System.out.println("-------------------------");
            }
 //leeArch.close();
        } catch (Exception e) {
           
        }
    }

}
