package main;

import modelo.Administración;
import modelo.Estudiante;
import modelo.Industrial;
import modelo.Informatica;
import service.EnvioMaterial;

public class Main {
    public static void main(String[] args) {
        Estudiante[] listadoEstudiantes = {
                new Informatica("Daniel"),
                new Administración("Monica"),
                new Industrial("Liliana")
        };
        verMateriasEstudiantes(listadoEstudiantes);
        EnvioMaterial material = new EnvioMaterial();
        material.enviarMaterialEstudiante(new Informatica("Daniel"));
    }

    public static void verMateriasEstudiantes(Estudiante[] estudiantes) {
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.materias);
        }
    }
}
