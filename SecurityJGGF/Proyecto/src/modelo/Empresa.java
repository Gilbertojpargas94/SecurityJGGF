package modelo;
import java.util.ArrayList;

public class Empresa {
    //Vectores para cargar clientes y vigilantes.
    private ArrayList<Vigilante> vigilantes= new ArrayList<Vigilante>();
    private ArrayList<ClienteResidencia> clienteR= new ArrayList<ClienteResidencia>();
    private ArrayList<ClienteTienda> clienteT= new ArrayList<ClienteTienda>();
	//Metodos para cargar vectores.
    public void incluirVigilante(Vigilante vigi){
        vigilantes.add(vigi);
    }
    public void incluirClienteR(ClienteResidencia clir){
        clienteR.add(clir);
    }
    public void incluirClienteT(ClienteTienda clit){
        clienteT.add(clit);
    }
    public void asigarVigilantesReseidencia(){
        int cantidad=0;
        String ubicacion="";
        for(int i=0;i<clienteR.size();i++){
            cantidad=clienteR.get(i).getCantVigilantes();
            ubicacion=clienteR.get(i).getDireccion();               
            asignarTurnoVigilanteResidencia(cantidad,ubicacion,i);
        }
    }        
	//Metodo para asignar aleatoriamente los turno semanales a todos los vigilantes.
    public void asignarTurnoVigilanteResidencia(int cantidad, String ubicacion,int posicion){
        for(int i=0;i<7;i++){
            for(int j=0;j<cantidad*2;j++){
                for(int k=0;k<vigilantes.size();k++){
                    if(j<cantidad){
                        if(vigilantes.get(k).getTurnos(i)==true && vigilantes.get(k).disAsignados()<5){
                            Turno t = new Turno(ubicacion, clienteR.get(posicion).getHorario1());
                            vigilantes.get(k).agregarTurno(t, i);
                        }
                    }else{
                        if(vigilantes.get(k).getTurnos(i)==true && vigilantes.get(k).disAsignados()<5){
                            Turno t = new Turno(ubicacion, clienteR.get(posicion).getHorario2());
                            vigilantes.get(k).agregarTurno(t, i);
                        }
                    }
                }
            }	
        }
    }
    public void asigarVigilantesTienda(){
        int cantidad=0;
        String ubicacion="";
        for(int i=0;i<clienteT.size();i++){
            cantidad=clienteT.get(i).getCantVigilantes();
            ubicacion=clienteT.get(i).getDireccion();               
            asignarTurnoVigilanteResidencia(cantidad,ubicacion,i);
        }
    }        
	//Metodo para asignar aleatoriamente los turno semanales a todos los vigilantes.
    public void asignarTurnoVigilanteTienda(int cantidad, String ubicacion,int posicion){
        for(int i=0;i<7;i++){
            for(int j=0;j<cantidad*2;j++){
                for(int k=0;k<vigilantes.size();k++){
                    if(vigilantes.get(k).getTurnos(i)==true && vigilantes.get(k).disAsignados()<5){
                        Turno t = new Turno(ubicacion, clienteT.get(posicion).getHorario());
                        vigilantes.get(k).agregarTurno(t, i);
                    }
                }
            }
        }	
    }
}