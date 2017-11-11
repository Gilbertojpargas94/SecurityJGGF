
package modelo;

public class ClienteTienda extends Cliente {
    private String horario="";
    
    public ClienteTienda(String nombreDelEnte, String descripcion, String telefono, String direccion, int cantVigilantes,int turno) {
        super(nombreDelEnte, descripcion, telefono, direccion, cantVigilantes,turno);
    }
    
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
