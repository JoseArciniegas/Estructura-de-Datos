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
