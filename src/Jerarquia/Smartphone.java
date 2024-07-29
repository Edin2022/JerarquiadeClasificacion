
package Jerarquia;


public class Smartphone extends DispositivoMovil {
    private boolean tieneHuellaDactilar;

    public Smartphone(String marca, String modelo, int anioFabricacion, double precio, boolean encendido, String sistemaOperativo, int capacidadBateria, int camaras, boolean tieneNFC, boolean tiene5G, boolean tieneHuellaDactilar) {
        super(marca, modelo, anioFabricacion, precio, encendido, sistemaOperativo, capacidadBateria, camaras, tieneNFC, tiene5G);
        this.tieneHuellaDactilar = tieneHuellaDactilar;
    }

    public void mostrarEspecificaciones() {
        super.mostrarEspecificaciones();
        System.out.println("Huella Dactilar: " + tieneHuellaDactilar);
    }

    public void encender() {
        super.encender();
        System.out.println("Smartphone encendido");
    }

    public void apagar() {
        super.apagar();
        System.out.println("Smartphone apagado");
    }
}

