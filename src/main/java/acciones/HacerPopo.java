package acciones;
import modelos.Mascota;

public class HacerPopo {
    public boolean tineQueEvacuar(Mascota mascota){
        return mascota.getComidasIngeridas() > 2;
    }

    public void evacuar(Mascota mascota){
        if (tineQueEvacuar(mascota)) {
            mascota.setComidasIngeridas(mascota.getComidasIngeridas() - 1);
        }
    }
}
