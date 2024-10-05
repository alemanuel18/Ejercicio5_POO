//  @ Ejercicio 5
//  @ File Name : Primate.java
//  @ Date : 04/10/2024
//  @ Author : Alejandro Manuel Jerez Melgar 24678
//

class Primate extends Mamifero{
    /**
     * Atributos
     */
    protected String especie;
    protected int inteligenciaLV;
    protected String estructuraSocial;
    protected float tamanoCerebro;

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
     * @param inteligenciaLV
     * @param estructuraSocial
     * @param tamanoCerebro
     */
    public Primate(String nombreCientifico, String habitad, int esperanzaVida, double costoMantenimietno, float pesoKg, int tiempoGestion, boolean pelibroExticion, String pelaje, int criasCamada, String dieta, String tamano, float alimetacionDiaria, float areaHabitad, String especie, int inteligenciaLV, String estructuraSocial, float tamanoCerebro){
        super(nombreCientifico, habitad, esperanzaVida, costoMantenimietno, pesoKg, tiempoGestion,pelibroExticion, pelaje, criasCamada, dieta,tamano, alimetacionDiaria,areaHabitad);
        this.especie=especie;
        this.inteligenciaLV=inteligenciaLV;
        this.estructuraSocial=estructuraSocial;
        this.tamanoCerebro=tamanoCerebro;
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
     * @param inteligenciaLV
     */
    public void setInteligenciaLV(int inteligenciaLV) {
        this.inteligenciaLV = inteligenciaLV;
    }
    /**
     * 
     * @return
     */
    public int getInteligenciaLV() {
        return inteligenciaLV;
    }
    /**
     * 
     * @param estructuraSocial
     */
    public void setEstructuraSocial(String estructuraSocial) {
        this.estructuraSocial = estructuraSocial;
    }
    /**
     * 
     * @return
     */
    public String getEstructuraSocial() {
        return estructuraSocial;
    }
    /**
     * 
     * @param tamanoCerebro
     */
    public void setTamanoCerebro(int tamanoCerebro) {
        this.tamanoCerebro = tamanoCerebro;
    }
    /**
     * 
     * @return
     */
    public float getTamanoCerebro() {
        return tamanoCerebro;
    }
    
}
