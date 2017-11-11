package modelo;

public class Turno {
    //Atributos
    private String ubicacion;
    private String horario;
    //Constructor
    public Turno(String ubicacion, String horario) {
        this.ubicacion = ubicacion;
        this.horario = horario;
    }
    //Metodos sets y gets
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getHora() {
        return horario;
    }

    public void setHora(String horario) {
        this.horario = horario;
    }
    
}
