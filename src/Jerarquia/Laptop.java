
package Jerarquia;


public class Laptop extends Computadora {
    private double peso;
    private int duracionBateria;

    public Laptop(String marca, String modelo, int anioFabricacion, double precio, boolean encendido, String procesador, int ram, int almacenamiento, String sistemaOperativo, boolean tieneTarjetaGrafica, double peso, int duracionBateria) {
        super(marca, modelo, anioFabricacion, precio, encendido, procesador, ram, almacenamiento, sistemaOperativo, tieneTarjetaGrafica);
        this.peso = peso;
        this.duracionBateria = duracionBateria;
    }

    public void mostrarEspecificaciones() {
        super.mostrarEspecificaciones();
        System.out.println("Peso: " + peso + "kg, Duracion de Bateria: " + duracionBateria + " horas");
    }

    public void encender() {
        super.encender();
        System.out.println("Laptop encendida");
    }

    public void apagar() {
        super.apagar();
        System.out.println("Laptop apagada");
    }
}

