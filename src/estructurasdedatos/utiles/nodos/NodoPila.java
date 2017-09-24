package estructurasdedatos.utiles.nodos;

public class NodoPila {

    String arreglo[];
    private int tope;
    private int tamaño;

    public void Nodopila(int n) {
        tamaño = n;
        arreglo = new String[tamaño];
        tope = 0;
    }

    public void Insertar(String dato) {
        if (tope == tamaño) {
            arreglo[tope] = dato;
        }
    }

    public String Listar() {
        if (tope < 0) {
            return null;
        } else {
            return arreglo[tope];
        }
    }

    public void Buscar() {
        String[] aux = arreglo;
        for (int i = 0; i <= tope; i++) {
            arreglo[i] = aux[i];
        }

    }

    public void Borrar() {
        if(tope == 0){
            System.out.println("Pila vacia");
        }else{
            String aux = arreglo[tope];
            tope=tope-1;
        }

    }

}
