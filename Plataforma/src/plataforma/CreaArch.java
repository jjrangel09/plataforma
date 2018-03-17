/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plataforma;

import java.io.*;
import java.util.*;

/**
 *
 * @author JuanJ
 */
public class CreaArch {

    int doc, opcion = 1;
        String tipoDoc, nombre, apellido, correo;
        Scanner nums = new Scanner(System.in);
        Scanner chars = new Scanner(System.in);

        

    public void CreaArchP() {
        
            try {
                try (ObjectOutputStream escribeArch = new ObjectOutputStream(new FileOutputStream("C:/Users/JuanJ/Desktop/Profesor.dat", true))) {
                    while (opcion == 1) {
                        System.out.println("AGREGAR PROFESORES");
                        System.out.println("Digite nombre: ");
                        nombre = chars.nextLine();
                        System.out.println("Digite apellido/s: ");
                        apellido = chars.nextLine();
                        System.out.println("Digite tipo documento (CC/CE/PSPRT): ");
                        tipoDoc = chars.nextLine();
                        System.out.println("Digite Numero documento: ");
                        doc = nums.nextInt();
                        escribeArch.writeObject(new Profesor(doc, tipoDoc, nombre, apellido));
                        
                        System.out.println("Desea agregar Profesor? SI-1 NO-2");
                        opcion = nums.nextInt();
                    }
                }

            } catch (IOException e) {

            }
    }

    public void CreaArchE() {
            try {
                try (ObjectOutputStream escribeArch = new ObjectOutputStream(new FileOutputStream("C:/Users/JuanJ/Desktop/Estudiante.dat", true))) {
                    while (opcion == 1) {
                        System.out.println("AGREGAR ESTUDIANTES");
                        System.out.println("Digite nombre: ");
                        nombre = chars.nextLine();
                        System.out.println("Digite apellido/s: ");
                        apellido = chars.nextLine();
                        System.out.println("Digite tipo documento (CC/CE/PSPRT): ");
                        tipoDoc = chars.nextLine();
                        System.out.println("Digite Numero documento: ");
                        doc = nums.nextInt();
                        escribeArch.writeObject(new Estudiante());
                        
                        System.out.println("Desea agregar Profesor? SI-1 NO-2");
                        opcion = nums.nextInt();
                    }
                }

            } catch (IOException e) {

            }
        }

    

}
