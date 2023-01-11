import java.util.ArrayList;

public class Viaje {
    //Atributos   
    Corrida corrida;
    ArrayList<Asiento> asientos;

    //Constructores
    public Viaje(){}

    public Viaje(Corrida c, Asiento a){
        asientos = new ArrayList<>();
        this.corrida = c;
        asientos.add(a);
    }

    public void imprimirViaje(){
        System.out.println(corrida);
        System.out.println("Haora el asiento esta ocupado:");
        for(Asiento aux: asientos){
            System.out.println(aux+"\n");
        }
    }
}
