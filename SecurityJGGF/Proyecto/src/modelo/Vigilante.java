package modelo;

public class Vigilante extends Persona {
    private double sueldoDiario;
    private Turno[] turnos = new Turno[7];
    
    public Vigilante(String nom, String ce, String ape, String tel,String dir) {
        super(nom, ce, ape, tel,dir);
    }

    public double getSueldoDiario() {
        return sueldoDiario;
    }

    public void setSueldo(double sueldo) {
        this.sueldoDiario = sueldo;
    }
    
    public void generarCalendario(){
        
    }
    
    public boolean getTurnos(int i) {
        if(turnos[i]==null)
            return true;
        else 
            return false;
    }
    public int disAsignados(){
        int contador=0;
        for(int i=0;i<turnos.length;i++){
            if(turnos[i]!=null)
            contador++;
        }
        return contador;
    }
    public void agregarTurno(Turno t, int i){
        turnos[i]=t;
    }

   
    
    
}
