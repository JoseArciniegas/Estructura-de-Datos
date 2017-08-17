/*
* Este algoritmo imprime la suma de todos los numeros pares contenidos desde el 1 hasta el 100 y muestra cuantos numeros hay.
* Estructura de datos - Universidad Tecnologica de Pereira.
* Estudiante Jose Luis Arciniegas
*/
package sumaparesytotal;

public class SumaParesYTotal {

    public static void main(String[] args) {
        //Se busca imprimir la suma de todos los numeros pares y decir cuantos hay
        int suma = 0;
        int total = 0;
        for(int x = 1 ; x <= 100 ; x++){
            if(x % 2 == 0){
                suma = suma + x;
                total = total + 1;
            }
        }
        System.out.println(+suma);
        System.out.println("Total de numeros:"+total);
    }
    
}
