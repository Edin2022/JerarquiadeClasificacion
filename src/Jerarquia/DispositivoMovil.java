
package Jerarquia;


public class DispositivoMovil extends DispositivosElectronicos {
    private String sistemaOperativo;
    private int capacidadBateria;
    private int camaras;
    private boolean tieneNFC;
    private boolean tiene5G;

    public DispositivoMovil(String marca, String modelo, int anioFabricacion, double precio, boolean encendido, String sistemaOperativo, int capacidadBateria, int camaras, boolean tieneNFC, boolean tiene5G) {
        super(marca, modelo, anioFabricacion, precio, encendido);
        this.sistemaOperativo = sistemaOperativo;
        this.capacidadBateria = capacidadBateria;
        this.camaras = camaras;
        this.tieneNFC = tieneNFC;
        this.tiene5G = tiene5G;
    }

    public void encender() {
        super.encender();
        System.out.println("Dispositivo movil encendido");
    }

    public void apagar() {
        super.apagar();
        System.out.println("Dispositivo movil apagado");
    }

    public void tomarFoto() {
        System.out.println("Foto tomada con " + camaras + " camaras");
    }

    public void mostrarEspecificaciones() {
        System.out.println(obtenerInformacion() + ", SO: " + sistemaOperativo + ", Bateria: " + capacidadBateria + "mAh, Camaras: " + camaras + ", NFC: " + tieneNFC + ", 5G: " + tiene5G);
    }
}
