package modelo;

public class ClienteResidencia extends Cliente {
    private String horario1="";
    private String horario2="";
    
    public ClienteResidencia(String nombreDelEnte, String descripcion, String telefono, String direccion, int cantVigilantes,int turno) {
        super(nombreDelEnte, descripcion, telefono, direccion, cantVigilantes,turno);
    }
    
     public String getHorario1() {
        return horario1;
    }

    public void setHorario1(String horario1) {
        this.horario1 = horario1;
    }

    public String getHorario2() {
        return horario2;
    }

    public void setHorario2(String horario2) {
        this.horario2 = horario2;
    }
    
}
