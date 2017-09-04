/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap1.complejidad;

/**
 *
 * @author tusk
 */
public class Condicionales {
    
}

/*
* Este algoritmo suma todos los numeros impares que estan entre 1 y 100.
* Estructura de datos - Universidad Tecnologica de Pereira.
* Estudiante Jose Luis Arciniegas
*/
package sumaimparesytotal;

public class SumaImparesYTotal {

    public static void main(String[] args) {
        //Se busca imprimir la suma de todos los numeros impares y decir cuantos hay
        int suma = 0;//Variable que permite hacer la suma de todos los numeros impares del 1 al 100.
        int total = 0;//Variable que cuenta cuantos numeros en total hay.
        for (int i = 1 ; i <= 100 ; i++){//Ciclo que permite la suma de los numeros del 1 al 100.
            if((i%2)!=0){//condicionalo que verifica si es impar o no.
                suma = suma + i;
                total = total + 1;
            }
        }
        System.out.println(+suma);//Impresion de la suma.
        System.out.println("Total de numeros:"+total);//Impresion del total de numeros.
    }
    
}

/*
* Este algoritmo suma todos los numeros impares desde el 1 hasta el 100.
* Estructura de datos - Universidad Tecnologica de Pereira.
* Estudiante Jose Luis Arciniegas
*/
package sumaimpare;

public class SumaImpare {

    public static void main(String[] args) {
        //Se busca que imprima la suma de los impares hasta 100
        int suma = 0;//Variable que permite hace la suma de todos los numeros del 1 al 100.
        for (int x = 1 ; x <= 100 ; x++){//Ciclo que permite la suma del 1 al 100.
            if((x%2) !=0){//Condicional que verifica si el numero es impar.
                suma = suma + x;
            }
        }
        System.out.println(+suma);//Impresion de la suma.
    }
    
}

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

/*
* Este algoritmo imprime los numeros pares desde el 1 al 100.
* Estructura de datos - Universidad Tecnologica de Pereira.
* Estudiante Jose Luis Arciniegas
*/
package numerospareshastael100;

public class NumerosPareshastael100 {

    public static void main(String[] args) {
        for(int x = 1; x<=100;x++){//Ciclo que permite imprimir los pares del 1 al 100.
            if (x%2==0){//Condicional para verificar si es par.
                System.out.println(+x);//Impresion de los numeros pares.
            }
                
    }
    
}
}

/*
* Este algoritmo consiste en imprimir los numeros impares desde el 1 al 100.
* Estructura de datos - Universidad Tecnologica de Pereira.
* Estudiante Jose Luis Arciniegas
*/
package imparesalcien;

public class ImparesAlCien {
    
    public static void main(String[] args) {
        //Se busca imprimir los numeros impares del 1 al 100.
        int x=0;//Variable que va a iniciar el calculo de si es impar.
        for (x=0;x<=100;x++){//Ciclo que permite el proceso de imprimir los impares del 1 al 100.
            if((x%2) !=0){//Condicional que verifica si el numero es impar o no.
                System.out.println(+x);//Impresion de los numeros impares.
            }
        }
    }
    
}
