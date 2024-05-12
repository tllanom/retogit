package reto9;

public class Partido {

    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private int parteActual;
    private boolean terminado;

    public Partido(Equipo equipoLocal, Equipo equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

    public void marcarGol(Equipo atacante, Equipo defensor) {
        if (atacante.atacar() && atacante.getNivelAtaque() > defensor.getNivelDefensa()) {
            System.out.println("El equipo " + atacante.getNombre() + " ha marcado gol!");
            atacante.setNumeroGoles(atacante.getNumeroGoles() + 1);
        } else {
            System.out.println("No se consiguió meter gol!");
        }
    }

    public void iniciarPartido() {
        for (parteActual = 1; parteActual <= 2; parteActual++) {
            System.out.println("Parte " + parteActual + " del partido");
            for (int i = 0; i < 3; i++) {
                marcarGol(equipoLocal, equipoVisitante);
                marcarGol(equipoVisitante, equipoLocal);
            }
        }
        terminado = true;
    }

    public void mostrarResultado() {
        if (terminado) {
            System.out.println();
            System.out.println("El equipo " + equipoLocal.getNombre() + " marcó " + equipoLocal.getNumeroGoles() + " goles.");
            System.out.println("El equipo " + equipoVisitante.getNombre() + " marcó " + equipoVisitante.getNumeroGoles() + " goles.");
            if (equipoLocal.getNumeroGoles() > equipoVisitante.getNumeroGoles()) {
                System.out.println("El equipo " + equipoLocal.getNombre() + " gana!");
            } else if (equipoLocal.getNumeroGoles() < equipoVisitante.getNumeroGoles()) {
                System.out.println("El equipo " + equipoVisitante.getNombre() + " gana!");
            } else {
                System.out.println("¡El partido termina en empate!");
            }
        } else {
            System.out.println("Sin jugar o jugando");
        }
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public int getParteActual() {
        return parteActual;
    }

    public boolean isTerminado() {
        return terminado;
    }


}