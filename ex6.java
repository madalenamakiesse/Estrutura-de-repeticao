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
public class ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner l = new Scanner (System.in);
        System.out.println("Primeiro número: ");
        int num1 = l.nextInt();
        System.out.println("Segundo número: ");
        int num2 = l.nextInt();
        while(num2==0){
            System.out.println("Segundo número: ");
            num2 = l.nextInt();
        }
        System.out.println(num1+"/"+num2+"="+num1/num2);
    }
    
}
