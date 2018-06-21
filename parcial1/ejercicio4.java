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
public class ejercicio4 {
     public static void main(String[] args) {
       Scanner n=new Scanner(System.in);
       int nume,suma,elementos,max = 0,min = 0;
       
       
       float media;
       
       System.out.println("Introduzca un numero: ");
       nume=n.nextInt();
       
       suma=0;
       elementos=0;
       
       while(nume>=0){
           
           suma+=nume;
           elementos++;
           
           System.out.println("Introduzca un numero: ");
           nume=n.nextInt();
           
     if (min != 0 && max != 0) {
                if (nume > max) {
                    max = nume;
                }
                if (nume < min) {
                    min = nume;
                }
            } else {
                min = nume;
                max = nume;
            }
        }
       
       if(elementos==0){
           
           System.out.println("Imposible hacer la media");
           
       }
       else{
           media=(float)suma/elementos;
           System.out.println("La media es de:\n "+media);
           System.out.println("el valor minimo es\n" +min);
           System.out.println("El valir maximo es\n" +max);
           System.out.println("La suma de los valores positivos es\n" +suma);
           System.out.println("El total de numeros introducidos es\n" +elementos);
           
        
           
       
           
    
              

      		
}	}

}
   

