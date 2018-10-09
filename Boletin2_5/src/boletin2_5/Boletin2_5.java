/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_5;

import java.util.Scanner;

/**
 *
 * @author ecollazodominguez
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedimos valores para calcular saldo bruto y luego operamos para saldo líquido
        Scanner ler = new Scanner(System.in);
        System.out.println("Sueldo fijo: ");
        float sueldof=ler.nextFloat();
        System.out.println("Importe total de ventas: ");
        float comision=ler.nextFloat();
        System.out.println("Kilometraje: ");
        float kilom=ler.nextFloat();
        System.out.println("Desplazamiento(días): ");
        float dieta=ler.nextFloat();
        
        //Aplicamos comision 5%, 2€ por km y 30€ por desplazamiento día.
        comision=comision*0.05f;
        kilom=2*kilom;
        dieta=30*dieta;
        
        float saldob= sueldof+comision+kilom+dieta;
        
        float irpf= saldob*0.18f;
        float ss= 36f;
        
        System.out.println("Sueldo bruto = "+saldob+" €");
        System.out.println("Sueldo líquido = "+(saldob-irpf-ss)+" €");
        
    }
    
}
