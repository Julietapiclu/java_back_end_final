package modelos;

import acciones.Alimentarse;
import acciones.Divertirse;
import acciones.Dormir;
import acciones.HacerPopo;
import enumeradores.AlmacenAlimentos;
import enumeradores.EntretenimientosEnum;
import utils.actas.RegistroCivilMascotas;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Mascota {
    protected String nombre;
    protected LocalDateTime fechaNacimiento;
    protected LocalDateTime fechaMuerte;
    protected boolean isLive;
    protected int nivelEnergia;
    protected int nivelHambre;
    protected int nivelCansancio;
    protected int nivelFelicidad;
    protected int nivelAburrimiento;
    protected String propietario;

    protected int id;
    protected Alimentarse alimentarse;
    protected Divertirse divertirse;
    public static LocalDateTime ultimoDescanso;
    protected Dormir descansar;
    protected int comidasIngeridas;
    protected HacerPopo popo;
    protected ArrayList<String> causaDeMuerte = new ArrayList<>();

    protected String actaDefuncion;

    protected String actaNacimiento;

    //metodo constructor que requiere dos datos al momento de la instanciacion (nombre y propietario)

    public Mascota(String nombre, String propietario){
        setNombre(nombre);
        setPropietario(propietario);
        setLive(true);
        setNivelEnergia(20);
        setNivelHambre((int) (Math.random() * 100));
        setNivelCansancio((int) (Math.random() * 100));
        setNivelFelicidad((int) (Math.random() * 100));
        setNivelAburrimiento((int) (Math.random() * 100));
        setFechaNacimiento(LocalDateTime.now());
        this.alimentarse = new Alimentarse();
        this.divertirse = new Divertirse();
        this.descansar = new Dormir();
        this.popo = new HacerPopo();
        RegistroCivilMascotas.confeccionarActas(this);
    }

    //metodo de la instancia

    public void comer(AlmacenAlimentos alimento){
        alimentarse.ingerirAlimentos(alimento, this);

    };

    public  void dormir(LocalTime tiempo){
        descansar.hacerDormir(tiempo, this);
    };

    public void jugar(EntretenimientosEnum entretenimieto){
        divertirse.entretenerseCon(entretenimieto,this);
    };

    public void irAlBaño(){
        popo.evacuar(this);
    };

    //getter

    public int getId(){
    return id;
    }

    public String getNombre(){

        return nombre;
    }

    public LocalDateTime getFechaNacimiento(){

        return fechaNacimiento;
    }

    public LocalDateTime getFechaMuerte(){

        return fechaMuerte;
    }

    public boolean isLive(){

        return isLive;
    }

    public int getNivelEnergia(){
        return nivelEnergia;
    }

    public int getNivelHambre() {

        return nivelHambre;
    }

    public int getNivelCansancio(){
        return nivelCansancio;
    }

    public int getNivelFelicidad(){
        return nivelFelicidad;
    }

    public int getNivelAburrimiento(){

        return nivelAburrimiento;
    }

    public String getPropietario(){
        return propietario;
    }

    public int getComidasIngeridas(){
        return comidasIngeridas;
    }

    public HacerPopo getPopo() {
        return popo;
    }

    public ArrayList<String> getCausaDeMuerte() {
        return causaDeMuerte;
    }

    public String getActaDefuncion() {
        return actaDefuncion;
    }

    public String getActaNacimiento() {
        return actaNacimiento;
    }




     //setter0

    private void setNombre(String nombre){

        this.nombre = nombre;
    }

    private void setFechaNacimiento(LocalDateTime fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setFechaMuerte(LocalDateTime fechaMuerte){

        this.fechaMuerte = fechaMuerte;
    }

    public void setLive(boolean live){

        isLive = live;
    }

    public void setNivelEnergia(int nivelEnergia){

        this.nivelEnergia = Math.min(nivelEnergia, 100);

    }

    public void setNivelHambre(int nivelHambre){

        this.nivelHambre = Math.max(nivelHambre, 0);
    }

    private void setNivelCansancio(int nivelCansancio){

        this.nivelCansancio = nivelCansancio;
    }

    private void setNivelFelicidad(int nivelFelicidad){

        this.nivelFelicidad = nivelFelicidad;
    }

    public void setNivelAburrimiento(int nivelAburrimiento){

        this.nivelAburrimiento = Math.max(nivelAburrimiento, 0);
    }

    private void setPropietario(String propietario){

        this.propietario = propietario;
    }

    public void setComidasIngeridas(int comidasIngeridas){

        this.comidasIngeridas = comidasIngeridas;
    }

    public void setCausaDeMuerte(String causaDeMuerte){
        this.causaDeMuerte.add(causaDeMuerte);
    }


    public void setActaDefuncion(String actaDefuncion) {
        this.actaDefuncion = actaDefuncion;
    }

    public void setActaNacimiento(String actaNacimiento) {
        this.actaNacimiento = actaNacimiento;
    }

}

