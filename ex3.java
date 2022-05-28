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
public class ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner l = new Scanner (System.in);
        
        int i = 0 ;
        while(i<=20){
            if(i%2 == 0){
                System.out.println(i);
            }
            i = i + 1 ;
        }
    }
    
}
