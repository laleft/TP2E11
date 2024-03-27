package ayp2.tp2.e11;

/*Esta clase es para probar las clases Factura y Empleado, poniendolos en el arreglo llamado 'pagos'
 * que es de tipo PorPagar.
 */
public class PruebaPagos {

	public static void main(String[] args) {

		// Empiezo a instanciar los objetos de clase Facturas y Empleados
		PorPagar pagos[] = new PorPagar[10];

		// Cargar cinco empleados y cinco facturas
		
		Factura factura1 = new Factura("Fortin Republica", 1575, "2024-03-25");
		factura1.agregarItem("Tornillo", 50, 33.5);
		factura1.agregarItem("Clavos", 100, 15.0);
		
		Factura factura2 = new Factura("Casa Mickey", 12582, "2024-03-24");
		factura2.agregarItem("Desodorante Ambiente", 4, 1999.99);
		factura2.agregarItem("Desinfectante Piso", 1, 1499.99);
		factura2.agregarItem("Aromat.", 12, 450);
		
		Factura factura3 = new Factura("Repuestos Patagonia", 614, "2024-03-25");
		factura3.agregarItem("Bendix Ford F-100", 1, 75000.00);
		
		Factura factura4 = new Factura("La Anonima", 2587523, "2024-03-20");
		factura4.agregarItem("Yerba Mate Playadito x 1kg", 10, 4999.98);
		factura4.agregarItem("Cafe Cabrales x 500gr", 5, 6102.60);
		factura4.agregarItem("Rollo papel Sussex x 3", 6, 1050.85);

		Factura factura5 = new Factura("NS Libreria", 8323, "2024-03-25");
		factura5.agregarItem("Lapicera BIC Round x 12", 1, 4700.00);
		factura5.agregarItem("Resma A4 75gr x 500", 10, 6521.00);
		
		Empleado empleado1 = new Empleado(1234, "Fernando", null, 30, 5000);
		Empleado empleado2 = new Empleado(1235, "Roberto", empleado1, 35, 3500);
		Empleado empleado3 = new Empleado(1235, "Joaquin", empleado2, 40, 2500);
		Empleado empleado4 = new Empleado(1235, "Carlos", empleado2, 40, 2500);
		Empleado empleado5 = new Empleado(1235, "Yesica", empleado4, 25, 1500);


		// Asignar los objetos creados a un lugar del arreglo 'pagos'
		
		pagos[0] = factura1;
		pagos[1] = factura2;
		pagos[2] = factura3;
		pagos[3] = factura4;
		pagos[4] = factura5;
		
		pagos[5] = empleado1;
		pagos[6] = empleado2;
		pagos[7] = empleado3;
		pagos[8] = empleado4;
		pagos[9] = empleado5;
		
		
		// Escribir el resultado que tienen que pagar cada uno
		for (int i = 0; i < pagos.length; i++) {
			System.out.printf("Importes a pagar: %.02f\n", pagos[i].obtenerPago());
		}
	}
}
