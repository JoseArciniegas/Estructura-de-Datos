/*
*Algoritmo para verificar si un número es primo o no.
*Estructura de datos - Universidad Tecnologica de Pereira.
*Estudiante Jose Luis Arciniegas
 */
package numerosprimos2;

import java.util.Scanner;

public class NumerosPrimos2 {
    
    public static void main(String[] args) {
        //programa para verificar si un número es primo o no.
        System.out.println("Escriba el numero a verificar: ");//Impresion para escribir el numero a verificar.
        Scanner scanner = new Scanner(System.in);//Escaneo para leer el numero del usuario, fue importado anteriormente en package numerosprimos2
        int numero1 = scanner.nextInt();//Lectura del primer numero ingresado por el usuario.
        int numero2 = numero1-1;//Lectura del segundo numero ingresado por el usuario.
        while((numero1%numero2) != 0){//ciclo que permite verificar si el numero es primo.
            numero2--;
        }
        if(numero2 == 1){
            System.out.println("Es primo");//Impresion que confirma si es primo.
        } else {
            System.out.println("No es primo");//impresion que confirma si no es primo.
        }
    }
    
}
