import java.util.ArrayList;

public class Pasajero {
    //Atributos
    public String nombre;
    ArrayList<Viaje> boletos;//Hace referencia a Viaje y viajes

    //Constructores
    public Pasajero(){}

    public Pasajero(String nombre){
        this.nombre = nombre;
        boletos = new ArrayList<>();
    }


    //Metodos

    public void comprarBoleto(Corrida c, int numAsiento){
        Asiento a = c.reservarAsiento(numAsiento);
        boolean bandera = false;
        if( a != null){
            for(Viaje aux: boletos){
                if(aux.corrida.bus.asientos.contains(a)== c.bus.asientos.contains(numAsiento)){
                    System.out.println("Ya has comprado un boleto para este viaje se añadira a tu mismo viaje");
                    aux.asientos.add(a);
                    bandera = true;
                    break;
                }
            }   
            if(bandera == false){
                System.out.println("Creando nuevo Viaje...");
                Viaje v = new Viaje(c, a);
                boletos.add(v);
                System.out.println("La compra fue exitosa!");
            }
        }else{
            System.out.println("Ocurrio un error al momento de reservar");
        }
    }

    public void mostrarViajes(){
        System.out.println("Los viajes del pasajero "+ nombre+ " son: ");
        for(Viaje aux: boletos){
            aux.imprimirViaje();
        } 
    }

    public String toString(){
        String estado = "Nombre: " + nombre;

        return estado;
    }

}
