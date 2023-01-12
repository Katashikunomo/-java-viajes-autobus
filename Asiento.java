public class Asiento {
    //Atributos
    public int id;
    public boolean estado;

    //Constructores
    public Asiento(){}
    
    public Asiento(int id, boolean estado){
        this.id = id;
        this.estado = estado;
    }

    //Metodos

    public String toString(){
        String disponibleAsiento;
        if (estado) {
             disponibleAsiento = "Disponible";
        }else{
            disponibleAsiento = "Ocupado";
        }
        String estado = id + "-" + disponibleAsiento;
        return estado;
    }

    
}
