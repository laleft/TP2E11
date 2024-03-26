package ayp2.tp2.e11;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

interface PorPagar {
    double obtenerPago();
}

class Item {
    private String descripcion;
    private double precioUnitario;
    private int cantidad;

    public Item(String descripcion, double precioUnitario, int cantidad) {
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public double calcularTotal() {
        return precioUnitario * cantidad;
    }
}

class Factura implements PorPagar {
    private String nombreProveedor;
    private String numeroFactura;
    private Date fechaCompra;
    private List<Item> items;

    public Factura(String nombreProveedor, String numeroFactura, Date fechaCompra, List<Item> items) {
        this.nombreProveedor = nombreProveedor;
        this.numeroFactura = numeroFactura;
        this.fechaCompra = fechaCompra;
        this.items = items;
    }

    @Override
    public double obtenerPago() {
        double total = 0;
        for (Item item : items) {
            total += item.calcularTotal();
        }
        return total;
    }
}

class Empleado implements PorPagar {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public double obtenerPago() {
        return salario;
    }
}