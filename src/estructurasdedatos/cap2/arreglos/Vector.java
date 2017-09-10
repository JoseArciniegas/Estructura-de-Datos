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
public class Vector{
  private int elementos;
  private int vector;
}

public void Vector(int nelementos){
  this.nelementos = nelementos;
  this.Vector = new int [nelementos];
}

public void Insertar (int e, int dato){
  if(this.nelementos<elementos){
    this.matriz[e] = dato;
    else
    System.out.println("error");
  }
}

public void Listar(){
  for(int i = 0 ; i <= this.elementos ; i++){
    System.out.println(this.elementos);
  }
}

public int Buscar(nelementos){
  int contador;
  for(int i = 0 ; i < nelementos ; i++){
    for(int j=i ; j < nelementos ; j++){
      if(nelementos[i]<nelementos[j]){
        contador = nelementos[i];
        nelementos[i]=nelementos[j];
        nelementos[j]=contador;
      }
  }
}
}

static boolean Busqueda(int[] vector, int dato){
  for (int i = 0 ; i < vector ; i++){
    if (vector[i] == dato){
      return true;
    }
  }
  return false;
}

public void Actualizar(){
  if(this.nelementos<elementos){
    this.vector[e] = nuevodato;
  }
  }

public Borrar(elementos){
  this.vector(elementos) = null;
}
