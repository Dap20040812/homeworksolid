package service;

import modelo.Envio;
import modelo.Estudiante;

import java.util.ArrayList;

public class EnvioMaterial {

    private Email interfaz;
    private Envio envio;

    public EnvioMaterial(Email interfaz,Envio envio) {
        this.interfaz = interfaz;
        this.envio = envio;
    }

    public void enviarMaterialEstudiante(Estudiante estudiante) {

            envio.material = estudiante.materiales;
            envio.saludoDirector = estudiante.saludoDirector;
            interfaz.enviarEmail(envio);
    }
}