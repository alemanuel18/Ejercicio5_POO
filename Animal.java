//  @ Ejercicio 5
//  @ File Name : Animal.java
//  @ Date : 04/10/2024
//  @ Author : Alejandro Manuel Jerez Melgar 24678
//

public abstract class Animal{
    /**
     * Atributos
     */
    protected String nombreCientifico;
    protected String habitad;
    protected int esperanzaVida;
    protected double costoMantenimietno;

    /**
     * 
     * @param nombreCientifico
     * @param habitad
     * @param esperanzaVida
     * @param costoMantenimietno
     */
    public Animal(String nombreCientifico, String habitad, int esperanzaVida, double costoMantenimietno){
        this.nombreCientifico=nombreCientifico;
        this.habitad=habitad;
        this.esperanzaVida=esperanzaVida;
        this.costoMantenimietno=costoMantenimietno;
    }

    /**
     * 
     * @param esperanzaVida
     */
    public void setEsperanzaVida(int esperanzaVida) {
        this.esperanzaVida = esperanzaVida;
    }
    /**
     * 
     * @return
     */
    public int getEsperanzaVida() {
        return esperanzaVida;
    }
    /**
     * 
     * @param habitad
     */
    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }
    /**
     * 
     * @return
     */
    public String getHabitad() {
        return habitad;
    }
    /**
     * 
     * @param nombreCientifico
     */
    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }
    /**
     * 
     * @return
     */
    public String getNombreCientifico() {
        return nombreCientifico;
    }
    /**
     * 
     * @param costoMantenimietno
     */   
    public void setCostoMantenimietno(double costoMantenimietno) {
        this.costoMantenimietno = costoMantenimietno;
    }
    /**
     * 
     * @return
     */
    public double getCostoMantenimietno() {
        return costoMantenimietno;
    }
    

}