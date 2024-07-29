
package Jerarquia;


public class Tablet extends DispositivoMovil {
    private boolean tieneStylus;

    public Tablet(String marca, String modelo, int anioFabricacion, double precio, boolean encendido, String sistemaOperativo, int capacidadBateria, int camaras, boolean tieneNFC, boolean tiene5G, boolean tieneStylus) {
        super(marca, modelo, anioFabricacion, precio, encendido, sistemaOperativo, capacidadBateria, camaras, tieneNFC, tiene5G);
        this.tieneStylus = tieneStylus;
    }

    public void mostrarEspecificaciones() {
        super.mostrarEspecificaciones();
        System.out.println("Tiene Stylus: " + tieneStylus);
    }

    public void encender() {
        super.encender();
        System.out.println("Tablet encendida");
    }

    public void apagar() {
        super.apagar();
        System.out.println("Tablet apagada");
    }
}

