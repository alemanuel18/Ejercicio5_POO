//  @ Ejercicio 5
//  @ File Name : Felino.java
//  @ Date : 04/10/2024
//  @ Author : Alejandro Manuel Jerez Melgar 24678
//

class Felino extends Mamifero{
    /**
     * Atributos
     */
    protected String especie;
    protected String colorPelaje;
    protected float tamanof;
    protected float tamanoCola;
    protected float vMax;

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
     * @param especie
     * @param colorPelaje
     * @param tamanof
     * @param tamanoCola
     * @param vMax
     */
    public Felino(String nombreCientifico, String habitad, int esperanzaVida, double costoMantenimietno, float pesoKg, int tiempoGestion, boolean pelibroExticion, String pelaje, int criasCamada, String dieta, String tamano, float alimetacionDiaria, float areaHabitad, String especie, String colorPelaje, float tamanof, float tamanoCola, float vMax){
        super(nombreCientifico, habitad, esperanzaVida, costoMantenimietno, pesoKg, tiempoGestion,pelibroExticion, pelaje, criasCamada, dieta,tamano, alimetacionDiaria,areaHabitad);
        this.especie=especie;
        this.colorPelaje=colorPelaje;
        this.tamanof=tamanof;
        this.tamanoCola=tamanoCola;
        this.vMax=vMax;
    }

    /**
     * 
     * @param especie
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    /**
     * 
     * @return
     */
    public String getEspecie() {
        return especie;
    }
    /**
     * 
     * @param colorPelaje
     */
    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }
    /**
     * 
     * @return
     */
    public String getColorPelaje() {
        return colorPelaje;
    }
    /**
     * 
     * @param tamanof
     */
    public void setTamanof(float tamanof) {
        this.tamanof = tamanof;
    }
    /**
     * 
     * @return
     */
    public float getTamanof() {
        return tamanof;
    }
    /**
     * 
     * @param tamanoCola
     */
    public void setTamanoCola(float tamanoCola) {
        this.tamanoCola = tamanoCola;
    }
    /**
     * 
     * @return
     */
    public float getTamanoCola() {
        return tamanoCola;
    }
    /**
     * 
     * @param vMax
     */
    public void setvMax(float vMax) {
        this.vMax = vMax;
    }
    /**
     * 
     * @return
     */
    public float getvMax() {
        return vMax;
    }
    
}
