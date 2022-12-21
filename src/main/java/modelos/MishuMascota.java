package modelos;

public class MishuMascota extends Mascota {

    protected static int count;
   public MishuMascota(String nombre, String propietario){
      super(nombre, propietario);
      this.id = ++count;
   }

    @Override
    public String toString(){
        return "la Mascota de nombre : " + nombre + '\n'
                + "nació el día " + fechaNacimiento.getDayOfWeek() + ", "
                + fechaNacimiento.getDayOfMonth() + " de "
                + fechaNacimiento.getDayOfMonth() + " del año "
                + fechaNacimiento.getYear() + '\n'
                + "a la hora : " + fechaNacimiento.getHour() + ":"
                + fechaNacimiento.getMinute() + '\n'
                + "actualmente se encuentra " + (((isLive)) ? "vivo\n" : "muerto\n")
                + "su nivel de Energía se encuantra en : " + nivelEnergia + "%\n"
                + "el nivel de Hambre en : " + nivelHambre + '\n'
                + "nivel de Cansancio : " + nivelCansancio + '\n'
                + "nivel de Felicidad : " + nivelFelicidad + '\n'
                + "nivel de aburrimiento : " + nivelAburrimiento + '\n'
                + "y su actual propietario es : " + propietario + '\n';
    }

    public static int getCount(){

        return count;
    }

}

