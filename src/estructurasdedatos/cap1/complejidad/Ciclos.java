//Se corrige la subida de la antigua tarea de complejidad a su lugar correcto
package estructurasdedatos.cap1.complejidad;

public class Ciclos {
    /*
* En este programa se busca imprimir los numeros desde el 100 al 1.
* Estructura de datos - Universidad Tecnologica de Pereira.
* Estudiante Jose Luis Arciniegas
*/
package delcienal1;

public class DelCienAl1 {

    public static void main(String[] args) {
        //Imprimir los numeros del 100 al 1
        for (int x = 100 ; x >= 1 ; x--){//Ciclo que permite que se pueda imprimir los numeros.
            System.out.println(x);//Impresion de los numeros del 1 al 100.
        }
    }
    
}
}

/*
* Este algoritmo imprime los numeros del 1 al 100.
* Estructura de datos - Universidad Tecnologica de Pereira.
* Estudiante Jose Luis Arciniegas
*/
package numeros1al100;
 
public class Numeros1al100 {
    
    public static void main(String[] args) {
        //Programa para imprimir en pantalla los números del 1 al 100.
        for(int x = 1; x <= 100; x++) //Ciclo que permite imprimir los números
            System.out.println(+x);//Para imprimir toda la suma del ciclo
    }
    
}

/*
* Este algoritmo suma todos los numeros desde el 1 hasta el 100.
* Estructura de datos - Universidad Tecnologica de Pereira.
* Estudiante Jose Luis Arciniegas
*/
package sumaalcien;

public class SumaAlCien {

    public static void main(String[] args) {
        int suma = 0;//Variable que cumple la funcion de contador.
        for(int x = 1; x <= 100; x++){//Ciclo que permite hacer la suma del 1 al 100.
            suma = suma + x;
        }
        System.out.println(+suma);//Impresion de toda la suma.
            
    }
    
}

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
