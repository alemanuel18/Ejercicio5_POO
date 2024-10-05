//  @ Ejercicio 5
//  @ File Name : Mamifero.java
//  @ Date : 04/10/2024
//  @ Author : Alejandro Manuel Jerez Melgar 24678
//

public abstract class Mamifero extends Animal{
    /**
     * Atributos
     */
    protected float pesoKg;
    protected int tiempoGestion;
    protected boolean peligroExtincion;
    protected String pelaje;
    protected int criasCamada;
    protected String dieta;
    protected String tamano;
    protected float alimetacionDiaria;
    protected float areaHabitad;

    /**
     * 
     * @param nombreCientifico
     * @param habitad
     * @param esperanzaVida
     * @param costoMantenimietno
     * @param pesoKg
     * @param tiempoGestion
     * @param pelibroExticion
     * @param pelaje
     * @param criasCamada
     * @param dieta
     * @param tamano
     * @param alimetacionDiaria
     * @param areaHabitad
     */
    public Mamifero(String nombreCientifico, String habitad, int esperanzaVida, double costoMantenimietno, float pesoKg, int tiempoGestion, boolean pelibroExticion, String pelaje, int criasCamada, String dieta, String tamano, float alimetacionDiaria, float areaHabitad){
        super(nombreCientifico, habitad, esperanzaVida, costoMantenimietno);
        this.pesoKg=pesoKg;
        this.tiempoGestion=tiempoGestion;
        this.peligroExtincion=pelibroExticion;
        this.pelaje=pelaje;
        this.criasCamada=criasCamada;
        this.dieta=dieta;
        this.tamano=tamano;
        this.alimetacionDiaria=alimetacionDiaria;
        this.areaHabitad=areaHabitad;
    }
    /**
     * 
     * @param pesoKg
     */
    public void setPesoKg(float pesoKg) {
        this.pesoKg = pesoKg;
    }
    /**
     * 
     * @return
     */
    public float getPesoKg() {
        return pesoKg;
    }
    /**
     * 
     * @param tiempoGestion
     */
    public void setTiempoGestion(int tiempoGestion) {
        this.tiempoGestion = tiempoGestion;
    }
    /**
     * 
     * @return
     */
    public int getTiempoGestion() {
        return tiempoGestion;
    }
    /**
     * 
     * @param pelibroExticion
     */
    public void setPelibroExticion(boolean pelibroExticion) {
        this.peligroExtincion = pelibroExticion;
    }
    /**
     * 
     * @return
     */
    public boolean getPeligroEstincion() {
        return peligroExtincion;
    }
    /**
     * 
     * @param pelaje
     */
    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }
    /**
     * 
     * @return
     */
    public String getPelaje() {
        return pelaje;
    }
    /**
     * 
     * @param criasCamada
     */
    public void setCriasCamada(int criasCamada) {
        this.criasCamada = criasCamada;
    }
    /**
     * 
     * @return
     */
    public int getCriasCamada() {
        return criasCamada;
    }
    /**
     * 
     * @param dieta
     */
    public void setDieta(String dieta) {
        this.dieta = dieta;
    }
    /**
     * 
     * @return
     */
    public String getDieta() {
        return dieta;
    }
    /**
     * 
     * @param tamano
     */
    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    /**
     * 
     * @return
     */
    public String getTamano() {
        return tamano;
    }
    /**
     * 
     * @param alimetacionDiaria
     */
    public void setAlimetacionDiaria(float alimetacionDiaria) {
        this.alimetacionDiaria = alimetacionDiaria;
    }
    /**
     * 
     * @return
     */
    public float getAlimetacionDiaria() {
        return alimetacionDiaria;
    }
    /**
     * 
     * @param areaHabitad
     */
    public void setAreaHabitad(float areaHabitad) {
        this.areaHabitad = areaHabitad;
    }
    /**
     * 
     * @return
     */
    public float getAreaHabitad() {
        return areaHabitad;
    }

    
}