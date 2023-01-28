package modelo;

import java.util.ArrayList;
import java.util.Arrays;

public class Informatica extends Estudiante{
    public Informatica(String nombre) {

        super(nombre,new ArrayList<>(Arrays.asList("cuaderno","esfero")),"Alguien manda Saludos","Programacion, Arquitectura, Base de datos");
    }
}
