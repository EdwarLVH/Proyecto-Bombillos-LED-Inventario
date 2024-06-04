package proyecto.interfaz;

import proyecto.modelo.Describible;
import proyecto.modelo.Producto;
import proyecto.modelo.BombilloLED;
import proyecto.modelo.Vehiculo;
import proyecto.servicio.Inventario;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class VentanaInventario extends JFrame {
    private Inventario inventario;

    public VentanaInventario(Inventario inventario) {
        this.inventario = inventario;
        inicializarVentana();
    }

    private void inicializarVentana() {
        setTitle("Sistema de Inventario de Bombillos LED");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 1));

        JButton btnAgregar = new JButton("Agregar Producto");
        JButton btnEliminar = new JButton("Eliminar Producto");
        JButton btnTipoConexion = new JButton("Consultar por Tipo de Conexión");
        JButton btnGradosKelvin = new JButton("Consultar por Grados Kelvin");
        JButton btnPotencia = new JButton("Consultar por Potencia");
        JButton btnMarca = new JButton("Consultar por Marca");
        JButton btnVehiculo = new JButton("Consultar por Marca de Vehículo");

        panel.add(btnAgregar);
        panel.add(btnEliminar);
        panel.add(btnTipoConexion);
        panel.add(btnGradosKelvin);
        panel.add(btnPotencia);
        panel.add(btnMarca);
        panel.add(btnVehiculo);

        add(panel);

      
        btnAgregar.addActionListener(e -> agregarProducto());
        btnEliminar.addActionListener(e -> eliminarProducto());
        btnTipoConexion.addActionListener(e -> {
            String tipoConexion = JOptionPane.showInputDialog("Ingrese el tipo de conexión:");
            List<BombilloLED> bombillos = inventario.consultarPorTipoConexion(tipoConexion);
            mostrarResultados(new ArrayList<>(bombillos));
        });

        btnGradosKelvin.addActionListener(e -> {
            int gradosKelvin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los grados Kelvin:"));
            List<BombilloLED> bombillos = inventario.consultarPorGradosKelvin(gradosKelvin);
            mostrarResultados(new ArrayList<>(bombillos));
        });

        btnPotencia.addActionListener(e -> {
            int potencia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la potencia en lumens:"));
            List<BombilloLED> bombillos = inventario.consultarPorPotencia(potencia);
            mostrarResultados(new ArrayList<>(bombillos));
        });

        btnMarca.addActionListener(e -> {
            String marca = JOptionPane.showInputDialog("Ingrese la marca:");
            List<Producto> productos = inventario.consultarPorMarca(marca);
            mostrarResultados(new ArrayList<>(productos));
        });

        btnVehiculo.addActionListener(e -> {
            String marcaVehiculo = JOptionPane.showInputDialog("Ingrese la marca del vehículo:");
            List<Vehiculo> vehiculos = inventario.consultarPorMarcaVehiculo(marcaVehiculo);
            mostrarResultados(new ArrayList<>(vehiculos));
        });
    }

    private void agregarProducto() {
        String tipo = JOptionPane.showInputDialog("Ingrese el tipo de producto (BombilloLED/Vehiculo):");
        if (tipo.equalsIgnoreCase("BombilloLED")) {
            String tipoConexion = JOptionPane.showInputDialog("Ingrese el tipo de conexión:");
            int gradosKelvin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los grados Kelvin:"));
            int potenciaLumens = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la potencia en lumens:"));
            String marca = JOptionPane.showInputDialog("Ingrese la marca:");
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad:"));

            BombilloLED nuevoBombillo = new BombilloLED(tipoConexion, gradosKelvin, potenciaLumens, marca, cantidad);
            inventario.agregarProducto(nuevoBombillo);

            JOptionPane.showMessageDialog(this, "Bombillo agregado exitosamente.");
        } else if (tipo.equalsIgnoreCase("Vehiculo")) {
            String marca = JOptionPane.showInputDialog("Ingrese la marca del vehículo:");
            String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
            String bombilloPrincipal = JOptionPane.showInputDialog("Ingrese el bombillo principal:");
            String bombilloExploradora = JOptionPane.showInputDialog("Ingrese el bombillo exploradora:");

            Vehiculo nuevoVehiculo = new Vehiculo(marca, modelo, bombilloPrincipal, bombilloExploradora);
            inventario.agregarProducto(nuevoVehiculo);

            JOptionPane.showMessageDialog(this, "Vehículo agregado exitosamente.");
        }
    }

    private void eliminarProducto() {
        String tipo = JOptionPane.showInputDialog("Ingrese el tipo de producto a eliminar (BombilloLED/Vehiculo):");
        if (tipo.equalsIgnoreCase("BombilloLED")) {
            String tipoConexion = JOptionPane.showInputDialog("Ingrese el tipo de conexión del bombillo a eliminar:");
            int gradosKelvin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los grados Kelvin del bombillo a eliminar:"));
            int potenciaLumens = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la potencia en lumens del bombillo a eliminar:"));
            String marca = JOptionPane.showInputDialog("Ingrese la marca del bombillo a eliminar:");

            BombilloLED bombilloAEliminar = new BombilloLED(tipoConexion, gradosKelvin, potenciaLumens, marca, 0);
            inventario.eliminarProducto(bombilloAEliminar);

            JOptionPane.showMessageDialog(this, "Bombillo eliminado exitosamente.");
        } else if (tipo.equalsIgnoreCase("Vehiculo")) {
            String marca = JOptionPane.showInputDialog("Ingrese la marca del vehículo a eliminar:");
            String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo a eliminar:");

            Vehiculo vehiculoAEliminar = new Vehiculo(marca, modelo, "", "");
            inventario.eliminarProducto(vehiculoAEliminar);

            JOptionPane.showMessageDialog(this, "Vehículo eliminado exitosamente.");
        }
    }

    private void mostrarResultados(List<? extends Describible> resultados) {
        StringBuilder mensaje = new StringBuilder();
        for (Describible item : resultados) {
            mensaje.append(item.getDescripcion()).append("\n");
        }
        JOptionPane.showMessageDialog(this, mensaje.toString());
    }
}
