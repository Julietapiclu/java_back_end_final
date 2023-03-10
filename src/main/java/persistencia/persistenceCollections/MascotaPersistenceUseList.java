package persistencia.persistenceCollections;
import modelos.Mascota;
import persistencia.IMascotaPersistence;

import java.util.ArrayList;
import java.util.List;

public class MascotaPersistenceUseList implements IMascotaPersistence {

    List<Mascota> bdMascotas = new ArrayList<>();

    @Override
    public void guardar(Mascota mascota) {
        bdMascotas.add(mascota);
    }

    @Override
    public Mascota getMascota(int id) {
        return bdMascotas.get(id);
    }

    @Override
    public Mascota getMascota(String nombre) {
        for (Mascota elemento : bdMascotas){
            if (elemento.getNombre().equals(nombre)){
                return elemento;
            }
        }

        return null;
    }

    @Override
    public List<Mascota> getAllMascotas() {

        return bdMascotas;
    }

    @Override
    public void updateMascota(Mascota mascota) {

    }

    @Override
    public void updateMascota(int id, Mascota mascota) {

        bdMascotas.set(id, mascota);
    }

    @Override
    public void deleteMascota(int id) {
        bdMascotas.remove(getMascota(id));

    }
}
