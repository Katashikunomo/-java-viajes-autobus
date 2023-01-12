import java.util.ArrayList;

public class Corrida{
    //Atributos
    public int id;
    public String horario;
    public String origen;
    public String destino;
    public String fecha;
    public Autobus bus;
    public String duracion;
    public Double costo;
    // public ArrayList<Asiento> asientos;
    //Contsructor

    public Corrida (){
    }
    
    public Corrida(String horario, String origen, String destino, String fecha, Autobus bus,String duracion, Double costo){
        // this.id = id;
        this.horario = horario;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.bus = bus;
        this.duracion = duracion;
        this.costo = costo;


        // asientos = new ArrayList<>();
    
        System.out.println("Creando asientos en corrida "+bus.placas+"\n" );
        for(int i = 0; i<20; i++){
            Asiento a = new Asiento(i+1, true);
             bus.asientos.add(a);
        }
    }

    //Metodos 

    public void mostrarAsientos(){
        System.out.println("Imprimiendo Asientos de autobus con placas :" + bus.placas + " con Origen: " + origen + " Destino: " + destino);
        int tam = bus.asientos.size();
        for(int i =0; i<=tam; i++){
            
            System.out.println(" "+bus.asientos.get(i) + "  " + bus.asientos.get(i+1)+ "                "+ bus.asientos.get(i+2)+"  "+ bus.asientos.get(i+3));
            i += 3;
        }        
    
    }


    public Asiento reservarAsiento( int numAsiento){
        boolean bandera = false;
        for(Asiento aux : bus.asientos){
            if(aux.id == numAsiento){
                if(aux.estado == true){
                    aux.estado = false;
                    bandera = true; 
                    return aux;     
                }else{
                    bandera = true;
                    System.out.println("El asiento" + numAsiento +" ya esta ocupado");
                    return null;    
                }
            }
        }
        if(bandera == false){
            System.out.println("El asiento solicitado no existe");
            return null;
        }
        return null;
    }

    public String toString(){

        String estado="placas:"+bus.placas+","+
                        "\nCosto: " + costo +","+
                        "\nDuracion Aprox: " + duracion +","+
                        "\nHorario:" +horario+", "+
                        "\norigen: " +origen+", "+
                        "\ndestino: "+destino+", "+
                        "\nfecha: "+fecha + "\n "+
                        bus.toString();

        return estado;
    }


}