package estructurasdedatos.utiles.nodos;

public class NodoColas {
    Nodo inicio;
    Nodo fina;
    
    public NodoColas(){
        inicio=null;
        fina=null;
    }
    
    public void Insertar(Nodo dato){
        if(inicio==null){
            inicio=fina=dato;
        }else{
            dato.setSiguiente(fina);
            fina=dato;
        }
    }
    
    public Boolean Buscar(int dato){
        Nodo aux = inicio;
        while(aux != null){
            if(aux.getDato()==(dato)){
            }else{
                return true;
            }
            aux=aux.getSiguiente();
        }
        return false;
    }

    public Nodo Borrar(){
        if(inicio==null){
            return null;
        }else{
            Nodo aux=fina;
            while(aux.getSiguiente()!=inicio && aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            if(inicio == fina){
                inicio=fina=null;
                return aux;
            }else{
                inicio=aux;
                aux=aux.getSiguiente();
                inicio.setSiguiente(null);
                return aux;
            }
        }
    }
    
}
