package reto9;

import java.util.Scanner;

public class Jugador {

    private String nombre;
    private String posicion;
    private boolean estrella;
    private int calidad;

    public Jugador(String nombre, String posicion, int calidad) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.calidad = calidad;
        this.estrella = calidad > 90;
    }

        public Jugador(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Cuál es el nombre del jugador?");
        this.nombre = scn.nextLine();
        System.out.println("Cuál es la posición del jugador?");
        this.posicion = scn.nextLine();
        System.out.println("Cuál es la calidad (0-100) del jugador?");
        this.calidad = scn.nextInt();

        this.estrella = calidad > 90;
    }

    public void mostrarDatos() {
        System.out.println("Datos del jugador " + this.nombre);
        System.out.println("Juega en la posición de " + this.posicion + ".");
        System.out.println("Con una calidad valorada en " + this.calidad + " sobre 100.");
        System.out.println("Es jugador estrella?: " + this.estrella);
        System.out.println();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public boolean isEstrella() {
        return estrella;
    }

    public int getCalidad() {
        return calidad;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
        this.estrella = calidad > 90;
    }

}
