/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;

import java.util.Scanner;

/**
 *
 * @author ecollazodominguez
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedimos una cantidad y la desglosamos en billetes de 100,20,5 y 1.
        Scanner ler = new Scanner(System.in);
        System.out.println("Cantidad de dinero: ");
        int dinero=ler.nextInt();
        
        //Contamos billetes, usamos el resto de las operationces para calcular.
        int b100=dinero/100;
        int b20=dinero%100/20;
        int b5=(dinero%100%20)/5;
        int b1=((dinero%100%20)%5)/1;
        
        System.out.println("Billetes de 100€= "+b100+"\nBilletes de 20€= "+b20+"\nBilletes de 5€="+b5+"\nBilletes de 1€= "+b1);
    }
    
}
