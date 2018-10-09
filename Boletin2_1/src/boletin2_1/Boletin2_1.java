/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_1;

import java.util.Scanner;

/**
 *
 * @author ecollazodominguez
 */
public class Boletin2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedimos precio tarifa y pagado y calculamos descuento aplicado
        Scanner ler = new Scanner(System.in);
        System.out.println("Precio tarifa: ");
        float pt=ler.nextFloat();
        System.out.println("Precio pagado: ");
        float pp=ler.nextFloat();
        
        float pd=pt-pp;
        
        System.out.println("Porcentaje descontada: "+pd/pt*100+" %");
        
 
    }
    
}
