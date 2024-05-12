package reto9;

import java.sql.SQLOutput;

public class Equipo {


    private String nombre;
    private int nivelAtaque;
    private int nivelDefensa;
    private int nivelCentro;
    private int numeroGoles;


    public Equipo(String nombre) {
        this.nombre = nombre;
        this.nivelAtaque = (int) (Math.random() * 101);
        this.nivelDefensa = (int) (Math.random() * 101);
        this.nivelCentro = (int) (Math.random() * 101);
        this.numeroGoles = 0;
    }

    public Equipo(String nombre, int nivelAtaque, int nivelDefensa, int nivelCentro, int numeroGoles) {
        this.nombre = nombre;
        this.nivelAtaque = nivelAtaque;
        this.nivelDefensa = nivelDefensa;
        this.nivelCentro = nivelCentro;
        this.numeroGoles = numeroGoles;
    }

    public boolean atacar() {
        boolean ataque = false;
        if ((Math.random() * 2) + ((this.nivelCentro * (int) (Math.random() * 2)) / 2) > 20) {
            ataque = true;
        }
        return ataque;
    }

    public void mostrarDatos() {
        System.out.println("El nombre del equipo es: " + this.nombre);
        System.out.println("Su nivel de ataque es de: " + this.nivelAtaque);
        System.out.println("Su nivel de defensa es de: " + this.nivelDefensa);
        System.out.println("Su nivel de centro es de: " + this.nivelCentro);
        System.out.println("Y su número de goles es de: " + this.numeroGoles);
        System.out.println();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelAtaque() {
        return nivelAtaque;
    }

    public void setNivelAtaque(int nivelAtaque) {
        this.nivelAtaque = nivelAtaque;
    }

    public int getNivelDefensa() {
        return nivelDefensa;
    }

    public void setNivelDefensa(int nivelDefensa) {
        this.nivelDefensa = nivelDefensa;
    }

    public int getNivelCentro() {
        return nivelCentro;
    }

    public void setNivelCentro(int nivelCentro) {
        this.nivelCentro = nivelCentro;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public void setNumeroGoles(int numeroGoles) {
        this.numeroGoles = numeroGoles;
    }

}
