/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturasderepeticao;
import java.util.*;
/**
 *
 * @author Madalena Makiesse
 */
public class ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner l = new Scanner(System.in);
        
        int i= 0 , numpar = 0 , numimpar = 0 , num = -1;
        for(i=0; num!=0 ; i++){
            System.out.println("Numero: ");
            num = l.nextInt();
            if(num%2==0){ numpar = numpar + 1;}
            else {numimpar = numimpar + 1 ;}
    }
     System.out.println("Total de números pares: "+numpar+"\nTotal de números ímpares: "+numimpar);
}}
