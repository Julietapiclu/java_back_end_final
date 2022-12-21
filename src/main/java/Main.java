import modelos.MishuMascota;
import persistencia.mysql.MySQLConnection;
import persistencia.persistenceCollections.MascotaPersistenceUseList;
import persistencia.mysql.MascotaPersistenceUseMySQL;
import persistencia.mysql.MySQLConnection;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        MascotaPersistenceUseList persistence = new MascotaPersistenceUseList();

        //MishuMascota mishu = new MishuMascota("mishu", "juli");

        //System.out.println(mishu.getNombre());
        //System.out.println(mishu.getPropietario());
        //System.out.println(mishu.getFechaNacimiento());
        //System.out.println(mishu.getFechaNacimiento());
        //System.out.println(mishu.getNivelEnergia());
        //System.out.println(mishu.getNivelHambre());
        //System.out.println(mishu.getNivelFelicidad());
        //System.out.println(mishu.getNivelAburrimiento());
        //System.out.println(mishu.getNivelCansancio());

        //System.out.println(mishu);

        MishuMascota mishu = new MishuMascota("Mishu-Merlina", "Juli");
        MishuMascota mishu2 = new MishuMascota("Mishu-Cordobes", "Juli");
        MishuMascota mishu3 = new MishuMascota("Mishu-Porteño", "Juli");
        MishuMascota mishu4 = new MishuMascota("Mishu-Litoral", "Juli");
        persistence.guardar(mishu);
        persistence.guardar(mishu2);
        persistence.guardar(mishu3);
        persistence.guardar(mishu4);

        //CeroMascota cero = new CeroMascota("Cero-Dog", "Juli");
        //CeroMascota cero2 = new CeroMascota("Cero-ian-Dog", "Juli");
        //persistence.guardar(cero);
        //persistence.guardar(cero2);

        //for (Mascota mascota : persistence.getAllMascotas()){
        //    System.out.println(mascota.getNivelAburrimiento());
        //}

        //System.out.println("la cantidad de mascotas creadas es :" + MishuMascota.getCount());


        //System.out.println("antes de comer " + mishu.getNivelEnergia());
        //mishu.comer(AlmacenAlimentos.POCHOCLO);
        //mishu.comer(AlmacenAlimentos.POCHOCLO);
        //mishu.comer(AlmacenAlimentos.POCHOCLO);
        //System.out.println("despues de comer " + mishu.getNivelEnergia());

        //System.out.println("antes de comer " + mishu.getNivelHambre());
        //mishu.comer(AlmacenAlimentos.ASADO);
        //mishu.comer(AlmacenAlimentos.ASADO);
        //mishu.comer(AlmacenAlimentos.ASADO);
        //mishu.comer(AlmacenAlimentos.ASADO);
        //mishu.comer(AlmacenAlimentos.ASADO);
        //System.out.println("despues de comer " + mishu.getNivelHambre());


        //mishu.jugar(EntretenimientosEnum.BAILAR);
        //mishu.jugar(EntretenimientosEnum.CAMINAR);
        //mishu.jugar(EntretenimientosEnum.LEER);
        //mishu.jugar(EntretenimientosEnum.DIBUJAR);
        //mishu.jugar(EntretenimientosEnum.DIBUJAR);
        //mishu.jugar(EntretenimientosEnum.PASEAR);

        //System.out.println("antes de dormir " + mishu.getNivelEnergia());
        //mishu.dormir(LocalTime.of(0,25));
        //System.out.println("despues de dormir " + mishu.getNivelEnergia());

        //mishu.comer(AlmacenAlimentos.POCHOCLO);
        //mishu.comer(AlmacenAlimentos.POCHOCLO);
        //mishu.comer(AlmacenAlimentos.POCHOCLO);
        //mishu.comer(AlmacenAlimentos.POCHOCLO);
        //mishu.comer(AlmacenAlimentos.POCHOCLO);
        //mishu.comer(AlmacenAlimentos.POCHOCLO);
        //mishu.comer(AlmacenAlimentos.POCHOCLO);
        //RegistroCivilMascotas.guardarActa(mishu);

MySQLConnection conexion = new MySQLConnection();
Connection connection = conexion.establecerConexion();

conexion.cerrarConexion(connection);

    }
}