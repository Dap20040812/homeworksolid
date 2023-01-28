package main;

import modelo.*;
import service.EmailOutlook;
import service.EnvioMaterial;

public class Main {
    public static void main(String[] args) {
        Estudiante[] listadoEstudiantes = {
                new Informatica("Daniel"),
                new Administración("Monica"),
                new Industrial("Liliana")
        };
        verMateriasEstudiantes(listadoEstudiantes);
        EnvioMaterial material = new EnvioMaterial(new EmailOutlook(),new Envio());
        material.enviarMaterialEstudiante(new Informatica("Daniel"));
        EstudianteBD bd = new EstudianteBD();
        bd.guardarEstudiante(listadoEstudiantes[0]);
    }

    public static void verMateriasEstudiantes(Estudiante[] estudiantes) {
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.materias);
        }
    }
}
