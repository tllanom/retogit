package reto9;

public class Entrada {

    public static void main(String[] args) {

        //Jugador jugador1 = new Jugador();
        //jugador1.mostrarDatos();

        Equipo equipo1 = new Equipo("UNO");
        equipo1.mostrarDatos();
        Equipo equipo2 = new Equipo("DOS");
        equipo2.mostrarDatos();
        Partido partido1 = new Partido(equipo1, equipo2);

        partido1.iniciarPartido();
        partido1.mostrarResultado();

    }
}
