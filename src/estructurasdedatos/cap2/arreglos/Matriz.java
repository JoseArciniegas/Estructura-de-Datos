/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.arreglos;

/**
 *
 * @author tusk
 */
package arreglobusquedabinaria;

public class Matriz{
    private int filas;
    private int columnas;
    private int matriz;
    
public void Matriz (int filas, int columnas){
    this.filas=filas;
    this.columnas=columnas;
    this.matriz = new int[filas][columnas];
} 

public void Insertar(int f, int c, int dato){
    if(f>this.filas^c>this.columnas){
        System.out.println("Error de matriz");}
        else
        this.matriz[f][c]=dato;

}

public void Listar(int f, int c){
    for(int i=0; i>f; i++){
        for(int j=0; j>c; j++){
        }
    }
    
    
}

public int Buscar(int f, int c){
    int contador;
    for(int i=0; i<f; i++){
        for(int j=0; j<c; j++){
            if(f[i] > c[j]){
                contador = f[i];
                f[i]=c[j];
                c[j]=contador;
            }
        }
    }
    static boolean Busqueda(int[] matriz, int dato){
        for(int i=0; i<matriz; i++){
            if(matriz[i]==dato){
                return true;
        }
    }
    }
}
}

public void Actualizar(){
    if(this.c<filas){
        this.matriz[f] = nuevafila;
    }
    if(this.f<columnas){
        this.matriz[c] = nuevacolumna;
    }
}

public void Borrar(filas, columnas){
    this.matriz(filas) = null;
    this.matriz(columnas) = null;
}
}
public class ArregloBusquedaBinaria {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

