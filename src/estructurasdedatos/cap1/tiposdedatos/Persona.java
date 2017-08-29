package estructuradedatos.cap1.tiposdedatos;

public class Persona{
	private String cedula;
  private String nombre;
  private String telefono;
  private String direccion;
  	
  public String getCedula(){
  		return cedula;
    }
      
    public void setCedula(String cedula){
      	this.cedula = cedula;
    }
  	
  public String getNombre(){
  		return nombre;
  }

  public String setNombre(String nombre){
  	this.nombre = nombre;
  }

  public String getTelefono(){
  		return telefono;
  }

  public String setTelefono(String nombre){
  	this.nombre = telefono;
  }

  public String getDireccion(){
  		return direccion;
  }

  public String setDireccion(String nombre){
  	this.nombre = direccion;
  }
    
  }
}
