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
public class ArbolAVL {

    private NodoArbolAVL raiz;

    public ArbolAVL() {
        raiz = null;
    }

    public NodoArbolAVL Buscar(int d, NodoArbolAVL r) {
        if (raiz == null) {
            return null;
        } else if (r.dato == d) {
            return r;
        } else if (r.dato < d) {
            return Buscar(d, r.hderecho);
        } else {
            return Buscar(d, r.hizquierdo);
        }
    }

    public int FE(NodoArbolAVL x) {
        if (x == null) {
            return -1;
        } else {
            return x.fe;
        }
    }

    public NodoArbolAVL RotacionIzquierda(NodoArbolAVL c) {
        NodoArbolAVL aux = c.hizquierdo;
        c.hizquierdo = aux.hderecho;
        aux.hderecho = c;
        c.fe = Math.max(FE(c.hizquierdo), FE(c.hderecho)) + 1;
        aux.fe = Math.max(FE(aux.hizquierdo), FE(aux.hderecho)) + 1;
        return aux;
    }

    public NodoArbolAVL RotacionDerecha(NodoArbolAVL c) {
        NodoArbolAVL aux = c.hderecho;
        c.hderecho = aux.hizquierdo;
        aux.hizquierdo = c;
        c.fe = Math.max(FE(c.hizquierdo), FE(c.hderecho)) + 1;
        aux.fe = Math.max(FE(aux.hizquierdo), FE(aux.hderecho)) + 1;
        return aux;
    }

    public NodoArbolAVL RotacionII(NodoArbolAVL c) {
        NodoArbolAVL aux;
        c.hizquierdo = RotacionDerecha(c.hizquierdo);
        aux = RotacionIzquierda(c);
        return aux;
    }

    public NodoArbolAVL RotacionDD(NodoArbolAVL c) {
        NodoArbolAVL aux;
        c.hderecho = RotacionIzquierda(c.hderecho);
        aux = RotacionDerecha(c);
        return aux;
    }

    public NodoArbolAVL InsertarAVL(NodoArbolAVL nuevo, NodoArbolAVL subAr) {
        NodoArbolAVL nuevoPadre = subAr;
        if (nuevo.dato < subAr.dato) {
            if (subAr.hizquierdo == null) {
                subAr.hizquierdo = nuevo;
            } else {
                subAr.hizquierdo = InsertarAVL(nuevo, subAr.hizquierdo);
                if ((FE(subAr.hizquierdo) - FE(subAr.hderecho) == 2)) {
                    if (nuevo.dato < subAr.hizquierdo.dato) {
                        nuevoPadre = RotacionIzquierda(subAr);
                    } else {
                        nuevoPadre = RotacionII(subAr);
                    }
                }
            }
        } else if (nuevo.dato > subAr.dato) {
            if (subAr.hderecho == null) {
                subAr.hderecho = nuevo;
            } else {
                subAr.hderecho = InsertarAVL(nuevo, subAr.hderecho);
                if ((FE(subAr.hderecho) - FE(subAr.hizquierdo) == 2)) {
                    if (nuevo.dato > subAr.hderecho.dato) {
                        nuevoPadre = RotacionDerecha(subAr);
                    } else {
                        nuevoPadre = RotacionDD(subAr);
                    }
                }
            }
        } else {
            System.out.println("Nodo duplicado");
        }
        if ((subAr.hizquierdo == null) && (subAr.hderecho != null)) {
            subAr.fe = subAr.hderecho.fe + 1;
        } else if ((subAr.hderecho == null) && (subAr.hizquierdo != null)) {
            subAr.fe = subAr.hizquierdo.fe + 1;
        } else {
            subAr.fe = Math.max(FE(subAr.hizquierdo), FE(subAr.hderecho)) + 1;
        }
        return nuevoPadre;
    }

    public void Insertar(int d) {
        NodoArbolAVL nuevo = new NodoArbolAVL(d);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            raiz = InsertarAVL(nuevo, raiz);
        }
    }

    public void Orden(NodoArbolAVL r) {
        if (r != null) {
            Orden(r.hizquierdo);
            System.out.println(r.dato + ",");
            Orden(r.hderecho);
        }
    }

    public void PreOrden(NodoArbolAVL r) {
        if (r != null) {
            System.out.println(r.dato + ",");
            PreOrden(r.hizquierdo);
            PreOrden(r.hderecho);
        }
    }

    public void PostOrden(NodoArbolAVL r) {
        if (r != null) {
            PostOrden(r.hizquierdo);
            PostOrden(r.hderecho);
            System.out.println(r.dato + ",");
        }
    }

}

