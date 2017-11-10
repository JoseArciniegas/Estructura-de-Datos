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
public class NodoArbolAVL {
    int dato;
    int fe;
    NodoArbolAVL hizquierdo;
    NodoArbolAVL hderecho;
    
    public NodoArbolAVL(int d){
        this.dato=d;
        this.fe=0;
        this.hizquierdo=null;
        this.hderecho=null;
    }
    
}
