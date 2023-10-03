package hairdressingService;

public class Main {
    public static void main(String[] args) {

        Hairdressing corte = Hairdressing.CORTE;
        Hairdressing uñas = Hairdressing.UÑAS;
        Hairdressing tinter = Hairdressing.TINTER;

        System.out.println("Servicio: " + corte.getNombre());
        System.out.println("Descripción: " + corte.getDescricion());
        System.out.println("Precio: $" + corte.getPrecio());
        System.out.println("Mostrar Descripción: " + corte.mostrarDescripcionServicio());
        System.out.println();

        System.out.println("Servicio: " + uñas.getNombre());
        System.out.println("Descripción: " + uñas.getDescricion());
        System.out.println("Precio: $" + uñas.getPrecio());
        System.out.println("Mostrar Descripción: " + uñas.mostrarDescripcionServicio());
        System.out.println();

        System.out.println("Servicio: " + tinter.getNombre());
        System.out.println("Descripción: " + tinter.getDescricion());
        System.out.println("Precio: $" + tinter.getPrecio());
        System.out.println("Mostrar Descripción: " + tinter.mostrarDescripcionServicio());
    }
}



