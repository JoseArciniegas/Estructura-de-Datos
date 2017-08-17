/*
* Este algoritmo suma todos los numeros pares que estan entre 1 y 100.
* Estructura de datos - Universidad Tecnologica de Pereira.
* Estudiante Jose Luis Arciniegas
*/
package sumanumerospares;

public class SumaNumerosPares {

    public static void main(String[] args) {
        //Se busca crear un programa que imprima la suma de los numeros pares hasta 100
        int suma = 0;//Variable que permite la suma de los numeros pares del 1 al 100.
        for(int x = 1; x <= 100; x++){//Ciclo que permite la suma de los numeros.
            if(x%2==0){//Condicional que verifica si el numero es par.
                suma = suma + x;
            }
        }
        System.out.println(+suma);//Impresion de la suma.
    }
    
}
