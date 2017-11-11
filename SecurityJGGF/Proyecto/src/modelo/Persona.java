package modelo;

public abstract class Persona {
    //Atributos
    protected String nombre;
    protected String cedula;
    protected String apellido;
    protected String telefono;
    protected String direccion;
    //Contructor
    public Persona(String nom, String ce, String ape, String tel,String dir){
        nombre=nom;
        cedula=ce;
        apellido=ape;
        telefono=tel;
        direccion=dir;
    }
    //Metodos Sets y Gets
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void setDireccion(String direccion){
    	this.direccion=direccion;
    }
    public String getDireccion()
    {
    	return direccion;
    }
}

