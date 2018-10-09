/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;

import java.util.Scanner;

/**
 *
 * @author ecollazodominguez
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedimos CANTIDAD de billetes, multiplicamos su valor y mostramos total.
        Scanner ler = new Scanner(System.in);
        System.out.println("Billetes de 100€: ");
        short b100=ler.nextShort();
        System.out.println("billetes de 20€: ");
        short b20=ler.nextShort();
        System.out.println("Billetes de 5€: ");
        short b5=ler.nextShort();
        System.out.println("Billetes de 1€: ");
        short b1=ler.nextShort();
        
        System.out.println("Su total es de: "+(b100*100+b20*20+b5*5+b1*1)+" €");
    }
    
}
