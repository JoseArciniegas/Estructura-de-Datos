//Dentro de esta estructura también hay una clase llamada nodo que tiene lo siguiente:

//public class Nodo {
    //int dato; //guarda el dato que le hemos dado.
    //Nodo siguiente; //Este apunta al siguiente nodo.
    
    //Nodo(int dato2){
        //dato=dato2;
        //siguiente=null;
    //}
    
//}


package listaenlazada;

public class ListaEnlazada {
    Nodo cabeza;
    
    ListaEnlazada(){
        cabeza=null;
    }
    
    public boolean ListaVacia(){
        return(cabeza==null)? true: false; //verifica si la lista esta vacia para insertar un nuevo dato.
    }
    
    public void Insertar(int dato){
        Nodo nuevo=new Nodo(dato); //creamos el nodo.
        if(ListaVacia()){
            cabeza=nuevo;
        }
        else{
            nuevo.siguiente=cabeza;
            cabeza=nuevo;
            
        }
    }
    
    public String Listar(){
        String s="Lista\n";
        Nodo aux=cabeza;
        
        while(aux!=null){
            s+=aux.dato+"\n";
            aux=aux.siguiente;
        }
        
    }
    
    public void Borrar(cabeza){
       this.Nodo(cabeza)=null; 
    }
    

    public static void main(String[] args) {
        
    }
}
