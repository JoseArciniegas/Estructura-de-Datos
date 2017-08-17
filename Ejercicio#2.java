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
