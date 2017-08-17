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
