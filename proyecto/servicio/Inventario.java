package proyecto.servicio;

import proyecto.modelo.BombilloLED;
import proyecto.modelo.Producto;
import proyecto.modelo.Vehiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    public List<BombilloLED> consultarPorTipoConexion(String tipoConexion) {
        return productos.stream()
                .filter(p -> p instanceof BombilloLED && ((BombilloLED) p).getTipoConexion().equalsIgnoreCase(tipoConexion))
                .map(p -> (BombilloLED) p)
                .collect(Collectors.toList());
    }

    public List<BombilloLED> consultarPorGradosKelvin(int gradosKelvin) {
        return productos.stream()
                .filter(p -> p instanceof BombilloLED && ((BombilloLED) p).getGradosKelvin() == gradosKelvin)
                .map(p -> (BombilloLED) p)
                .collect(Collectors.toList());
    }

    public List<BombilloLED> consultarPorPotencia(int potencia) {
        return productos.stream()
                .filter(p -> p instanceof BombilloLED && ((BombilloLED) p).getPotenciaLumens() == potencia)
                .map(p -> (BombilloLED) p)
                .collect(Collectors.toList());
    }

    public List<Producto> consultarPorMarca(String marca) {
        return productos.stream()
                .filter(p -> p.getMarca().equalsIgnoreCase(marca))
                .collect(Collectors.toList());
    }

    public List<Vehiculo> consultarPorMarcaVehiculo(String marca) {
        return productos.stream()
                .filter(p -> p instanceof Vehiculo && p.getMarca().equalsIgnoreCase(marca))
                .map(p -> (Vehiculo) p)
                .collect(Collectors.toList());
    }
}
