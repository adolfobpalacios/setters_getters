/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerveza;

/**
 *
 * @author abp392
 */
import java.util.*;
public class Cerveza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        estructura_cerveza corona = new estructura_cerveza("corona", "clara", 5);
        
        ArrayList<estructura_cerveza> cervezas = new ArrayList <estructura_cerveza>();
        cervezas.add(corona);
        cervezas.add(new estructura_cerveza("victoria","oscura",4));
        
        for(estructura_cerveza lista_cervezas : cervezas)
        {
            System.out.println(lista_cervezas.getNombre());
            System.out.println(lista_cervezas.getTipo());
            System.out.println(lista_cervezas.getGrado_de_Alcohol());
        }
    }
    
}
