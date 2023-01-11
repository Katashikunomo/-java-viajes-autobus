import java.util.ArrayList;

public class Autobus {
    //Atributos

    public String placas;
     ArrayList<Asiento> asientos;
    //Constructor

    public Autobus(){}

    public Autobus (String placas ){
        this.placas = placas;
        asientos = new ArrayList<>();
    }

    //Metodos
   
    public String toString(){
        String estado = "BUSS - Matricula --> "+ placas;
                        return estado;
    }
   
}
