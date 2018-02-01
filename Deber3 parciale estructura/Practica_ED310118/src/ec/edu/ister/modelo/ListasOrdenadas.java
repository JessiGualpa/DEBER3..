
package ec.edu.ister.modelo;

/**
 *
 * @author pauly
 */
public class ListasOrdenadas {
   protected Nodo primero;
    public ListasOrdenadas(){
        primero=null;
    }
    public ListasOrdenadas insertarCabezaLista(int entrada){
        Nodo nuevo;
        nuevo=new Nodo(entrada);
        nuevo.enlace=primero;
        primero=nuevo;
        return this;   
    }
    public void visualizar(){
        Nodo n;
        int k=0;
        n=primero;
        while(n!=null){
            System.out.print(n.dato+" ");
            n=n.enlace;
            k++;
            System.out.print((k%15!=0?" ":"\n"));
        }
    }
    

    public boolean ListaVacia () {
        return(primero==null);
        
    }
    
    

}