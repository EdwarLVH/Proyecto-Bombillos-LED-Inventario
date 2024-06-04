package proyecto.modelo;

import java.util.Objects;

public class Vehiculo extends Producto {
    private String modelo;
    private String bombilloPrincipal;
    private String bombilloExploradora;

    public Vehiculo(String marca, String modelo, String bombilloPrincipal, String bombilloExploradora) {
        super(marca);
        this.modelo = modelo;
        this.bombilloPrincipal = bombilloPrincipal;
        this.bombilloExploradora = bombilloExploradora;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getBombilloPrincipal() {
        return bombilloPrincipal;
    }

    public void setBombilloPrincipal(String bombilloPrincipal) {
        this.bombilloPrincipal = bombilloPrincipal;
    }

    public String getBombilloExploradora() {
        return bombilloExploradora;
    }

    public void setBombilloExploradora(String bombilloExploradora) {
        this.bombilloExploradora = bombilloExploradora;
    }

    
    public String getDescripcion() {
        return "Vehículo: " + getMarca() + " " + modelo + ", Bombillo Principal: " + bombilloPrincipal + ", Bombillo Exploradora: " + bombilloExploradora;
    }

    
    public String getDetalles() {
        return "Marca: " + getMarca() + ", Modelo: " + modelo + ", Bombillo Principal: " + bombilloPrincipal + ", Bombillo Exploradora: " + bombilloExploradora;
    }

   
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(getMarca(), vehiculo.getMarca()) && Objects.equals(modelo, vehiculo.modelo);
    }

    
    public int hashCode() {
        return Objects.hash(getMarca(), modelo);
    }
}
