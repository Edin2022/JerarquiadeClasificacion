
package Jerarquia;


public class DispositivosElectronicos {
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private double precio;
    private boolean encendido;

    public DispositivosElectronicos(String marca, String modelo, int anioFabricacion, double precio, boolean encendido) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
        this.encendido = encendido;
    }

    public void encender() {
        this.encendido = true;
        System.out.println("Dispositivo encendido");
    }

    public void apagar() {
        this.encendido = false;
        System.out.println("Dispositivo apagado");
    }

    public String obtenerInformacion() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anioFabricacion + ", Precio: " + precio;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void actualizarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }
}
