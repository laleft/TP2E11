package ayp2.tp2.e11;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FacturaTest {
	
	public static void main(String[] args) {
        List<PorPagar> listaPorPagar = new ArrayList<>();
        
        // Agregar empleados
        Empleado empleado1 = new Empleado("Juan", 2000);
        Empleado empleado2 = new Empleado("Maria", 2500);
        listaPorPagar.add(empleado1);
        listaPorPagar.add(empleado2);
        
        // Agregar facturas
        List<Item> itemsFactura1 = new ArrayList<>();
        itemsFactura1.add(new Item("Producto 1", 100, 2));
        itemsFactura1.add(new Item("Producto 2", 50, 3));
        Factura factura1 = new Factura("Proveedor A", "F001", new Date(), itemsFactura1);
        listaPorPagar.add(factura1);
        
        List<Item> itemsFactura2 = new ArrayList<>();
        itemsFactura2.add(new Item("Producto 3", 80, 1));
        Factura factura2 = new Factura("Proveedor B", "F002", new Date(), itemsFactura2);
        listaPorPagar.add(factura2);
        
        // Calcular e imprimir los pagos
        double totalPago = 0;
        for (PorPagar porPagar : listaPorPagar) {
            totalPago += porPagar.obtenerPago();
        }
        System.out.println("Total a pagar: $" + totalPago);
    }

}
