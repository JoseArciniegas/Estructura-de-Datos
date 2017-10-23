/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap4.arboles;

/**
 *
 * @author Arciniegas
 */
public class NodoArbol {
    int dato;
    NodoArbol hIzquierdo;
    NodoArbol hDerecho;
    
    public NodoArbol(int d){
        this.dato=d;
        this.hDerecho=null;
        this.hIzquierdo=null;
    }
    
}
