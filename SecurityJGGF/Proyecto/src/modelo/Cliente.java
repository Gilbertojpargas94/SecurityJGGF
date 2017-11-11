package modelo;

public abstract class Cliente {
    //Atributos
    private String nombreDelEnte;
    private String descripcion;
    private String telefono;
    private String direccion;
    private int cantVigilantes;
    private int turno;
    //Constructor
    public Cliente(String nombreDelEnte, String descripcion, String telefono, String direccion, int cantVigilantes, int turno) {
        this.nombreDelEnte = nombreDelEnte;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cantVigilantes = cantVigilantes;
        this.turno=turno;
    }

    //Metodos Sets y Gets
    public String getNombreDelEnte() {
        return nombreDelEnte;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    
    public void setNombreDelEnte(String nombreDelEnte) {
        this.nombreDelEnte = nombreDelEnte;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantVigilantes() {
        return cantVigilantes;
    }

    public void setCantVigilantes(int cantVigilantes) {
        this.cantVigilantes = cantVigilantes;
    }
    
    
    
}
