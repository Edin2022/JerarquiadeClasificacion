
package Jerarquia;


public class Computadora extends DispositivosElectronicos {
    private String procesador;
    private int ram;
    private int almacenamiento;
    private String sistemaOperativo;
    private boolean tieneTarjetaGrafica;

    public Computadora(String marca, String modelo, int anioFabricacion, double precio, boolean encendido, String procesador, int ram, int almacenamiento, String sistemaOperativo, boolean tieneTarjetaGrafica) {
        super(marca, modelo, anioFabricacion, precio, encendido);
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.sistemaOperativo = sistemaOperativo;
        this.tieneTarjetaGrafica = tieneTarjetaGrafica;
    }

    public void encender() {
        super.encender();
        System.out.println("Computadora encendida");
    }

    public void apagar() {
        super.apagar();
        System.out.println("Computadora apagada");
    }

    public void actualizarSO(String nuevoSO) {
        this.sistemaOperativo = nuevoSO;
    }

    public void mostrarEspecificaciones() {
        System.out.println(obtenerInformacion() + ", Procesador: " + procesador + ", RAM: " + ram + "GB, Almacenamiento: " + almacenamiento + "GB, Sistema Operativo: " + sistemaOperativo + ", Tiene Tarjeta Grafica: " + tieneTarjetaGrafica);
    }
}
