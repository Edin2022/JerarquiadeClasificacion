
package Jerarquia;


public class Refrigerador extends Electrodomestico {
    private double capacidadLitros;
    private boolean tieneDispensadorAgua;

    public Refrigerador(String marca, String modelo, int anioFabricacion, double precio, boolean encendido, int consumoEnergetico, String tipo, boolean tieneGarantia, String color, String material, double capacidadLitros, boolean tieneDispensadorAgua) {
        super(marca, modelo, anioFabricacion, precio, encendido, consumoEnergetico, tipo, tieneGarantia, color, material);
        this.capacidadLitros = capacidadLitros;
        this.tieneDispensadorAgua = tieneDispensadorAgua;
    }

    public void mostrarEspecificaciones() {
        super.mostrarEspecificaciones();
        System.out.println("Capacidad: " + capacidadLitros + "L, Dispensador de Agua: " + tieneDispensadorAgua);
    }

    public void encender() {
        super.encender();
        System.out.println("Refrigerador encendido");
    }

    public void apagar() {
        super.apagar();
        System.out.println("Refrigerador apagado");
    }
}

