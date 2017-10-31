/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap4.arboles;

/**
 *
 * @author utp
 */
public class NodoAVL {

    private NodoAVL hIzquierdo;
    private NodoAVL hDerecho;
    private int dato;
    private int comparador;
    private NodoAVL raiz;

    public NodoAVL(NodoAVL hiz, NodoAVL hd, int comp, int dato) {
        this.hIzquierdo = hiz;
        this.hDerecho = hd;
        this.comparador = 0;
        this.dato = dato;
        this.raiz = null;
    }

    /**
     * @return the hIzquierdo
     */
    public NodoAVL gethIzquierdo() {
        return hIzquierdo;
    }

    /**
     * @param hIzquierdo the hIzquierdo to set
     */
    public void sethIzquierdo(NodoAVL hIzquierdo) {
        this.hIzquierdo = hIzquierdo;
    }

    /**
     * @return the hDerecho
     */
    public NodoAVL gethDerecho() {
        return hDerecho;
    }

    /**
     * @param hDerecho the hDerecho to set
     */
    public void sethDerecho(NodoAVL hDerecho) {
        this.hDerecho = hDerecho;
    }

    /**
     * @return the dato
     */
    public int getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(int dato) {
        this.dato = dato;
    }

    /**
     * @return the comparador
     */
    public int getComparador() {
        return comparador;
    }

    /**
     * @param comparador the comparador to set
     */
    public void setComparador(int comparador) {
        this.comparador = comparador;
    }

}
