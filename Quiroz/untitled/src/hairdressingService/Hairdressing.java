package hairdressingService;

public enum Hairdressing{
CORTE ("el siete", "fade en la parte central", 18000){
    @Override
    public String mostrarDescripcionServicio() {
        return "el siete";
    }
} ,
UÑAS ("redondas", "flores en las uñas", 10000){
    @Override
    public String mostrarDescripcionServicio() {
        return "redondas";
    }
} ,
TINTER ("rojo" , "parte superior", 20000) {
    @Override
    public String mostrarDescripcionServicio() {
        return "rojo";
    }
};
private String nombre;

private String descripcion;
private int precio;

    Hairdressing(String nombre, String descricion, int precio) {
        this.nombre = nombre;
        this.descripcion = descricion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescricion() {
        return descripcion;
    }

    public void setDescricion(String descricion) {
        this.descripcion = descricion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public abstract String mostrarDescripcionServicio();
}