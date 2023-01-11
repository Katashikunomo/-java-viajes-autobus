public class Asiento {
    //Atributos
    public int id;
    public boolean disponible;

    //Constructores
    public Asiento(){}
    
    public Asiento(int id, boolean disponible){
        this.id = id;
        this.disponible = disponible;
    }

    //Metodos

    public String toString(){
        String disponibleAsiento;
        if (disponible) {
             disponibleAsiento = "Disponible";
        }else{
            disponibleAsiento = "Ocupado";
        }
        String estado = id + "-" + disponibleAsiento;
        return estado;
    }

    
}
