package modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class Estudiante {

    public String nombre;
    public List<String> materiales;
    public String saludoDirector;

    public String materias;

    public Estudiante(String nombre, List<String> materiales, String saludoDirector, String materias) {
        this.nombre = nombre;
        this.materiales = materiales;
        this.saludoDirector = saludoDirector;
        this.materias = materias;
    }

}
