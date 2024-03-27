package ayp2.tp2.e11;

import java.util.Arrays;

//Clase Factura que implementa la interfaz PorPagar.
public class Factura implements PorPagar {

	// Atributos de la clase Factura
	private static final int CANTIDAD_ITEMS = 10;
	private String proveedor;
	private int numero;
	private String fecha;

	private int cantArticulos = 0;
	private Item[] articulos;

	// Constructor
	public Factura(String proveedor, int numero, String fecha) {
		this.proveedor = proveedor;
		this.numero = numero;
		this.fecha = fecha;
		articulos = new Item[CANTIDAD_ITEMS];
	}

	// Metodo implementado por la interfaz
	// Calcula el total de la factura
	public double obtenerPago() {
		double total = 0.0;
		// Recorre el array y antes de acumular el total
		// verifica que exista una instancia de Item en esa posición
		for(int x = 0; x < articulos.length; x++) {
			if(articulos[x] != null) {				
				total += articulos[x].cantidad * articulos[x].precioUnitario;
			}
		}
		return total;
	}

	// Metodo para agregar un articulo al arreglo de tipo Item
	public void agregarItem(String descripcion, int cantidad, double precioUnitario) throws IndexOutOfBoundsException {
		if (cantArticulos > CANTIDAD_ITEMS)
			throw new IndexOutOfBoundsException("Factura completa");

		this.articulos[cantArticulos++] = new Item(descripcion, cantidad, precioUnitario);
	}

	@Override
	public String toString() {
		return "Factura [proveedor=" + proveedor + ", numero=" + numero + ", fecha=" + fecha + ", cantArticulos="
				+ cantArticulos + ", articulos=" + Arrays.toString(articulos) + "]";
	}

	// Clase Item
	private class Item {

		private String descripcion;
		private int cantidad;
		private double precioUnitario;

		public Item(String descripcion, int cantidad, double precioUnitario) {
			this.descripcion = descripcion;
			this.cantidad = cantidad;
			this.precioUnitario = precioUnitario;
		}

		@Override
		public String toString() {
			return "Item [descripcion=" + descripcion + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario
					+ "]";
		}

	}

}
