/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parentesis;

/**
 *
 * @author Enmanuel
 */
public class Parentesis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Analizador analizador = new  Analizador();
        System.out.println(analizador.Prueba("(a[0]+b[2c[6]])(24+53)"));
        
    }
    
}
