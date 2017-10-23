/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap4.arboles;

/**
 *
 * @author tusk
 */
public class ArbolB{
    NodoArbol raiz;
    
    public ArbolB(){
        raiz = null;
    }
    public void Insertar(int dato){
        NodoArbol nuevo = new NodoArbol(dato);
        if(raiz == null){
            raiz= nuevo;
        }else{
            NodoArbol aux = raiz;
            NodoArbol padre;
            while(true){
                padre=aux;
                if(dato<aux.dato){
                    aux=aux.hIzquierdo;
                    if(aux == null){
                        padre.hIzquierdo = nuevo;
                        return;
                    }
                }else{
                    aux=aux.hDerecho;
                    if(aux == null){
                        padre.hDerecho=nuevo;
                        return;
                    }
                }
            }
        }
    }
    public NodoArbol Buscar(int d){
        NodoArbol aux = raiz;
        while(aux.dato!=d){
            if(d<aux.dato){
                aux=aux.hIzquierdo;
            }else{
                aux=aux.hIzquierdo;
            }
            if(aux==null){
                return null;
            }
        }
        return aux;
    }
}
