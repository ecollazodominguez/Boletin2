/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_2;

import java.util.Scanner;

/**
 *
 * @author ecollazodominguez
 */
public class Boletin2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Convertimos celsius a Kelvin y Fahrenheit y mostramos
        Scanner ler = new Scanner(System.in);
        System.out.println("Cº: ");
        float c=ler.nextFloat();
        
        float k=c+273.15f;
        float f=c*1.8f+32f;
        
        System.out.println(+c+"º son "+k+" K\n"+c+"º son "+f+" F");
        
     
    }
    
}
