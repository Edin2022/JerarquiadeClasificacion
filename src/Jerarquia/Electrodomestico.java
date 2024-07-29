
package Jerarquia;


public class Electrodomestico extends DispositivosElectronicos {
    private int consumoEnergetico;
    private String tipo;
    private boolean tieneGarantia;
    private String color;
    private String material;

    public Electrodomestico(String marca, String modelo, int anioFabricacion, double precio, boolean encendido, int consumoEnergetico, String tipo, boolean tieneGarantia, String color, String material) {
        super(marca, modelo, anioFabricacion, precio, encendido);
        this.consumoEnergetico = consumoEnergetico;
        this.tipo = tipo;
        this.tieneGarantia = tieneGarantia;
        this.color = color;
        this.material = material;
    }

    public void encender() {
        super.encender();
        System.out.println("Electrodomestico encendido");
    }

    public void apagar() {
        super.apagar();
        System.out.println("Electrodomestico apagado");
    }

    public void mostrarEspecificaciones() {
        System.out.println(obtenerInformacion() + ", Consumo Energetico: " + consumoEnergetico + "W, Tipo: " + tipo + ", Garantia: " + tieneGarantia + ", Color: " + color + ", Material: " + material);
    }

    public void ajustarConfiguracion() {
        System.out.println("Configuraciones ajustadas");
    }
}
