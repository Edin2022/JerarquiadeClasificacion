
package Jerarquia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        // Creación de objetos de ejemplo
        Laptop laptop = new Laptop("HP", "Pavilion", 2022, 800, false, "Intel i7", 16, 512, "Windows 10", true, 2.5, 8);
        Desktop desktop = new Desktop("Dell", "Inspiron", 2021, 600, false, "AMD Ryzen 5", 8, 1024, "Linux", false, "Mini Tower", true);
        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S21", 2021, 900, false, "Android", 4000, 4, true, true, true);
        Tablet tablet = new Tablet("Apple", "iPad Pro", 2020, 1000, false, "iOS", 6000, 2, true, true, true);
        Refrigerador refrigerador = new Refrigerador("LG", "Door-in-Door", 2019, 1200, false, 200, "Fridge", true, "Silver", "Metal", 500, true);

        while (!salir) {
            System.out.println("\nSeleccione una opcion:");
            System.out.println("1. Encender dispositivo");
            System.out.println("2. Apagar dispositivo");
            System.out.println("3. Mostrar especificaciones");
            System.out.println("4. Tomar foto (solo para dispositivos moviles)");
            System.out.println("5. Actualizar precio");
            System.out.println("6. Salir");
            System.out.print("Opcion: ");
            int opcion = scanner.nextInt();

            System.out.println("\nSeleccione el dispositivo:");
            System.out.println("1. Laptop");
            System.out.println("2. Desktop");
            System.out.println("3. Smartphone");
            System.out.println("4. Tablet");
            System.out.println("5. Refrigerador");
            System.out.print("Opcion: ");
            int dispositivo = scanner.nextInt();

            switch (opcion) {
                case 1:
                    switch (dispositivo) {
                        case 1: laptop.encender(); break;
                        case 2: desktop.encender(); break;
                        case 3: smartphone.encender(); break;
                        case 4: tablet.encender(); break;
                        case 5: refrigerador.encender(); break;
                        default: System.out.println("Opcion no valida"); break;
                    }
                    break;
                case 2:
                    switch (dispositivo) {
                        case 1: laptop.apagar(); break;
                        case 2: desktop.apagar(); break;
                        case 3: smartphone.apagar(); break;
                        case 4: tablet.apagar(); break;
                        case 5: refrigerador.apagar(); break;
                        default: System.out.println("Opcion no valida"); break;
                    }
                    break;
                case 3:
                    switch (dispositivo) {
                        case 1: laptop.mostrarEspecificaciones(); break;
                        case 2: desktop.mostrarEspecificaciones(); break;
                        case 3: smartphone.mostrarEspecificaciones(); break;
                        case 4: tablet.mostrarEspecificaciones(); break;
                        case 5: refrigerador.mostrarEspecificaciones(); break;
                        default: System.out.println("Opcion no valida"); break;
                    }
                    break;
                case 4:
                    if (dispositivo == 3 || dispositivo == 4) {
                        if (dispositivo == 3) {
                            smartphone.tomarFoto();
                        } else {
                            tablet.tomarFoto();
                        }
                    } else {
                        System.out.println("Opcion no valida para este dispositivo");
                    }
                    break;
                case 5:
                    System.out.print("Ingrese el nuevo precio: ");
                    double nuevoPrecio = scanner.nextDouble();
                    switch (dispositivo) {
                        case 1: laptop.actualizarPrecio(nuevoPrecio); break;
                        case 2: desktop.actualizarPrecio(nuevoPrecio); break;
                        case 3: smartphone.actualizarPrecio(nuevoPrecio); break;
                        case 4: tablet.actualizarPrecio(nuevoPrecio); break;
                        case 5: refrigerador.actualizarPrecio(nuevoPrecio); break;
                        default: System.out.println("Opcion no valida"); break;
                    }
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }

        scanner.close();
    }
}
