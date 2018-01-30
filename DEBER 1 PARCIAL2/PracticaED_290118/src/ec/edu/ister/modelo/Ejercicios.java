/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import ec.edu.ister.controlador.nodo;

/**
 *
 * @author PAULIY
 */
public class Ejercicios {
     protected nodo primero;
    public Ejercicios(){
        primero=null;
    }
    public Ejercicios insertarcabeseralista(int entrada){
        nodo nuevo;
        nuevo=new nodo(entrada);
        nuevo.getenlace=primero;
        primero=nuevo;
        return this;    
    }
    public void visualizar(){
        nodo n;
        int k=0;
        n=primero;
        while(n!=null){
            
            System.out.print(n.getDato() +" ");
            n=n.getEnlace;
            k++;
            System.out.print(k%15 !=0 ? " ":"/n");
        }
    }

}
  

