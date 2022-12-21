package enumeradores;

public enum EntretenimientosEnum {
    CAMINAR(15), DIBUJAR(25),  BAILAR(20), LEER(10), PASEAR(35);

    private int desaburrimiento;

    EntretenimientosEnum (int desaburrimiento){this.desaburrimiento = desaburrimiento;}

    public int getDesaburrimiento(){
        return this.desaburrimiento;
    }


}
