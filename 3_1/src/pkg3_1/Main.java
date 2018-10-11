/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3_1;

import java.util.Scanner;

/**
 *
 * @author ecollazodominguez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // pedimos numero de alumnos de clase, lo dividimos en 6 grupos y hacemos un grupo extra para el resto y visualizamos.
        Scanner ler = new Scanner(System.in);
        System.out.println("Número de alumnos: ");
        short alumnos=ler.nextShort();
        
        byte grupo=(byte)(alumnos/6),grupor=(byte)(alumnos%6);
        
        System.out.println("Nesta aula hai "+alumnos+" alumnos."+"\nFórmanse 6 grupos de "+grupo+" alumnos e un de "+grupor+" alumnos.");
        
    }
    
}
