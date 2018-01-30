/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;

/**
 *
 * @author Cli
 */
public class nodo {
         int dato;
    nodo enlace;
    public nodo getEnlace;
    public nodo getenlace;
 public nodo(int x){
     dato = x;
     enlace = null;
}
  public int getDato(){
     return dato;
}
  public nodo getEnlace()
{
    return enlace;
}
  public void setEnlace(nodo enlace)
{
    this.enlace = enlace;
  }
}


    
 
    

