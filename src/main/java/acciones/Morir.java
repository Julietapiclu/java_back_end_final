package acciones;

import modelos.Mascota;

import java.time.LocalDateTime;

import utils.actas.RegistroCivilMascotas;

public class Morir {

    public static void checkStatusGeneral(Mascota mascota){
        if(mascota.getNivelEnergia() == 0){
            mascota.setLive(false);
            mascota.setFechaMuerte(LocalDateTime.now());
            RegistroCivilMascotas.confeccionarActas(mascota);
            if (mascota.getCausaDeMuerte().isEmpty()){
                determinarCausaDeMuerte(mascota);
            }
            System.out.println("Esta mascota a fallecido en la fecha " + mascota.getFechaMuerte().toLocalDate());
            System.out.println("La causa de muerte fue: " + (mascota.getCausaDeMuerte()));
        }
    }

    private static void determinarCausaDeMuerte(Mascota mascota){
        if(mascota.getNivelAburrimiento() == 100){
            mascota.setCausaDeMuerte("Aburrimiento");
        }
        if (mascota.getNivelHambre() == 100){
            mascota.setCausaDeMuerte("Hambre");
        }
        if (mascota.getNivelCansancio() == 100){
            mascota.setCausaDeMuerte("Cansancio");
        }
        if (mascota.getNivelFelicidad() == 0){
            mascota.setCausaDeMuerte("Tristeza");
        }
        if (mascota.getComidasIngeridas() > 4){
            mascota.setCausaDeMuerte("Constipado");
        }
    }
}
