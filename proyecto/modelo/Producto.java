package proyecto.modelo;

public abstract class Producto implements Describible {
    private String marca;

    public Producto(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    public abstract String getDescripcion();

    
    public abstract String getDetalles();
}
