/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

import java.util.Scanner;

/**
 *
 * @author gizsy
 */
public class ejercicio1 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
                float tbruto;
                float iva; // el factor sera 0.21 en costante  
                float tneto;
                 System.out.println("Escribe el precio bruto ");
                       tbruto=leer.nextFloat();
                       iva=(float) (tbruto*0.21);
                       tneto=tbruto+iva;
                       System.out.println("El resultado es"+tneto);
                       
     }   
}
