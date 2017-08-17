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
