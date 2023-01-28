package modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Industrial extends Estudiante{

    public Industrial(String nombre) {
        super(nombre,new ArrayList<>(Arrays.asList("cuaderno","esfero")),"Alguien manda Saludos","Procesos, Analitica de datos, Gestion de Calidad");
    }
}
