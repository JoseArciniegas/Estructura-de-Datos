/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.utiles.nodos;

/**
 *
 * @author tusk
 */
public class NodoDoble {
    private Nodo cabeza;
    private Nodo cola;
    
    public NodoDoble(){
        cabeza=null;
        cola=null;
    }
    
    public void insertarCabeza(int dato){
        if(cabeza == null){
            cabeza=new Nodo(dato, null, null);
            cola = cabeza;
        }else{
            Nodo nuevo = new Nodo(dato, null, cabeza);
            cabeza.setAnterior(nuevo);
            cabeza = nuevo;
        }
        
    }
    
    public void insertarCola(int dato){
        if(cabeza==null){
            cola=new Nodo(dato,null,null);
            cabeza=cola;
        }else{
            Nodo nuevo = new Nodo(dato, null, cabeza);
            cola.setAnterior(nuevo);
            cola=nuevo;
        }
    }
    
}
