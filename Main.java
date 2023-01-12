import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        

        System.out.println("Creando Autobuses...");
        Autobus bus1 = new Autobus("11111");
        Autobus bus2 = new Autobus("22222");
        Autobus bus3 = new Autobus("33333");
        Autobus bus4 = new Autobus("44444");
        Autobus bus5 = new Autobus("55555");
        Autobus bus6 = new Autobus("4586D");
        Autobus bus7 = new Autobus("7777H");
        Autobus bus8 = new Autobus("8888D");
        Autobus bus9 = new Autobus("9999F");
        Autobus bus10 = new Autobus("1010C");
        Autobus bus11 = new Autobus("1111B");
        Autobus bus12 = new Autobus("1212A");

        System.out.println("Creando Corridas...");

        Corrida c10 = new Corrida("10hrs", "CDMX", "PUEBLA", "21/02/2022", bus1, "2 horas", 275.5 );
        Corrida c12 = new Corrida("12hrs", "CDMX", "PUEBLA", "21/02/2022", bus2, "2 horas", 275.5 );
        Corrida c13 = new Corrida("14hrs", "CDMX", "PUEBLA", "21/02/2022", bus3, "2 horas", 275.5 );
        Corrida c14 = new Corrida("16hrs", "CDMX", "PUEBLA", "21/02/2022", bus4, "2 horas", 275.5 );
        Corrida c15 = new Corrida("18hrs", "CDMX", "PUEBLA", "21/02/2022", bus5, "2 horas", 275.5 );
        Corrida c16 = new Corrida("20hrs", "CDMX", "PUEBLA", "21/02/2022", bus6, "2 horas", 275.5 );

        Corrida c17 = new Corrida("10hrs", "PUEBLA","CDMX", "21/02/2022", bus7, "2 horas",  358.7);
        Corrida c18 = new Corrida("12hrs", "PUEBLA", "CDMX", "21/02/2022", bus8, "2 horas", 358.7 );
        Corrida c19 = new Corrida("14hrs", "PUEBLA", "CDMX", "21/02/2022", bus9, "2 horas", 358.7 );
        Corrida c20 = new Corrida("16hrs", "PUEBLA", "CDMX", "21/02/2022", bus10, "2 horas", 358.7 );
        Corrida c21 = new Corrida("18hrs", "PUEBLA", "CDMX", "21/02/2022", bus11, "2 horas", 358.7 );
        Corrida c22 = new Corrida("20hrs", "PUEBLA", "CDMX", "21/02/2022", bus12, "2 horas", 358.7 );


        Pasajero gerardo = new Pasajero("Gerardo");
        Pasajero vicor = new Pasajero("Vicor");
        Pasajero pablo = new Pasajero("Pablo");

      

        gerardo.comprarBoleto(c10, 1);
        gerardo.comprarBoleto(c10, 2);
        gerardo.comprarBoleto(c10, 7);
        gerardo.comprarBoleto(c10, 8);
        gerardo.comprarBoleto(c10, 7);
        gerardo.comprarBoleto(c10, 20);
        
        gerardo.mostrarViajes();

         c10.mostrarAsientos();

        gerardo.comprarBoletos(c22, 19 );

        //c22.mostrarAsientos();
         // c19.mostrarAsientos();


  
    }
}
