//  @ Ejercicio 5
//  @ File Name : Funsionamiento.java
//  @ Date : 04/10/2024
//  @ Author : Alejandro Manuel Jerez Melgar 24678
//

import java.util.ArrayList;

public class Funsionamiento {

    /**
     * Atributos
     */
    private ArrayList<Animal>animales=new ArrayList<>();
    private ArrayList<String>habitad=new ArrayList<>();


    /**
     * 
     * @return
     */
    public ArrayList<Animal> getAnimales() {
        return animales;
    }
    /**
     * 
     * @return
     */
    public ArrayList<String> getHabitad() {
        return habitad;
    }

    /**
     * 
     * @param pesoKg
     * @param tamano
     * @param fom
     * @return
     */
    public float calcularAlimentacionD(float pesoKg,String tamano, String fom){
        float comida=0;

        if (tamano=="Pequeño" && fom=="Felino") {
            comida=pesoKg*15;
        } else if (tamano=="Mediano" && fom=="Felino") {
            comida=pesoKg*25;
        } else if (tamano=="Grande" && fom=="Felino") {
            comida=pesoKg*35;
        } else if (tamano=="Pequeño" && fom=="Primate") {
            comida=pesoKg*25;
        } else if (tamano=="Mediano" && fom=="Primate") {
            comida=pesoKg*20;
        } else if (tamano=="Grande" && fom=="Primate") {
            comida=pesoKg*15;
        }
        return comida;
    }

    /**
     * 
     * @param tamano
     * @param fom
     * @return
     */
    public float calcularAreaHabitad(String tamano, String fom){
        float area=0;

        if (tamano=="Pequeño" && fom=="Felino") {
            area=30;
        } else if (tamano=="Mediano" && fom=="Felino") {
            area=75;
        } else if (tamano=="Grande" && fom=="Felino") {
            area=150;
        } else if (tamano=="Pequeño" && fom=="Primate") {
            area=50;
        } else if (tamano=="Mediano" && fom=="Primate") {
            area=150;
        } else if (tamano=="Grande" && fom=="Primate") {
            area=400;
        }
        return area;
    }

    /**
     * 
     * @param tamano
     * @param alimetacionDiaria
     * @param dieta
     * @return
     */
    public double calcularCostoMantenimientoM(String tamano, float alimetacionDiaria, String dieta){
        double mantenimienoM=0;
        if (tamano=="Pequeño" && dieta=="Carnívora") {
            mantenimienoM= (100 + 0.11*alimetacionDiaria)*30;
        } else if (tamano=="Mediano" && dieta=="Carnívora") {
            mantenimienoM= (250 + 0.11*alimetacionDiaria)*30;
        } else if (tamano=="Grande" && dieta=="Carnívora") {
            mantenimienoM= (400 + 0.11*alimetacionDiaria)*30;
        } else if (tamano=="Pequeño" && dieta=="Omnívora") {
            mantenimienoM= (100 + 0.15*alimetacionDiaria)*30;
        } else if (tamano=="Mediano" && dieta=="Omnívora") {
            mantenimienoM= (250 + 0.15*alimetacionDiaria)*30;
        } else if (tamano=="Grande" && dieta=="Carnívora") {
            mantenimienoM= (400 + 0.15*alimetacionDiaria)*30;
        }
        return mantenimienoM;
    }

    /**
     * 
     * @param animal
     */
    public void agregarAnimal(Animal animal){
        animales.add(animal);
    }

    /**
     * 
     * @param nombre
     */
    public void eliminarAnimal(String nombre){
        for(Animal animal: animales)
        if (animal.getNombreCientifico().equals(nombre)) {
            animales.remove(animal);   
        }
    }

    /**
     * 
     * @param nombreCientifico
     * @param habitad
     * @param esperanzaVida
     * @param nuevoCostoMantenimiento
     */
    public void modificarAnimal(String nombreCientifico, String habitad, int esperanzaVida, float nuevoCostoMantenimiento) {
        for (Animal animal : animales) {
            if (animal.getNombreCientifico().equalsIgnoreCase(nombreCientifico)) {
                animal.setHabitad(habitad);
                animal.setEsperanzaVida(esperanzaVida);
                animal.setCostoMantenimietno(nuevoCostoMantenimiento);
            }
        }
    }
    
    /**
     * 
     * @param nombre
     */
    public void agregarHabitad(String nombre){
        habitad.add(nombre);
    }

    /**
     * 
     * @param areaHabitad
     * @return
     */
    public float costoConstruccionArrea(float areaHabitad){
        float costo=0;

        costo= areaHabitad*50;

        return costo;
    }

    /**
     * 
     * @param nombre
     * @return
     */
    public String mostrarInformacionAnimalEspecifico(String nombre) {
        for (Animal animal : animales) {
            if (animal instanceof Felino) {
                Felino felino = (Felino) animal; 
                if (felino.getNombreCientifico().equalsIgnoreCase(nombre)) {
                    return "\nAnimal: " + felino.getNombreCientifico() + "\n" + "Tipo: Felino\n" + "Costo de mantenimiento mensual: Q" + felino.getCostoMantenimietno() + "\n" + "Tamaño del recinto: " + felino.getAreaHabitad() + " metros cuadrados\n" + "Cantidad diaria de comida: " + felino.getAlimetacionDiaria() + " kg\n";
                }
            }
        }
    
        for (Animal animal : animales) {
            if (animal instanceof Primate) {
                Primate primate = (Primate) animal;
                if (primate.getNombreCientifico().equalsIgnoreCase(nombre)) {
                    return "\nAnimal: " + primate.getNombreCientifico() + "\n" + "Tipo: Primate\n" + "Costo de mantenimiento mensual: Q" + primate.getCostoMantenimietno() + "\n" + "Tamaño del recinto: " + primate.getAreaHabitad() + " metros cuadrados\n" + "Cantidad diaria de comida: " + primate.getAlimetacionDiaria() + " kg\n";
                }
            }
        }
        
    
        return "No se deberia poder ver esto";
    }

    /**
     * 
     * @param nombre
     * @return
     */
    public boolean revisarExistenciaHabitad(String nombre){
        for(String habitadS : habitad){
            if (habitadS.equals(nombre)) {
                return true;
            }
        }
        return false;

    }
    

}
