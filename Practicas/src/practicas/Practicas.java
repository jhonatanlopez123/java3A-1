/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

import java.util.Scanner;

/**
 *
 * @author Family
 */
public class Practicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CREE UN SCRIPT QUE PERMITA VISUALIZAR LOS NÚMEROS 
        //DEL 1 AL 10 CON CICLO FOR INICIANDO LA VARIABLE INCREMENTO EN 0
        /*int i=0;
        for(i=0;i<10;i++){
            System.out.println(i+1);
        }
        System.out.println("#######################################");
        //CREE UN SCRIPT QUE PERMITA VISUALIZAR LOS NÚMEROS 
        //DEL 1 AL 10 CON CICLO FOR INICIANDO LA VARIABLE INCREMENTO EN 1
        for(i=1;i<=10;i++){
            System.out.println(i);
        }*/
        
        //int Numbers[] = new int[10], i=0;
        //String Names[] = new String[10];
        
        //Insert data into vectors
        //Numbers[0] = 10;
        /*
        Names[0] = "Peter";
        Names[1] = "Juan";
        Names[2] = "Manuel";
        Names[3] = "Felipe";
        Names[4] = "Carlos";
        Names[5] = "Fabian";
        Names[6] = "Maria";
        Names[7] = "Isabel";
        Names[8] = "Marta";
        Names[9] = "Sofia";
        */
        //Show vector data
        /*System.out.println("The number at index 0 is: " + Numbers[0]);
        System.out.println("The name at index 0 is: " + Names[0]);
        System.out.println("The vector size is: " + Names.length);
        
        for(i=0;i<Names.length;i++){
            System.out.println("Name " + (i+1) + ": " + Names[i]);
        }
        */
       
       int x = 0, i= 0; 
       Scanner l = new Scanner(System.in);
       System.out.println("digite la cantidad de numeros: ");
       int a = l.nextInt();
       int b[] = new int [a];
       for(i = 1;i<=a;i++){
            System.out.println("digite un numero: ");
            x = l.nextInt();
//            System.out.println(i);
            b[i-1] = x;
            if (i>=3){
                int v = b[i-2] + b[i-3];
                if (v == b[i-1]){
                    System.out.println("-----------");
                    System.out.println("ERROR");
                    System.out.println("-----------");
                    i--;
                }
            }
       }
        
        
        
        
    }
    
}
