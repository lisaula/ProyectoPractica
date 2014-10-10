/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class TestArray {
    public static void main(String[] args) {
        ArrayList<Integer> numeros= new ArrayList<>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(7);
        
        //size of a arraylist   
        System.out.println("Size: "+ numeros.size());
        
        //sacar un elemento de acuerdo a su posicion
        System.out.println(numeros.get(0));
        
        //remover elementos 
        
        numeros.remove(0);
        System.out.println("New Size: "+ numeros.size());
        
        //recorrer
       
        
        for( int p=0; p< numeros.size() ; p++){
            System.out.println(numeros.get(p));
        }
        
        
    }
}
