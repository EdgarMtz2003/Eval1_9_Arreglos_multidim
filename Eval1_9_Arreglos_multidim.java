/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moviles
 */
public class Eval1_9_Arreglos_multidim {
    public static void main(String[]args){
        
        int[][] matrizDatos = new int[3][5];
        System.out.println("Filas: "+matrizDatos.length);
        for (int i = 0; i < matrizDatos.length; i++) { //Primer dimension (3 filas)
            System.out.println("Columnas: "+ matrizDatos[i].length);
            for (int j = 0; j < matrizDatos[i].length; j++) { //Segunda dimension (5 columnas)
                matrizDatos[i][j] = 100;
                
            }
 
        }
        
       
        for (int i = 0; i < matrizDatos.length; i++) { //Primer dimension (3 filas)        
            for (int j = 0; j < matrizDatos[i].length; j++) { //Segunda dimension (5 columnas)
                System.out.print("["+matrizDatos[i][j]+"]");
                
            }
            System.out.println("");
 
        }
        
        
    }
    
}
