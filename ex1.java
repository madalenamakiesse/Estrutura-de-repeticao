/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturasderepeticao;
import java.io.*;
import java.util.*;
/**
 *
 * @author Madalena Makiesse
 */
public class ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner l = new Scanner (System.in);
        
        System.out.println("Nome do utilizador: ");
        
        String nome = l.next();
        
        int i = 0;
        System.out.println("____________________");
        while(i<100){
            System.out.println(nome);
            i = i + 1;
        }
    }
    
}
