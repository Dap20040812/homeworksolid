package modelo;

import java.util.ArrayList;
import java.util.Arrays;

public class Administración extends Estudiante {
    public Administración(String nombre) {
        super(nombre,new ArrayList<>(Arrays.asList("cuaderno","esfero")),"Alguien manda Saludos","Negocios, Administracion I, Historia de la Administracion");
    }
}
