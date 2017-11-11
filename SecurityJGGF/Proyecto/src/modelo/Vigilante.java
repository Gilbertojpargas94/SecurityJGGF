package modelo;

import java.util.GregorianCalendar;
import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
        

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
    
    public ArrayList<GregorianCalendar> generarCalendario(int dias){
    
        ArrayList diasTrabajo= new ArrayList();
        Calendar fechaInicio = new GregorianCalendar(); // conseguir la fecha actual en formato gregorian calendar
        Calendar fecha=new GregorianCalendar(); //fecha que va a ser parte del ciclo
        
        
        Boolean[] diasTrabajables= new Boolean[7]; //array representando dias de las semanas, comenzando del domingo
                                                   //los dias en true son los dias trabajables
        
       // CONSEGUIR LOS DIAS QUE EL EMPLEADO TRABAJA
       
       for(int i=0; i<7; i++)
       {
           if (turnos[i]!= null)
           {
               diasTrabajables[i]=true;
           }
           else diasTrabajables[i]=false;
       }
       
       //CICLAR TODOS LOS DIAS ESPECIFICADOS
       
        for (int i=0; i<dias; i++) //ciclo por dias
        {
            for (int j=0; j<7; j++) // se cicla por semanas, DEL 0 A 6
            {
              
              if (diasTrabajables[j]==true) // si trabaja ese dia, chequear
              {
                  if(fecha.get(Calendar.DAY_OF_WEEK)== j+1) // para el objeto Gregorian calendar, se tiene un valor de constante 1 para el domingo, su primer dia. Como nuestro arreglo comienza desde el domingo, entonces se usa j+1
                  {                                         // EL sabado es el último día, siendo su valor 7
                      diasTrabajo.add(fecha);
                      //System.out.println("agregue el dia "+ fecha.get(Calendar.DAY_OF_MONTH) + "/" + fecha.get(Calendar.MONTH));
                  }
              }
            }
            
            fecha.add(GregorianCalendar.DAY_OF_MONTH, 1);
            // TODO QUITAR ESTE PRINT
        }
        
        return diasTrabajo;
    
        
    }
   
    
    
}
