/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

/**
 *
 * @author Cli
 */
public class Ejercicios {
   public int x;
    private int y;
    public Ejercicios (int x_,int y_ )
    {
        x=x_;
        y=y_;
    }
    public Ejercicios()
    {
        x=y=0;
    }
    public int leerx()
    {
        return x;
    }
    public int leery()
    {
        return y;
    }
    void fijarx(int valorx)
    {
        x=valorx;
    }
    void fijary(int valory)
    {
        y=valory;
    }
}
