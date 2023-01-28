package service;

import modelo.Envio;
import modelo.Estudiante;

import java.util.ArrayList;

public class EnvioMaterial {

    public void enviarMaterialEstudiante(Estudiante estudiante) {

            Envio envio = new Envio();
            envio.material = new ArrayList<>();
            envio.material = estudiante.materiales;
            envio.saludoDirector = estudiante.saludoDirector;
            EmailOutlook email = new EmailOutlook();
            email.enviarEmail(envio);
    }
}