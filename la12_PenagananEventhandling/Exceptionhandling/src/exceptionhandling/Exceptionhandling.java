/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

/**
 * Nama  : Inar
 * Kelas : Ti-A
 * NIM   : A2.1900082
 * @author 
 */
public class Exceptionhandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try{ 
 
            System.out.println( args[1] ); 
 
        }catch( ArrayIndexOutOfBoundsException exp ){ 
 
            System.out.println("Exception caught!"); 
 
        } 
    }
    
}
