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
    
    public Boolean buscar(int dato){
        Nodo aux = cabeza;
        while(aux != null){
            if(aux.getDato()==(dato)){
            } else {
                return true;
            }
            aux=aux.getSiguiente();
        }
        return false;
    }
    
    public void Actualizar(int dato){
        if(cabeza==null){
            System.out.println("Lista vacia");
        }else{
            if(cabeza!=null){
                int aux = dato;
            }
        }
    }
    
    public void Borrar(Nodo cabeza,Nodo cola){
        if(cabeza!=null){
            this.cabeza=null;
        } else {
            System.out.println("La cabeza ya esta vacia");
        }
        if(cola!=null){
            this.cola=null;
        }else{
            System.out.println("La cola ya esta vacia");
        }
    }
    
}
