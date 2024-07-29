
package Jerarquia;


public class Desktop extends Computadora {
    private String tipoGabinete;
    private boolean tieneSistemaRefrigeracion;

    public Desktop(String marca, String modelo, int anioFabricacion, double precio, boolean encendido, String procesador, int ram, int almacenamiento, String sistemaOperativo, boolean tieneTarjetaGrafica, String tipoGabinete, boolean tieneSistemaRefrigeracion) {
        super(marca, modelo, anioFabricacion, precio, encendido, procesador, ram, almacenamiento, sistemaOperativo, tieneTarjetaGrafica);
        this.tipoGabinete = tipoGabinete;
        this.tieneSistemaRefrigeracion = tieneSistemaRefrigeracion;
    }

    public void mostrarEspecificaciones() {
        super.mostrarEspecificaciones();
        System.out.println("Tipo de Gabinete: " + tipoGabinete + ", Tiene Sistema de Refrigeracion: " + tieneSistemaRefrigeracion);
    }

    public void encender() {
        super.encender();
        System.out.println("Desktop encendida");
    }

    public void apagar() {
        super.apagar();
        System.out.println("Desktop apagada");
    }
}
