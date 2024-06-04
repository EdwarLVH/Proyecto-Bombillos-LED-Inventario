package proyecto;

import proyecto.interfaz.VentanaInventario;
import proyecto.modelo.BombilloLED;
import proyecto.modelo.Vehiculo;
import proyecto.servicio.Inventario;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        
        //Bombillos LED
        inventario.agregarProducto(new BombilloLED("h1", 3000, 8000, "C6", 2));
        inventario.agregarProducto(new BombilloLED("h3", 3000, 8000, "C6", 2));
        inventario.agregarProducto(new BombilloLED("h4", 3000, 8000, "C6", 2));
        inventario.agregarProducto(new BombilloLED("h7", 3000, 8000, "C6", 2));
        inventario.agregarProducto(new BombilloLED("h8/11", 3000, 8000, "C6", 2));
        inventario.agregarProducto(new BombilloLED("hb3", 3000, 8000, "C6", 2));
        inventario.agregarProducto(new BombilloLED("hb4", 3000, 8000, "C6", 2));
        inventario.agregarProducto(new BombilloLED("880", 3000, 8000, "C6", 2));
        inventario.agregarProducto(new BombilloLED("h1", 6000, 8000, "C6", 3));
        inventario.agregarProducto(new BombilloLED("h3", 6000, 8000, "C6", 3));
        inventario.agregarProducto(new BombilloLED("h4", 6000, 8000, "C6", 5));
        inventario.agregarProducto(new BombilloLED("h7", 6000, 8000, "C6", 3));
        inventario.agregarProducto(new BombilloLED("h8/11", 6000, 8000, "C6", 3));
        inventario.agregarProducto(new BombilloLED("hb3", 6000, 8000, "C6", 2));
        inventario.agregarProducto(new BombilloLED("hb4", 6000, 8000, "C6", 2));
        inventario.agregarProducto(new BombilloLED("880", 6000, 8000, "C6", 3));

        inventario.agregarProducto(new BombilloLED("h1", 6000, 3000, "Dual Vision", 2));
        inventario.agregarProducto(new BombilloLED("h4", 6000, 3000, "Dual Vision", 5));
        inventario.agregarProducto(new BombilloLED("h7", 6000, 3000, "Dual Vision", 2));
        inventario.agregarProducto(new BombilloLED("h8/11", 6000, 3000, "Dual Vision", 2));
        inventario.agregarProducto(new BombilloLED("hb3", 6000, 3000, "Dual Vision", 2));
        inventario.agregarProducto(new BombilloLED("hb4", 6000, 3000, "Dual Vision", 2));
        inventario.agregarProducto(new BombilloLED("h1", 8000, 3000, "Dual Vision", 2));
        inventario.agregarProducto(new BombilloLED("h4", 8000, 3000, "Dual Vision", 5));
        inventario.agregarProducto(new BombilloLED("h7", 8000, 3000, "Dual Vision", 2));
        inventario.agregarProducto(new BombilloLED("h8/11", 8000, 3000, "Dual Vision", 2));
        inventario.agregarProducto(new BombilloLED("hb3", 8000, 3000, "Dual Vision", 2));
        inventario.agregarProducto(new BombilloLED("hb4", 8000, 3000, "Dual Vision", 2));

        inventario.agregarProducto(new BombilloLED("h1", 6000, 2000, "Carshark", 2));
        inventario.agregarProducto(new BombilloLED("h4", 6000, 2000, "Carshark", 5));
        inventario.agregarProducto(new BombilloLED("h7", 6000, 2000, "Carshark", 2));
        inventario.agregarProducto(new BombilloLED("h8/11", 6000, 2000, "Carshark", 2));
        inventario.agregarProducto(new BombilloLED("hb3", 6000, 2000, "Carshark", 2));
        inventario.agregarProducto(new BombilloLED("hb4", 6000, 2000, "Carshark", 2));
      

         // Vehículos
         inventario.agregarProducto(new Vehiculo("Toyota", "Fortuner", "h11 y hb3", "hb3"));
         inventario.agregarProducto(new Vehiculo("Toyota", "Prado", "h4", "h11"));
         inventario.agregarProducto(new Vehiculo("Chevrolet", "Corsa", "h4", "h3"));
         inventario.agregarProducto(new Vehiculo("Chevrolet", "Aveo", "h4", "h3"));
         inventario.agregarProducto(new Vehiculo("Chevrolet", "Sail", "h4", "h11"));
         inventario.agregarProducto(new Vehiculo("Kia", "Picanto", "h4", "880"));
         inventario.agregarProducto(new Vehiculo("Hyundai", "i25", "h4", "880"));
         inventario.agregarProducto(new Vehiculo("Mazda", "3", "h7 y hb3", "h11"));
         inventario.agregarProducto(new Vehiculo("Mazda", "2", "h4", "h11"));
         inventario.agregarProducto(new Vehiculo("Renault", "Duster", "h7 y h1", "h11"));
         inventario.agregarProducto(new Vehiculo("Renault", "Sandero", "h4", "h11"));
         inventario.agregarProducto(new Vehiculo("volkswagen", "Jetta", "h7 y h7", "h7"));
         inventario.agregarProducto(new Vehiculo("volkswagen", "Gol", "h4", "9005"));
       
        
        VentanaInventario ventanaInventario = new VentanaInventario(inventario);
        ventanaInventario.setVisible(true);
    }
}
