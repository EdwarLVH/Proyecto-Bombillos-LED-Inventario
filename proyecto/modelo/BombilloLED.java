package proyecto.modelo;

import java.util.Objects;

public class BombilloLED extends Producto {
    private String tipoConexion;
    private int gradosKelvin;
    private int potenciaLumens;
    private int cantidad;

    public BombilloLED(String tipoConexion, int gradosKelvin, int potenciaLumens, String marca, int cantidad) {
        super(marca);
        this.tipoConexion = tipoConexion;
        this.gradosKelvin = gradosKelvin;
        this.potenciaLumens = potenciaLumens;
        this.cantidad = cantidad;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }

    public int getGradosKelvin() {
        return gradosKelvin;
    }

    public void setGradosKelvin(int gradosKelvin) {
        this.gradosKelvin = gradosKelvin;
    }

    public int getPotenciaLumens() {
        return potenciaLumens;
    }

    public void setPotenciaLumens(int potenciaLumens) {
        this.potenciaLumens = potenciaLumens;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    public String getDescripcion() {
        return "Bombillo LED: " + getMarca() + ", " + tipoConexion + ", " + gradosKelvin + "K, " + potenciaLumens + " lumens";
    }

    
    public String getDetalles() {
        return "Tipo de Conexión: " + tipoConexion + ", Grados Kelvin: " + gradosKelvin + ", Potencia: " + potenciaLumens + " lumens, Cantidad: " + cantidad;
    }

    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BombilloLED that = (BombilloLED) o;
        return gradosKelvin == that.gradosKelvin && potenciaLumens == that.potenciaLumens &&
                Objects.equals(tipoConexion, that.tipoConexion) && Objects.equals(getMarca(), that.getMarca());
    }

    
    public int hashCode() {
        return Objects.hash(tipoConexion, gradosKelvin, potenciaLumens, getMarca());
    }
}
