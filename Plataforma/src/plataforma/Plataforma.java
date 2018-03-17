/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plataforma;

import java.util.Scanner;

/**
 *
 * @author JuanJ
 */
public class Plataforma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CreaArch obj1 = new CreaArch();
        CursosyMaterias obj2 = new CursosyMaterias();
        LeeArch obj3 = new LeeArch();

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1.-Gestion personas.");
            System.out.println("2.-Cursos Y materias.");
            System.out.println("3.-Listado estudiantes.");
            System.out.println("4.-Listado Docentes");
            opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.println("GESTION PERSONAS");
                System.out.println("1.-Gestion PROFESORES.");
                System.out.println("2.-Gestion ESTUDIANTES.");
                int slct = sc.nextInt();
                if (slct == 1) {
                    obj1.CreaArchP();
                }
                if (slct == 1) {
                    obj1.CreaArchE();
                }
            }
            if (opcion == 2) {

            }
            if (opcion == 3) {
                obj3.LeeArchE();
            }
            if (opcion == 4) {
                obj3.LeeArchP();
            }

        }
    }

}
