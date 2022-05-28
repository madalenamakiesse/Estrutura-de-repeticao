/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturasderepeticao;
import java.util.*;
import java.io.*;
/**
 *
 * @author Madalena Makiesse
 */
public class ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner l = new Scanner(System.in);
    System.out.println("Número positivo: ");
    int num = l.nextInt();
    while(num < 0){
            System.out.println("Erro!!! Número negativo!");
            System.out.println("Número positivo: ");
            num = l.nextInt();
}
    int i = 0 ;
    while(i <= num){
            System.out.println(i);
            i = i + 1 ;
    
    
    
    }
    
}}
