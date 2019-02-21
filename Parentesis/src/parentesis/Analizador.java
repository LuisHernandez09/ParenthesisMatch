/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parentesis;

import java.util.LinkedList;

/**
 *
 * @author Enmanuel
 */
public class Analizador {

    public Analizador() {
    }
    
    String cadena = "";
    
    public boolean Prueba(String cadena)
    {
        boolean resultado=false;
        String letra="";
        
        
        LinkedList aperturaP = new LinkedList<>();
        LinkedList cierreP = new LinkedList<>();
        
        LinkedList aperturaC = new LinkedList<>();
        LinkedList cierreC = new LinkedList<>();
        
        LinkedList aperturaL = new LinkedList<>();
        LinkedList cierreL = new LinkedList<>();
        
        String cierre[] = new String[100];
            for(int i=0;i<cadena.length();i++){
                letra = String.valueOf(cadena.charAt(i));
                if(letra.equals("(")){
                    aperturaP.add("(");
                }
                else{
                    if(letra.equals(")")){
                        cierreP.add("(");
                    }
                    else{
                        if(letra.equals("[")){
                            aperturaC.add("[");
                        }
                        else{
                            if(letra.equals("]")){
                                cierreC.add("]");
                            }
                            else{
                                if(letra.equals("{")){
                                    aperturaL.add("{");
                                }
                                else{
                                    if(letra.equals("}")){
                                        cierreL.add("}");
                                    }
                                }
                            }
                        }
                    }
                }
                //System.out.println(cadena.charAt(i));
            }
            
            
            if((aperturaP.size()==cierreP.size()) && (aperturaC.size()==cierreC.size())&&(aperturaL.size()==cierreL.size())){
                resultado=true;
            }
            else{
                resultado=false;
            }
        
            
        return resultado;
    }
    
}

